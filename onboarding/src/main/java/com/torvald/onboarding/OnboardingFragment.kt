package com.torvald.onboarding

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.torvald.navigation.navigate

class OnboardingFragment : Fragment(R.layout.fragment_onboarding) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonToMain).setOnClickListener {
            navigate(R.id.action_onboardingFragment_to_mainFragment)
        }
    }
}