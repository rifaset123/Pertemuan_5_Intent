package com.example.day3_tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.example.day3_tugas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
        private val TAG = "MainActivityLifecycle"
        private lateinit var binding: ActivityMainBinding
        companion object{
            const val NAMA_EXTRA = "nama"
        }
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)  // untuk memaksa light mode
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            with(binding) {
                btn.setOnClickListener {
                    val intentToHomepage =
                        Intent(this@MainActivity, Homepage::class.java)
                    intentToHomepage.putExtra(Register.NAMA_EXTRA, username.text.toString())
                    startActivity(intentToHomepage)
                }
                register.setOnClickListener {
                    val intentToRegister =
                        Intent(this@MainActivity, Register::class.java)
                    startActivity(intentToRegister)
                }
            }



            Log.d(TAG, "onCreate: dipanggil")
        }


        override fun onStart() {
            super.onStart()
            Log.d(TAG, "onStart: dipanggil")
        }
        override fun onResume() {
            super.onResume()
            Log.d(TAG, "onResume: dipanggil")
        }
        override fun onPause() {
            super.onPause()
            Log.d(TAG, "onPause: dipanggil")
        }
        override fun onStop() {
            super.onStop()
            Log.d(TAG, "onStop: dipanggil")
        }
        override fun onDestroy() {
            super.onDestroy()
            Log.d(TAG, "onDestroy: dipanggil")
    }
}