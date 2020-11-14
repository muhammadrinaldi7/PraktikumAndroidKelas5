package com.example.androidkelas5rinaldi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    companion object{
        final val EXTRA_ID = "id_pelajar"
        final val EXTRA_NAMA = "nama_pelajar"
        final val EXTRA_NO_HP = "no_hp"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvIdPelajarResult = findViewById<TextView>(R.id.tvIdPelajarResult)
        val tvNamaPelajarResult = findViewById<TextView>(R.id.tvNamaPelajarResult)
        val tvNoHpResult = findViewById<TextView>(R.id.tvNo_HandphoneResult)

        val id = intent.getStringExtra(EXTRA_ID)
        val nama = intent.getStringExtra(EXTRA_NAMA)
        val no_hp = intent.getStringExtra(EXTRA_NO_HP)

        tvIdPelajarResult.text = id
        tvNamaPelajarResult.text = nama
        tvNoHpResult.text = no_hp
    }
}