package com.bangkit.backgroundthread

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangkit.backgroundthread.databinding.ActivityStartMenuBinding

class StartMenu : AppCompatActivity() {

    private lateinit var binding: ActivityStartMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityStartMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Menu"

        binding.btnQuotes.setOnClickListener {
            startActivity(Intent(this@StartMenu, Quotes::class.java))
        }

        binding.btnReview.setOnClickListener {
            startActivity(Intent(this@StartMenu, Review::class.java))
        }

    }
}