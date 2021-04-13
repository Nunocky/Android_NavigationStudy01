package org.nunocky.navigationstudy01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import org.nunocky.navigationstudy01.databinding.FragmentSubX1Binding

/**
 * A simple [Fragment] subclass.
 * Use the [SubX1Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SubX1Fragment : Fragment() {
    private var _binding: FragmentSubX1Binding? = null
    private val binding get() = _binding!!

    private val args: SubX1FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSubX1Binding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        binding.btnNext.setOnClickListener {
            val action =
                SubX1FragmentDirections.actionSubX1FragmentToSubX2Fragment(destination = args.destination)
            findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}