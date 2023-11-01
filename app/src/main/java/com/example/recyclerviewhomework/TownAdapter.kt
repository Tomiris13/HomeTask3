package com.example.recyclerviewhomework

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewhomework.databinding.ListElementBinding
class TownAdapter(
    private val list : MutableList<String>
) : RecyclerView.Adapter<TownAdapter.SentHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SentHolder {
        return SentHolder(ListElementBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: SentHolder, position: Int) {
        holder.bindView(list[position])
    }

    class SentHolder(private val binding : ListElementBinding) : RecyclerView.ViewHolder(binding.root){

        fun bindView(count : String){
            binding.textView.text = count

        }

    }
}