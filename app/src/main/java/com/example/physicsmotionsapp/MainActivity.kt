package com.example.physicsmotionsapp

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Megkeressük a gombot az ID alapján
        val btnLanguageToggle = findViewById<Button>(R.id.btnLanguageToggle)

        // Gomb kattintás eseménykezelője
        btnLanguageToggle.setOnClickListener {
            // Megnézzük az aktuális nyelvet, és váltunk a másikra
            val currentLocale = resources.configuration.locales[0]
            val newLocale = if (currentLocale.language == "hu") Locale("en") else Locale("hu")

            setLocale(newLocale)
        }
    }

    private fun setLocale(locale: Locale) {
        Locale.setDefault(locale)
        val config = Configuration(resources.configuration)
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)

        // Újraindítjuk az Activity-t, hogy érvénybe lépjen az új nyelv
        recreate()
    }
}