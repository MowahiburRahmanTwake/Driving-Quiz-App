package com.twakeapps.drivingquizapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.twakeapps.drivingquizapp.addFragment
import com.twakeapps.drivingquizapp.databinding.FragmentStartBinding

class StartFragment:Fragment()
{
    private lateinit var binding : FragmentStartBinding
    override fun onCreateView(inflater : LayoutInflater, container : ViewGroup?, savedInstanceState : Bundle?) : View? {
        binding = FragmentStartBinding.inflate(inflater,container,false)
        return binding.root


    }

    override fun onViewCreated(view : View, savedInstanceState : Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            addFragment(QuizFragment(),requireActivity())
        }



    }


}