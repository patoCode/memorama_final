package com.training.memorama_kit_kat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.training.memorama_kit_kat.databinding.ActivityLevelBinding
import com.training.memorama_kit_kat.databinding.ActivityMainBinding

class LevelActivity : AppCompatActivity() {


    var bgCards = "DEFAULT"
    lateinit var binding : ActivityLevelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevelBinding.inflate(layoutInflater)
        val intent = Intent(this, MainActivity::class.java)

        binding.btn01.setOnClickListener {
            bgCards = "0"
            Log.d("CLICK ", binding.btn01.id.toString()+" - "+bgCards)
            intent.putExtra("bg", bgCards)
            startActivity(intent)
        }
        binding.btn02.setOnClickListener {
            bgCards = "1"
            Log.d("CLICK ", binding.btn02.id.toString()+" - "+bgCards)
            intent.putExtra("bg", bgCards)
            startActivity(intent)
        }
        binding.btn03.setOnClickListener {
            bgCards = "2"
            Log.d("CLICK ", binding.btn03.id.toString()+" - "+bgCards)
            intent.putExtra("bg", bgCards)
            startActivity(intent)
        }



        setContentView(binding.root)
    }

}