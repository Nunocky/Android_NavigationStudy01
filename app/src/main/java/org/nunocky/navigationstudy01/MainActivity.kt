package org.nunocky.navigationstudy01

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import org.nunocky.navigationstudy01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val activityViewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.activityViewModel = activityViewModel
        binding.lifecycleOwner = this

        // Quitボタンが押されたらどこからでも A01に戻る
        binding.btnQuit.setOnClickListener {
            val navHostFragment =
                supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            val navController = navHostFragment.navController

            // グローバルナビゲーションで移動するとバックスタックに保持されている状態はリセットされる
            navController.navigate(R.id.action_global_a01Fragment)
        }
    }
}