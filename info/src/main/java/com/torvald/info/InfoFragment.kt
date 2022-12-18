package com.torvald.info

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.torvald.navigation.Info
import com.torvald.navigation.navigationData

class InfoFragment : Fragment(R.layout.fragment_info) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val info = navigationData as? Info ?: return
        view.findViewById<TextView>(R.id.textView).text = info.toString()
    }
}