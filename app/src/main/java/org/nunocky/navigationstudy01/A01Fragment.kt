package org.nunocky.navigationstudy01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import org.nunocky.navigationstudy01.databinding.A01FragmentBinding

class A01Fragment : Fragment() {

    companion object {
        fun newInstance() = A01Fragment()
    }

    private lateinit var activityViewModel: MainViewModel
    private val viewModel: A01ViewModel by viewModels()
    private lateinit var binding: A01FragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        activityViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        binding = A01FragmentBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.btnNext.setOnClickListener {
            val action =
                A01FragmentDirections.actionA01FragmentToA02Fragment(count = viewModel.count.value!!)
            findNavController().navigate(action)
        }

        binding.btnDec.setOnClickListener {
            viewModel.decrement()
        }

        binding.btnInc.setOnClickListener {
            viewModel.increment()
        }

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        activityViewModel.quitButtonVisible.value = false
    }

    override fun onPause() {
        super.onPause()
        activityViewModel.quitButtonVisible.value = true
    }
}