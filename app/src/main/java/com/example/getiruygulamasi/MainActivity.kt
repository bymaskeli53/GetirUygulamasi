package com.example.getiruygulamasi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.statusBarColor = ContextCompat.getColor(this, R.color.purple_500)
        val text = "<font color=#FFC300>getir</font><font color=#ffffff>yemek</font>"
        getir_title.setText(Html.fromHtml(text))
        val bitmap = BitmapFactory.decodeResource(resources,R.drawable.getir)
        var getirList = mutableListOf(
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim")
        )


        val adapter = GetirAdapter(getirList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}