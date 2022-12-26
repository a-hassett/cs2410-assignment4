package com.allykh.assignment4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.allykh.assignment4.databinding.FacultyDisplayBinding

//this class connects the faculty_display items with the fragment_faculty view with a recyclerview
//RecyclerView.ViewHolder is the object of each faculty_display item
//this adapter decides which ViewHolders are currently shown on the screen

class FacultyAdapter(val faculty: List<FacultyMember>, val onClick: (FacultyMember) -> Unit = {}): RecyclerView.Adapter<FacultyAdapter.ViewHolder>() {
    class ViewHolder(val binding: FacultyDisplayBinding): RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = FacultyDisplayBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val facultyMember = faculty[position]
        holder.binding.nameTextView.text = facultyMember.name
        holder.binding.positionTextView.text = facultyMember.position
        holder.binding.officeTextView.text = facultyMember.office

        holder.binding.root.setOnClickListener(){
            onClick(facultyMember)
        }
    }

    override fun getItemCount(): Int {
        return faculty.size
    }
}