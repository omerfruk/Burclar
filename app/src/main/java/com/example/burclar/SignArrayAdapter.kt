package com.example.burclar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
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
        var singleLineLayout = convertView
        var viewHolder:ViewHolder?=null

        if(singleLineLayout == null){

            var inflater = LayoutInflater.from(context)
            singleLineLayout = inflater.inflate(R.layout.teksatir, parent, false)

            viewHolder = ViewHolder(singleLineLayout)
            singleLineLayout.tag = viewHolder

        }
        else {

            viewHolder = singleLineLayout.getTag() as ViewHolder
        }

        viewHolder.signName?.setText(signNames[position])
        viewHolder.signDate?.setText(signDates[position])
        viewHolder.imageSign?.setImageResource(signImages[position])


        return singleLineLayout!!


    }


    class ViewHolder(singleLinelayout:View){
        var signName :TextView
        var signDate :TextView
        var imageSign :ImageView

        init {
             signName = singleLinelayout.tvSignName
             signDate = singleLinelayout.tvSignDate
             imageSign = singleLinelayout.imgSign
        }

    }
}