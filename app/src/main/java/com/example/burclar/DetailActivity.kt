package com.example.burclar

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.palette.graphics.Palette
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var position = intent.extras?.get("position") as Int
        var allSignsData = intent.extras!!.get("allSignsData") as ArrayList<Signs>
        //Toast.makeText(this, "position : "+ position+"All"+allSignsData.size,Toast.LENGTH_LONG).show()
        tvSignFeature.setText(allSignsData.get(position).signDetails)
        header.setImageResource(allSignsData.get(position).signImgBig)

        setSupportActionBar(anim_toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        collapsing_toolbar.title = allSignsData.get(position).signName

        var bitmap = BitmapFactory.decodeResource(resources,allSignsData.get(position).signImgBig)

        Palette.from(bitmap).generate(object : Palette.PaletteAsyncListener{
            override fun onGenerated(palette: Palette?) {
                var color = palette?.getVibrantColor(R.attr.colorAccent)
                collapsing_toolbar.setContentScrimColor(color!!)

                window.statusBarColor = color
            }


        })




    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
