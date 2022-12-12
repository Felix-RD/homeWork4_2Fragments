package com.drv.homework4_2fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.drv.homework4_2fragments.databinding.FragmentFirstBinding
import com.drv.homework4_2fragments.databinding.FragmentSecondBinding


class secondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backBtn.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }

}