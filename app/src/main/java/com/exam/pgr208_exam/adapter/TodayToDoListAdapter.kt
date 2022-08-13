package com.exam.pgr208_exam.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.exam.pgr208_exam.databinding.TodayTodoListBinding
import com.exam.pgr208_exam.models.EightBallStats

class TodayToDoListAdapter(): RecyclerView.Adapter<TodayToDoListAdapter.TodayViewHolder>() {







    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodayViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: TodayViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class TodayViewHolder(private val binding: TodayTodoListBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(stats: EightBallStats){
            binding.TodoTextView.text = stats.question
            binding.commandTextView.text = stats.answer
        }
    }

}