package com.example.androidkelas5rinaldi

import android.content.Intent
import android.nfc.NfcAdapter.EXTRA_ID
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class StudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        val btKirimPelajar = findViewById<Button>(R.id.btKirimPelajar)
        val etIdPelajar = findViewById<EditText>(R.id.etIdPelajar)
        val etNamaPelajar = findViewById<EditText>(R.id.etNamaPelajar)
        val etNo_handphone = findViewById<EditText>(R.id.etStudentNumber)

        btKirimPelajar.setOnClickListener {

            val id = etIdPelajar.text.toString()
            val nama = etNamaPelajar.text.toString()
            val noHP = etNo_handphone.text.toString()

            val i = Intent(this, ResultActivity::class.java)
            i.putExtra(ResultActivity.EXTRA_ID,id)
            i.putExtra(ResultActivity.EXTRA_NAMA,nama)
            i.putExtra(ResultActivity.EXTRA_NO_HP,noHP)
            startActivity(i)
        }

    }
}