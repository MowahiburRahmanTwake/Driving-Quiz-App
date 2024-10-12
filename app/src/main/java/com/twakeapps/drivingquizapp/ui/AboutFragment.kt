package com.twakeapps.drivingquizapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.twakeapps.drivingquizapp.databinding.FragmentAboutBinding
import com.twakeapps.drivingquizapp.databinding.FragmentQuizBinding
import com.twakeapps.drivingquizapp.databinding.FragmentStartBinding

class AboutFragment: Fragment()
{
    private lateinit var binding : FragmentAboutBinding
    override fun onCreateView(inflater : LayoutInflater, container : ViewGroup?, savedInstanceState : Bundle?) : View? {
        binding = FragmentAboutBinding.inflate(inflater,container,false)
        return binding.root


    }

    override fun onViewCreated(view : View, savedInstanceState : Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)



    }


}