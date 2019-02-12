package com.saad.navigationgraph

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val host = NavHostFragment.create(R.navigation.welcome_nav_graph)

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,host).setPrimaryNavigationFragment(host).commit()
    }
}
