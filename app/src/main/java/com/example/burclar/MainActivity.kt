package com.example.burclar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        // var myAdapter = ArrayAdapter<String>(this,R.layout.teksatir,R.id.tvSignName,signs)

        var myAdapter = SignsBaseAdapter(this)
        listSigns.adapter = myAdapter
    }
}
