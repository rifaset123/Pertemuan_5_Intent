package com.example.day3_tugas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.example.day3_tugas.databinding.ActivityHomepageBinding

class Homepage : AppCompatActivity() {
    private lateinit var binding: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)  // untuk memaksa light mode
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val nama = intent.getStringExtra(Register.NAMA_EXTRA)
        val email = intent.getStringExtra(Register.EMAIL_EXTRA)
        val phone = intent.getStringExtra(Register.PHONE_EXTRA)

        with(binding){
            txtNama.text = nama
            txtEmail.text = email
            txtPhone.text = phone
        }
    }
}