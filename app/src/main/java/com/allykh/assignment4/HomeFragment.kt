package com.allykh.assignment4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.allykh.assignment4.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.FacultyButton.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_facultyFragment)
        }

        binding.ResearchButton.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_researchFragment)
        }

        // Inflate the layout for this fragment
        return binding.root
    }
}