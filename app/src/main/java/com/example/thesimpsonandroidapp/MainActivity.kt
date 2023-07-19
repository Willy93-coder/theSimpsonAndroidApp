package com.example.thesimpsonandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.thesimpsonandroidapp.adapter.SimpsonCharacterAdapter
import com.example.thesimpsonandroidapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = manager
        binding.recyclerView.adapter = SimpsonCharacterAdapter(
            SimpsonCharacterProvider.simpsonCharacterList
        ){ simpsonCharacter -> onItemSelected(simpsonCharacter) }
    }

    private fun onItemSelected(simpsonCharacter: SimpsonCharacter) {
        Toast.makeText(this, simpsonCharacter.name, Toast.LENGTH_SHORT).show()
    }
}