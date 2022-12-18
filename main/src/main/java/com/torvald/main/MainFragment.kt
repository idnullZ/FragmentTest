package com.torvald.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        NavigationUI.setupWithNavController(
            view.findViewById<BottomNavigationView>(R.id.bottomNavigationView),
            Navigation.findNavController(requireActivity(), com.torvald.navigation.R.id.host_main)
        )
    }
}