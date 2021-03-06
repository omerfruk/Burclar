package com.example.burclar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var allSignsData: ArrayList<Signs>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        CallData()
        // var myAdapter = ArrayAdapter<String>(this,R.layout.teksatir,R.id.tvSignName,signs)

        var myAdapter = SignsBaseAdapter(this, allSignsData)
        listSigns.adapter = myAdapter

        listSigns.setOnItemClickListener { parent, view, position, id ->

            var intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("position", position)
            intent.putExtra("allSignsData",allSignsData)
            startActivity(intent)
        }
    }

    private fun CallData() {
        allSignsData = ArrayList<Signs>(12)


        var signs = resources.getStringArray(R.array.burclar)
        var signDate = resources.getStringArray(R.array.burctarihleri)
        var signImages = arrayOf(
            R.drawable.aries,
            R.drawable.taurus,
            R.drawable.gemini,
            R.drawable.cancer,
            R.drawable.leo,
            R.drawable.virgo,
            R.drawable.libra,
            R.drawable.scorpio,
            R.drawable.sagittarius,
            R.drawable.capricorn,
            R.drawable.aquarius,
            R.drawable.pisces
        )
        var signDetails = resources.getStringArray(R.array.burcozellikleri)
        var signImgBig = arrayOf(
            R.drawable.ariesbig,
            R.drawable.taurusbig,
            R.drawable.geminibig,
            R.drawable.cancerbig,
            R.drawable.leobig,
            R.drawable.virgobig,
            R.drawable.librabig,
            R.drawable.scorpiobig,
            R.drawable.sagittariusbig,
            R.drawable.capricornbig,
            R.drawable.aquariusbig,
            R.drawable.piscesbig
        )

        for (i in 0..11) {
            var arrayAdder = Signs(signs[i], signDate[i], signImages[i], signDetails[i],signImgBig[i])
            allSignsData.add(arrayAdder)
        }

    }
}
