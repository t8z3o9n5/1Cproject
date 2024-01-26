package com.orthocanna.a1c

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<MainDataClassRecyclerView>
    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.icon_inventory,
            R.drawable.icon_settings)

        titleList = arrayOf(
            "Инвентаризация",
            "Настройки")

        recyclerView = findViewById(R.id.recyclerViewMainActivity)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<MainDataClassRecyclerView>()
        getData()
    }

    private fun getData(){
        for (i in imageList.indices){
            val mainDataClassRecyclerView = MainDataClassRecyclerView(imageList[i],titleList[i])
            dataList.add(mainDataClassRecyclerView)
        }
        recyclerView.adapter = MainAdapterClassRecyclerView(dataList)
    }

}