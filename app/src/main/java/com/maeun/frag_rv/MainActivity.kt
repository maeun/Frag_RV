package com.maeun.frag_rv

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_recycler.*

class MainActivity : AppCompatActivity() {

//    lateinit var Items : ArrayList<Item>
//    lateinit var Adapter: Adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment(RecyclerActivity())

//        Items = ArrayList()
//        Items.add(Item("승기","7월 2일"))
//        Items.add(Item("마은", "11월 24일"))
//        Items.add(Item("승기","7월 2일"))
//        Items.add(Item("마은", "11월 24일"))
//        Items.add(Item("승기","7월 2일"))
//        Items.add(Item("마은", "11월 24일"))
//        Items.add(Item("승기","7월 2일"))
//        Items.add(Item("마은", "11월 24일"))
//        Items.add(Item("승기","7월 2일"))
//        Items.add(Item("마은", "11월 24일"))
//        Items.add(Item("승기","7월 2일"))
//        Items.add(Item("마은", "11월 24일"))
//
//
//
//        Adapter = Adapter(Items)
//        rv.layoutManager = LinearLayoutManager(this)
//        rv.adapter = Adapter


    }

    fun addFragment(fragment: Fragment){
        val fm = supportFragmentManager
        val transaction = fm.beginTransaction()
        transaction.add(R.id.main_frame, fragment)
        transaction.commit()
    }
}
