package com.example.burclar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var signs = resources.getStringArray(R.array.burclar)
        var signDate = resources.getStringArray(R.array.burctarihleri)
        var signImages = arrayOf(R.drawable.aries,R.drawable.taurus,R.drawable.gemini,R.drawable.cancer,R.drawable.leo,R.drawable.virgo,
            R.drawable.libra,R.drawable.scorpio,R.drawable.sagittarius,R.drawable.capricorn,R.drawable.aquarius,R.drawable.pisces)

       // var myAdapter = ArrayAdapter<String>(this,R.layout.teksatir,R.id.tvSignName,signs)
        var myAdapter = SignArrayAdapter(this,R.layout.teksatir,R.id.tvSignName,signs,signDate,signImages)
        listSigns.adapter =myAdapter
    }
}
