package com.rrbofficial.journalappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.rrbofficial.journalappkotlin.databinding.ActivityMainBinding

// this is highlight


class MainActivity : AppCompatActivity() {

    lateinit var  binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.createAcctBTN.setOnClickListener()
        {
            val intent = Intent (this, SignUpActivity::class.java)
            startActivity(intent)

        }

    }

}