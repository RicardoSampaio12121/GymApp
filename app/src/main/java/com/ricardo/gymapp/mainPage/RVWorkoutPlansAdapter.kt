package com.ricardo.gymapp.mainPage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ricardo.gymapp.databinding.TrainingPlansRvItemBinding
import com.ricardo.gymapp.models.WorkoutPlanModel

class RVWorkoutPlansAdapter(var workoutPlans: MutableList<WorkoutPlanModel>): RecyclerView.Adapter<RVWorkoutPlansAdapter.ToDoViewHolder>() {

    inner class ToDoViewHolder(val binding: TrainingPlansRvItemBinding): RecyclerView.ViewHolder(binding.root){
        init {
            itemView.setOnClickListener {
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        val binding = TrainingPlansRvItemBinding.inflate(layoutInflater, parent, false)

        return ToDoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.binding.apply {
            title.text = workoutPlans[position].title
        }
    }

    override fun getItemCount(): Int {
        return workoutPlans.size
    }
}