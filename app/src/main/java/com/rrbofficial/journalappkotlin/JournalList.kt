package com.rrbofficial.journalappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rrbofficial.journalappkotlin.databinding.ActivityJournalListBinding
import com.rrbofficial.journalappkotlin.databinding.ActivityMainBinding

class JournalList : AppCompatActivity() {

    lateinit var  binding: ActivityJournalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_journal_list)


    }
}