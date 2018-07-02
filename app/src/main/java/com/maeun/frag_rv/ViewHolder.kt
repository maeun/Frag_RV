package com.maeun.frag_rv

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ViewHolder(itemView : View?) : RecyclerView.ViewHolder(itemView) {
    var name : TextView = itemView!!.findViewById(R.id.name) as TextView
    var period : TextView = itemView!!.findViewById(R.id.period) as TextView
}