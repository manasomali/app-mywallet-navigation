package com.example.snackbar

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    companion object{
        fun newInstance() = HomeFragment()
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(context, "onAttach HomeFragment", Toast.LENGTH_SHORT).show()
    }


}