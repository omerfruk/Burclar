package com.example.burclar

import android.content.Context
import android.widget.ArrayAdapter

class SignArrayAdapter(
    context: Context,
    resource: Int,
    textViewResourceId: Int,
    signNames: Array<String>,
    signDates:Array< String>,
    signImages : Array<Int>
) : ArrayAdapter<String>(context, resource, textViewResourceId, signNames) {
}