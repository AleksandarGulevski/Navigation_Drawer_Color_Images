package com.denofdevelopers.navigation_drawer_color_images

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initNavigationDrawer()
    }

    private fun initNavigationDrawer() {
        val drawerToggle =
            ActionBarDrawerToggle(this, navigationDrawer, toolbar, R.string.open, R.string.close)
        navigationDrawer.addDrawerListener(drawerToggle)
        navigationDrawer.isClickable = true
        drawerToggle.syncState()
        toolbarTitle.text = getString(R.string.den)
        navigationView.itemIconTintList = null
        drawerToggle.drawerArrowDrawable.color = ContextCompat.getColor(this, R.color.colorWhite)
    }
}



