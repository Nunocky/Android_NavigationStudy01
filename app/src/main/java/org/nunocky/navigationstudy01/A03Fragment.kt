package org.nunocky.navigationstudy01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import org.nunocky.navigationstudy01.databinding.FragmentA03Binding

class A03Fragment : Fragment() {

    companion object {
        fun newInstance() = A03Fragment()
    }

    private val args: A03FragmentArgs by navArgs()

    private val viewModel: A03ViewModel by viewModels()
    private var binding by autoCleared<FragmentA03Binding>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentA03Binding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.button.setOnClickListener {
            val action =
                A03FragmentDirections.actionA03FragmentToSubNav(destination = R.id.a04Fragment)
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.setCount(args.count)
    }
}