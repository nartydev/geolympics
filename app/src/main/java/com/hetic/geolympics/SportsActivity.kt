package com.hetic.geolympics

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.graphics.Typeface
import kotlinx.android.synthetic.main.activity_sports.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sports.descSports
import kotlinx.android.synthetic.main.activity_sports.descScreen
import kotlinx.android.synthetic.main.activity_sports.titleSports
import kotlinx.android.synthetic.main.activity_sports.titleScreen


class SportsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports)


        // Fonts
        val typefaceBold = Typeface.createFromAsset(assets, "Eina01-Bold.ttf")
        val typefaceRegular = Typeface.createFromAsset(assets, "Eina01-Regular.ttf")


        // Set the typeface
        titleScreen.typeface = typefaceBold
        descScreen.typeface = typefaceRegular

        // Set main
        titleSports.typeface = typefaceBold
        descSports.typeface = typefaceRegular


        val intent = intent

        val date = intent.getStringExtra("date")

        Log.i("SportsActivity", date)

    }

}
