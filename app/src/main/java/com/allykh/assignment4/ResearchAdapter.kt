package com.allykh.assignment4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.allykh.assignment4.databinding.ResearchDisplayBinding

class ResearchAdapter(val researchList: List<ResearchArea>, val onClick: (ResearchArea) -> Unit = {}): RecyclerView.Adapter<ResearchAdapter.ViewHolder>() {
    class ViewHolder(val binding: ResearchDisplayBinding): RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ResearchDisplayBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val researchArea = researchList[position]
        holder.binding.nameTextView.text = researchArea.name
        holder.binding.descriptionTextView.text = researchArea.description
        holder.binding.membersTextView.text = researchArea.members

        holder.binding.root.setOnClickListener(){
            onClick(researchArea)
        }
    }

    override fun getItemCount(): Int {
        return researchList.size
    }
}