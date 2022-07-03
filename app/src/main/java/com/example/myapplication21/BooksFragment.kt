package com.example.myapplication21

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.myapplication21.databinding.FragmentBooksBinding


class BooksFragment : Fragment(R.layout.fragment_books){
    private var _binding: FragmentBooksBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentBooksBinding.bind(view)

        binding.buttonBooks.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("Key", "Books")
            findNavController().navigate(R.id.action_booksFragment_to_helpFragment, bundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}