package com.example.myapplication21

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myapplication21.databinding.FragmentHelpBinding
import com.google.android.material.snackbar.Snackbar

class HelpFragment : Fragment(R.layout.fragment_help) {

    private var _binding: FragmentHelpBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val result = when{
            arguments?.getString("Key").orEmpty() == "Main" -> "Вы пришли из Main"
            arguments?.getString("Key").orEmpty() == "Profile" -> "Вы пришли из Profile"
            arguments?.getString("Key").orEmpty() == "Books" -> "ВЫ пришли из Books"
            arguments?.getString("Key").orEmpty() == "Favourites" -> "Вы пришли из Favourites"
            else -> "Вы пришли из Settings"
        }

        if(result.isNotEmpty()){
            Snackbar.make(view, result, Snackbar.LENGTH_LONG).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}