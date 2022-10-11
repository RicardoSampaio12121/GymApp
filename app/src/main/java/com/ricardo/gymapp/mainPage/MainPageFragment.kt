package com.ricardo.gymapp.mainPage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ricardo.gymapp.R
import com.ricardo.gymapp.databinding.FragmentMainPageBinding
import com.ricardo.gymapp.models.WorkoutPlanModel


class MainPageFragment : Fragment(R.layout.fragment_main_page) {

    private var _binding: FragmentMainPageBinding? = null
    private val binding get() = _binding!!

    private lateinit var mockList: MutableList<WorkoutPlanModel>
    private lateinit var adapter: RVWorkoutPlansAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mockList = ArrayList()

        _binding = FragmentMainPageBinding.bind(view)

        binding.apply {
            startWorkoutPlansRV()
        }
    }

    private fun startWorkoutPlansRV(){

        // DELETE LATER

        var w1 = WorkoutPlanModel("UPPER/LOWER", "strength")
        var w2 = WorkoutPlanModel("PPL", "hipertrophy")

        mockList.add(w1)
        mockList.add(w2)
        mockList.add(w2)
        mockList.add(w2)
        mockList.add(w2)
        mockList.add(w2)

        // ------------

        val rvWorkoutPlans = requireActivity().findViewById<RecyclerView>(R.id.rvWorkoutPlans)

        rvWorkoutPlans.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        adapter = RVWorkoutPlansAdapter(mockList)
        rvWorkoutPlans.adapter = adapter
    }



    companion object {
        @JvmStatic
        fun newInstance() =
            MainPageFragment().apply {
            }
    }
}