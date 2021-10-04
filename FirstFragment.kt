package com.example.navigation_component

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation


class FirstFragment : Fragment() {

    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        navController = Navigation.findNavController(view)

        val button = view.findViewById<Button>(R.id.send)
        val editText:EditText=view.findViewById(R.id.first_name)

        button.setOnClickListener {
            val bundle = bundleOf("data" to editText.text.toString())
            navController.navigate(R.id.action_firstFragment_to_secondFragment,bundle)
        }
    }
}