package com.varenkine.cinematiq

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.cinematiq.R

class MainActivity : AppCompatActivity() {
    private lateinit var menuButton: Button
    private lateinit var favoritesButton: Button
    private lateinit var watchLaterButton: Button
    private lateinit var collections: Button
    private lateinit var settings: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initMenuButtons()

    }

    private fun initMenuButtons() {
        menuButton = findViewById(R.id.button1)
        favoritesButton = findViewById(R.id.button2)
        watchLaterButton = findViewById(R.id.button3)
        collections = findViewById(R.id.button4)
        settings = findViewById(R.id.button5)

        menuButton.setOnClickListener {
            Toast.makeText(this, R.string.menuButton, Toast.LENGTH_SHORT).show()
        }

        favoritesButton.setOnClickListener {
            Toast.makeText(this, R.string.favoritesButton, Toast.LENGTH_SHORT).show()
        }

        watchLaterButton.setOnClickListener {
            Toast.makeText(this, R.string.watchLaterButton, Toast.LENGTH_SHORT).show()
        }

        collections.setOnClickListener {
            Toast.makeText(this, R.string.collectionsButton, Toast.LENGTH_SHORT).show()
        }

        settings.setOnClickListener {
            Toast.makeText(this, R.string.settingsButton, Toast.LENGTH_SHORT).show()
        }
    }
}