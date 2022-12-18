package com.torvald.settings

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.torvald.navigation.navigate

class SettingsFragment : Fragment(R.layout.fragment_settings) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonToSplash).setOnClickListener {
            navigate(R.id.action_mainFragment_to_splashFragment, com.torvald.navigation.R.id.host_global)
        }
    }
}