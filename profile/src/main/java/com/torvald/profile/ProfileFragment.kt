package com.torvald.profile

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.torvald.navigation.Info
import com.torvald.navigation.navigate


class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonToInfo).setOnClickListener {
            navigate(R.id.action_profileFragment_to_infoFragment, data = Info("name", "surname"))
        }
    }
}