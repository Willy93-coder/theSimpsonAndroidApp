package com.example.thesimpsonandroidapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.thesimpsonandroidapp.R
import com.example.thesimpsonandroidapp.SimpsonCharacter

class SimpsonCharacterAdapter(
    private val simpsonCharacterList: List<SimpsonCharacter>,
    private val onClickListener: (SimpsonCharacter) -> Unit
) : RecyclerView.Adapter<SimpsonCharacterViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpsonCharacterViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SimpsonCharacterViewHolder(layoutInflater.inflate(R.layout.item_simpson_character, parent, false))
    }

    override fun getItemCount(): Int = simpsonCharacterList.size

    override fun onBindViewHolder(holder: SimpsonCharacterViewHolder, position: Int) {
        val item = simpsonCharacterList[position]
        holder.render(item, onClickListener)
    }
}