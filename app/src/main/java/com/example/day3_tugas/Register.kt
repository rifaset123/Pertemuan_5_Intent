package com.example.day3_tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.example.day3_tugas.databinding.ActivityMainBinding
import com.example.day3_tugas.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    companion object{
        const val NAMA_EXTRA = "nama"
        const val PASSWORD_EXTRA = "password"
        const val EMAIL_EXTRA = "email"
        const val PHONE_EXTRA = "phone"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)  // untuk memaksa light mode
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            btnRegis.setOnClickListener {
                val intentToHomepage =
                    Intent(this@Register, Homepage::class.java)
                intentToHomepage.putExtra(NAMA_EXTRA, username.text.toString())
                intentToHomepage.putExtra(PASSWORD_EXTRA, password.text.toString())
                intentToHomepage.putExtra(PHONE_EXTRA, phone.text.toString())
                intentToHomepage.putExtra(EMAIL_EXTRA, email.text.toString())
                startActivity(intentToHomepage)
                }
            login.setOnClickListener {
                val intentToRegister =
                    Intent(this@Register, MainActivity::class.java)
                startActivity(intentToRegister)
            }
            }
    }
}