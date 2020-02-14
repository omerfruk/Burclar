package com.example.burclar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.teksatir.view.*
import java.util.zip.Inflater

class SignArrayAdapter(
    context: Context,
    resource: Int,
    textViewResourceId: Int,
    var signNames: Array<String>,
    var signDates: Array<String>,
    var signImages: Array<Int>
) : ArrayAdapter<String>(context, resource, textViewResourceId, signNames) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var inflater = LayoutInflater.from(context)
        var singleLineLayout = inflater.inflate(R.layout.teksatir, parent, false)

        var sign_name = singleLineLayout.tvSignName
        var sign_date = singleLineLayout.tvSignDate
        var sign_img = singleLineLayout.imgSign

        sign_name.setText(signNames[position])
        sign_date.setText(signDates[position])
        sign_img.setImageResource(signImages[position])


        return singleLineLayout

    }
}