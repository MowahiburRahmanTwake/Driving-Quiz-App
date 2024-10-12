package com.twakeapps.drivingquizapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.twakeapps.drivingquizapp.databinding.ActivityMainBinding
import com.twakeapps.drivingquizapp.ui.AboutFragment
import com.twakeapps.drivingquizapp.ui.StartFragment

class MainActivity : AppCompatActivity()
{
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addFragment(StartFragment(),this)

        binding.bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menuQuiz ->{
                    addFragment(StartFragment(),this)

                }
                R.id.menuAbout ->{
                    addFragment(AboutFragment(),this)

                }
                else->{}

            }
            true
        }


    }
}