package com.example.soptstudy

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.soptstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            addNickName()
        }
    }

    private fun addNickName() {

        binding.apply {
            tvShoew.text = binding.editTextTextPersonName.text
            invalidateAll() //새로운걸 ui 업데이트 하기 위해서
            editTextTextPersonName.visibility = View.GONE
            button.visibility = View.GONE

        }

    }

}

