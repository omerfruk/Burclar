package com.example.burclar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var burclar = arrayOf("Koç","Boğa","Balık","Başak","İkizler","Terazi","Kova","Yengeç","Yay","Oğlak","Akrep","Aslan")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // var burcadapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,burclar)

       // var burcadapter = ArrayAdapter<String>(this,R.layout.teksatir,R.id.tvburcAdi,burclar)

      //  listBurclar.adapter=burcadapter

        listBurclar.setOnItemClickListener { parent, view, position, id ->

            var viewVar = view as TextView

            Toast.makeText(this,viewVar.text.toString(),Toast.LENGTH_SHORT).show()
        }
    }
}
