package io.htueko.comeacrossfood

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.OrientationHelper
import android.view.Menu
import com.littlemango.stacklayoutmanager.StackLayoutManager
import io.htueko.comeacrossfood.adapter.BottomAdapter
import io.htueko.comeacrossfood.adapter.TopAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar_main)

        val header: ArrayList<String> = ArrayList()
        for (i in 1..10) {
            header.add("Header Text $i")
        }

        val image: ArrayList<Int> = ArrayList()
        image.add(R.drawable.apple)
        image.add(R.drawable.code_burger)
        image.add(R.drawable.coffee)
        image.add(R.drawable.fish)
        image.add(R.drawable.grape)

        val orientation = StackLayoutManager.ScrollOrientation.RIGHT_TO_LEFT
        val stackLayoutManager = StackLayoutManager(orientation)
        recycler_view_main_bottom.layoutManager = stackLayoutManager
        recycler_view_main_bottom.adapter = BottomAdapter(header)

        recycler_view_main_top.layoutManager = LinearLayoutManager(this, OrientationHelper.HORIZONTAL, false)
        recycler_view_main_top.adapter = TopAdapter(image)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

}
