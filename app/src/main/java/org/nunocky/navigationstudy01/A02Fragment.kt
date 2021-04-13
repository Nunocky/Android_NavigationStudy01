package org.nunocky.navigationstudy01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import org.nunocky.navigationstudy01.databinding.FragmentA02Binding
import org.nunocky.navigationstudy01.util.autoCleared

class A02Fragment : Fragment() {

    private val args: A02FragmentArgs by navArgs()

    private val viewModel: A02ViewModel by viewModels()
    private var binding by autoCleared<FragmentA02Binding>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentA02Binding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_a02Fragment_to_sub1_X1)
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

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.setCount(args.count)
    }
}