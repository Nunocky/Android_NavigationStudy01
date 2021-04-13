package org.nunocky.navigationstudy01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.nunocky.navigationstudy01.databinding.FragmentA04Binding
import org.nunocky.navigationstudy01.databinding.FragmentSubX2Binding
import org.nunocky.navigationstudy01.util.autoCleared

/**
 * A simple [Fragment] subclass.
 * Use the [A04Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class A04Fragment : Fragment() {
    private var binding by autoCleared<FragmentA04Binding>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentA04Binding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        binding.button2.setOnClickListener {
            findNavController().popBackStack(R.id.a01Fragment, false)
        }

        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance() = A04Fragment()
    }
}