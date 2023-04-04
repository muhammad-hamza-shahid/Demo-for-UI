package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.FragmentDesignBinding

class MotionLayoutActivity : AppCompatActivity() {

    private var binding: FragmentDesignBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentDesignBinding.inflate(layoutInflater)
        setContentView(binding?.root)

    }

}