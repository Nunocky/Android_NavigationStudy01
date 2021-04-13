package org.nunocky.navigationstudy01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.nunocky.navigationstudy01.databinding.FragmentSubX2Binding
import org.nunocky.navigationstudy01.util.autoCleared

class SubX2Fragment : Fragment() {
    private var binding by autoCleared<FragmentSubX2Binding>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSubX2Binding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        binding.btnDone.setOnClickListener {

            when (findNavController().currentDestination?.id) {
                R.id.sub1_X2 -> {
                    findNavController().navigate(R.id.action_sub1_X2_to_a03Fragment)
                }

                R.id.sub2_X2 -> {
                    findNavController().navigate(R.id.action_sub2_X2_to_a04Fragment)
                }
            }
        }
        return binding.root
    }
}