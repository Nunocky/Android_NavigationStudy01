package org.nunocky.navigationstudy01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import org.nunocky.navigationstudy01.databinding.FragmentSubX2Binding

class SubX2Fragment : Fragment() {
    private var binding by autoCleared<FragmentSubX2Binding>()

    private val args: SubX1FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSubX2Binding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        binding.btnDone.setOnClickListener {
            val destination = args.destination
            findNavController().navigate(destination)
        }
        return binding.root
    }
}