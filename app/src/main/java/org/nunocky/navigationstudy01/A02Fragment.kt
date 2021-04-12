package org.nunocky.navigationstudy01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import org.nunocky.navigationstudy01.databinding.A02FragmentBinding

class A02Fragment : Fragment() {

    companion object {
        fun newInstance() = A02Fragment()
    }

    private val viewModel: A02ViewModel by viewModels()
    private lateinit var binding: A02FragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = A02FragmentBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.a03Fragment)
        }

        binding.btnPrev.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.btnDec.setOnClickListener {
            viewModel.decrement()
        }

        binding.btnInc.setOnClickListener {
            viewModel.increment()
        }

        return binding.root
    }
}