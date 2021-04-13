package org.nunocky.navigationstudy01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import org.nunocky.navigationstudy01.databinding.FragmentSubX1Binding
import org.nunocky.navigationstudy01.databinding.FragmentSubX2Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SubX2Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SubX2Fragment : Fragment() {
    private lateinit var binding: FragmentSubX2Binding

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