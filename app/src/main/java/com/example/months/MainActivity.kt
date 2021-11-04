package com.example.months

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.months.adapter.ItemAdapter
import com.example.months.data.Datasource

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadmonths()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ItemAdapter(this, myDataset)

        recyclerView.setHasFixedSize(true)


//        for first part to run text view
//        val textView: TextView = findViewById(R.id.textview)
//        textView.text = Datasource().loadmonths().size.toString()

    }
}