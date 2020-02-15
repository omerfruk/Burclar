package com.example.burclar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var position = intent.extras?.get("position")
        Toast.makeText(this, "position : "+   position,Toast.LENGTH_LONG).show()

    }
}
