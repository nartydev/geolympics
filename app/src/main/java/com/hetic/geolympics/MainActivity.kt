package com.hetic.geolympics

import android.app.DatePickerDialog
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.widget.CalendarView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        // Fonts
        val typefaceBold = Typeface.createFromAsset(assets, "Eina01-Bold.ttf")
        val typefaceRegular = Typeface.createFromAsset(assets, "Eina01-Regular.ttf")


        // Set the typeface
        titleScreen.typeface = typefaceBold
        descScreen.typeface = typefaceRegular

        // Set main
        titleChooseDay.typeface = typefaceBold
        descChooseDay.typeface = typefaceRegular

        buttonChooseDay.typeface = typefaceBold

        fun Date.toString(format: String, locale: Locale = Locale.getDefault()): String {
            val formatter = SimpleDateFormat(format, locale)
            return formatter.format(this)
        }

        fun getCurrentDateTime(): Date {
            return Calendar.getInstance().time
        }

        val dateDay = getCurrentDateTime()
        var date = dateDay.toString("dd/MM/yyyy")

        cal.setOnDateChangeListener(CalendarView.OnDateChangeListener { _, i, il, i2 ->
            date = "$i2/${il+1}/$i"
        })


        buttonChooseDay.setOnClickListener {
            val intent = Intent(this, SportsActivity::class.java)
            intent.putExtra("date", date)
            startActivity(intent)
        }
    }

}
