package com.example.burclar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.teksatir.view.*
import java.util.zip.Inflater

class SignsBaseAdapter(context: Context):BaseAdapter() {
    var allSigns :ArrayList<Signs>
    var context :Context


    init {
        allSigns = ArrayList<Signs>()
        this.context = context

        var signs = context.resources.getStringArray(R.array.burclar)
        var signDate = context.resources.getStringArray(R.array.burctarihleri)
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
        for (i in 0..11){
                var arrayAdder = Signs(signs[i],signDate[i],signImages[i])
                allSigns.add(arrayAdder)
        }

    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {

        var singleLineView = convertView
        var viewHolder : ViewHolder2?=null
        if (singleLineView == null){

            var inflater = LayoutInflater.from(context)
            singleLineView = inflater.inflate(R.layout.teksatir,parent,false)
            viewHolder = ViewHolder2(singleLineView)
            singleLineView.tag = viewHolder
        }
        else{
            viewHolder = singleLineView.getTag() as ViewHolder2

        }


        viewHolder.signName.setText(allSigns.get(position).signName)
        viewHolder.signDate.setText(allSigns.get(position).signDate)
        viewHolder.signImage.setImageResource(allSigns.get(position).signImage)

        return singleLineView
    }

    override fun getItem(position: Int): Any {
       return allSigns.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return allSigns.size
    }
}
data class Signs(var signName:String,var signDate:String,var signImage:Int ){

    }
class ViewHolder2(singleLineView:View){

    var signName:TextView
    var signDate:TextView
    var signImage:ImageView

    init {
        this.signName = singleLineView.tvSignName
        this.signDate = singleLineView.tvSignDate
        this.signImage=singleLineView.imgSign

    }
}

