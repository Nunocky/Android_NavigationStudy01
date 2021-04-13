package org.nunocky.navigationstudy01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.nunocky.navigationstudy01.databinding.FragmentSubX1Binding
import org.nunocky.navigationstudy01.util.autoCleared

/**
 * A simple [Fragment] subclass.
 * Use the [SubX1Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SubX1Fragment : Fragment() {
    private var binding by autoCleared<FragmentSubX1Binding>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSubX1Binding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        binding.btnNext.setOnClickListener {

            when (findNavController().currentDestination?.id) {
                R.id.sub1_X1 -> {
                    findNavController().navigate(R.id.action_sub1_X1_to_sub1_X2)
                }

                R.id.sub2_X1 -> {
                    findNavController().navigate(R.id.action_sub2_X1_to_sub2_X2)
                }
            }
        }

        return binding.root
    }
}