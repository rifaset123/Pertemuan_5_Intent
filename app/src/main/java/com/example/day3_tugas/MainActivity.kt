package com.example.day3_tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.example.day3_tugas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)  // untuk memaksa light mode
        setContentView(R.layout.activity_main)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)  /* menghubungkan dengan activity main dibawah dan ditampilkan ke UI */

        with(binding){/* supaya tidak perlu memanggil binding.--- terus menerus */
            btn.setOnClickListener{
                Toast.makeText(this@MainActivity, "Login berhasil, Selamat datang " + username.text,Toast.LENGTH_SHORT).show()
            }
            forgot.setOnClickListener{
                Toast.makeText(this@MainActivity, "Mohon maaf, fitur belum tersedia saat ini",Toast.LENGTH_SHORT).show()
            }
            gmail.setOnClickListener{
                Toast.makeText(this@MainActivity, "Tombol ini untuk menghubungi developer",Toast.LENGTH_SHORT).show()
            }
            hp.setOnClickListener{
                Toast.makeText(this@MainActivity, "Tombol ini untuk menuju nomor wa",Toast.LENGTH_SHORT).show()
            }
            profile.setOnClickListener{
                Toast.makeText(this@MainActivity, "Tombol ini untuk melihat profil developer",Toast.LENGTH_SHORT).show()
            }
        }
    }
}