package com.torvald.splash

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.torvald.navigation.navigate


class SplashFragment : Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonToOnboarding).setOnClickListener {
            navigate(R.id.action_splashFragment_to_onboardingFragment)
        }

        view.findViewById<Button>(R.id.buttonToMain).setOnClickListener {
            navigate(R.id.action_splashFragment_to_mainFragment)
        }
    }
}