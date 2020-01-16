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

    var sports= listOf<Event>([
        {
            "id": 1,
            "name": "Swimming",
            "code": "SWI",
            "place": "Centre Aquatique Aubervilliers",
            "events": [
            {
                "name": "Men's 100m Butterfly Final",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Women's 200m Backstroke Final",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Men's 100m Butterfly Victory Ceremony",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Women's 200m Backstroke Victory Ceremony",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Men's 50m Freestyle Final",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Women's 50m Freestyle Final",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Men's 50m Freestyle Victory Ceremony",
                "date": "03/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Women's 50m Freestyle Victory Ceremony",
                "date": "03/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            }
            ]
        },
        {
            "id": 2,
            "name": "Athletics",
            "code": "ATH",
            "place": "Stade de France",
            "events": [
            {
                "name": "Men's Discus Throw Victory Ceremony",
                "date": "02/08/2024",
                "start_time": "9:10",
                "end_time": "12:00"
            },
            {
                "name": "Men's High Jump Final",
                "date": "02/08/2024",
                "start_time": "19:00",
                "end_time": "21:55"
            },
            {
                "name": "Men's 100m Final",
                "date": "02/08/2024",
                "start_time": "19:00",
                "end_time": "21:55"
            },
            {
                "name": "Men's Long Jump Final",
                "date": "03/08/2024",
                "start_time": "9:10",
                "end_time": "11:55"
            },
            {
                "name": "Men's 100m Victory Ceremony",
                "date": "03/08/2024",
                "start_time": "19:00",
                "end_time": "22:00"
            },
            {
                "name": "Women's 5000m Final",
                "date": "03/08/2024",
                "start_time": "19:00",
                "end_time": "22:00"
            },
            {
                "name": "Women's Long Jump Final",
                "date": "04/08/2024",
                "start_time": "9:00",
                "end_time": "12:35"
            },
            {
                "name": "Women's 200m Final",
                "date": "04/08/2024",
                "start_time": "19:00",
                "end_time": "21:55"
            }
            ]
        },
        {
            "id": 3,
            "name": "Tennis",
            "code": "TEN",
            "place": "Rolland Garros",
            "events": [
            {
                "name": "Men's Singles Semifinals",
                "date": "31/07/2024",
                "start_time": "12:00",
                "end_time": "20:00"
            },
            {
                "name": "Men's Doubles Gold Medal Match",
                "date": "31/07/2024",
                "start_time": "12:00",
                "end_time": "20:00"
            },
            {
                "name": "Men's Singles Bronze Medal Match",
                "date": "01/08/2024",
                "start_time": "12:00",
                "end_time": "20:00"
            },
            {
                "name": "Men's Singles Gold Medal Match",
                "date": "02/08/2024",
                "start_time": "12:00",
                "end_time": "20:00"
            }
            ]
        },
        {
            "id": 4,
            "name": "Beach Volley",
            "code": "BVO",
            "place": "Champs de Mars",
            "events": [
            {
                "name": "Women's Gold Medal Match",
                "date": "01/08/2024",
                "start_time": "10:00",
                "end_time": "10:50"
            },
            {
                "name": "Men's Bronze Medal Match",
                "date": "02/08/2024",
                "start_time": "10:00",
                "end_time": "10:50"
            },
            {
                "name": "Men's Gold Medal Match",
                "date": "02/08/2024",
                "start_time": "10:00",
                "end_time": "10:50"
            },
            {
                "name": "Men's Victory Ceremony",
                "date": "03/08/2024",
                "start_time": "10:00",
                "end_time": "10:50"
            }
            ]
        },
        {
            "id": 5,
            "name": "Fencing",
            "code": "FEN",
            "place": "Grand Palais",
            "events": [
            {
                "name": "Men's 100m Butterfly Final",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Women's 200m Backstroke Final",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Men's 100m Butterfly Victory Ceremony",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Women's 200m Backstroke Victory Ceremony",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Men's 50m Freestyle Final",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Women's 50m Freestyle Final",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Men's 50m Freestyle Victory Ceremony",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Women's 50m Freestyle Victory Ceremony",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            }
            ]
        },
        {
            "id": 6,
            "name": "Archery",
            "code": "ARC",
            "place": "Esplanade des Invalides",
            "events": [
            {
                "name": "Men's 100m Butterfly Final",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Women's 200m Backstroke Final",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Men's 100m Butterfly Victory Ceremony",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Women's 200m Backstroke Victory Ceremony",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Men's 50m Freestyle Final",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Women's 50m Freestyle Final",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Men's 50m Freestyle Victory Ceremony",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Women's 50m Freestyle Victory Ceremony",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            }
            ]
        },
        {
            "id": 7,
            "name": "Gymnastics",
            "code": "GYM",
            "place": "Arena 92",
            "events": [
            {
                "name": "Men's 100m Butterfly Final",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Women's 200m Backstroke Final",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Men's 100m Butterfly Victory Ceremony",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Women's 200m Backstroke Victory Ceremony",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Men's 50m Freestyle Final",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Women's 50m Freestyle Final",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Men's 50m Freestyle Victory Ceremony",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Women's 50m Freestyle Victory Ceremony",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            }
            ]
        },
        {
            "id": 8,
            "name": "Rowing",
            "code": "ROW",
            "place": "Base nautique Vaires-sur-marne",
            "events": [
            {
                "name": "Men's 100m Butterfly Final",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Women's 200m Backstroke Final",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Men's 100m Butterfly Victory Ceremony",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Women's 200m Backstroke Victory Ceremony",
                "date": "01/08/2024",
                "start_time": "10:30",
                "end_time": "12:30"
            },
            {
                "name": "Men's 50m Freestyle Final",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Women's 50m Freestyle Final",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Men's 50m Freestyle Victory Ceremony",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            },
            {
                "name": "Women's 50m Freestyle Victory Ceremony",
                "date": "02/08/2024",
                "start_time": "08:00",
                "end_time": "10:00"
            }
            ]
        }]
    )

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
