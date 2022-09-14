package com.example.soptstudy

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.soptstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Choi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        buttonClick()
    }

    private fun buttonClick(){
        binding.doneButton.setOnClickListener {
            with(binding){
                nicknameText.text = nicknameEdit.text
                nicknameEdit.visibility = View.GONE
                doneButton.visibility = View.GONE
                nicknameText.visibility = View.VISIBLE
            }
        }

    }

}

