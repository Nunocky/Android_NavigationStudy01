package org.nunocky.navigationstudy01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
//    private val navHostFragment =
//        supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//    private val navController = navHostFragment.navController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}