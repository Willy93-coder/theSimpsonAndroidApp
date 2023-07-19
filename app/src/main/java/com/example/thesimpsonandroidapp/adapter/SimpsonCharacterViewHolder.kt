package com.example.thesimpsonandroidapp.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.thesimpsonandroidapp.SimpsonCharacter
import com.example.thesimpsonandroidapp.databinding.ItemSimpsonCharacterBinding

class SimpsonCharacterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemSimpsonCharacterBinding.bind(view)

    fun render(
        simpsonCharacterModel: SimpsonCharacter,
        onClickListener: (SimpsonCharacter) -> Unit
    ) {
        binding.tvSimpsonCharacterName.text = simpsonCharacterModel.name
        Glide.with(binding.ivSimpsonCharacter.context).load(simpsonCharacterModel.image)
            .into(binding.ivSimpsonCharacter)

        itemView.setOnClickListener { onClickListener(simpsonCharacterModel) }
    }

}