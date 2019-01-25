package io.htueko.comeacrossfood

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.OrientationHelper
import io.htueko.comeacrossfood.adapter.BottomAdapter
import io.htueko.comeacrossfood.adapter.TopAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar_main)

        val header : ArrayList<String> = ArrayList()
        for (i in 1..10){
            header.add("Header Text $i")
        }

        val image : ArrayList<Int> = ArrayList()
        image.add(R.drawable.ic_smiley_05)
        image.add(R.drawable.ic_smiley_04)
        image.add(R.drawable.ic_smiley_03)
        image.add(R.drawable.ic_smiley_02)
        image.add(R.drawable.ic_smiley_01)

        recycler_view_main_bottom.layoutManager = LinearLayoutManager(this, OrientationHelper.HORIZONTAL, false)
        recycler_view_main_bottom.adapter = BottomAdapter(header)

        recycler_view_main_top.layoutManager = LinearLayoutManager(this, OrientationHelper.HORIZONTAL, false)
        recycler_view_main_top.adapter = TopAdapter(image)

    }
}
