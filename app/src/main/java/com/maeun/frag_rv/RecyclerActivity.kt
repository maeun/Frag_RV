package com.maeun.frag_rv

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.maeun.frag_rv.R.layout.activity_recycler
import kotlinx.android.synthetic.main.activity_recycler.*

class RecyclerActivity : Fragment() {

    lateinit var Items : ArrayList<Item>
    lateinit var Adapter: Adapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        Items = ArrayList()
        Items.add(Item("승기","7월 2일"))
        Items.add(Item("마은", "11월 24일"))
        Items.add(Item("승기","7월 2일"))
        Items.add(Item("마은", "11월 24일"))
        Items.add(Item("승기","7월 2일"))
        Items.add(Item("마은", "11월 24일"))
        Items.add(Item("승기","7월 2일"))
        Items.add(Item("마은", "11월 24일"))
        Items.add(Item("승기","7월 2일"))
        Items.add(Item("마은", "11월 24일"))
        Items.add(Item("승기","7월 2일"))
        Items.add(Item("마은", "11월 24일"))
        Adapter = Adapter(Items)

//여기에
//rv.layoutManager = LinearLayoutManager(context)
//rv.adapter = Adapter
//를 넣으면
//rv가 null이라는 에러가 뜬다.
//그 이유는

  /*    There are two things incorrect in your code :
        You are trying to access recyclerView even before inflating the View.
        The context of a Fragment is null in onCreateView and is usable in between onAttach and onDetach*/

//출처: https://stackoverflow.com/questions/50427209/kotlin-android-fragment-recyclerview-and-context-issue

        val v = inflater.inflate(R.layout.activity_recycler, container, false)
        return v
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        rv.layoutManager = LinearLayoutManager(context)
        rv.adapter = Adapter

    }
}