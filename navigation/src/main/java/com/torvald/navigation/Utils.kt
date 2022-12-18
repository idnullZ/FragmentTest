package com.torvald.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import java.io.Serializable

private const val NAVIGATION_KEY = "NAVIGATION_KEY"

fun Fragment.navigate(actionId: Int, hostId: Int? = null, data: Serializable? = null) {

    val navController =
        hostId?.let { Navigation.findNavController(requireActivity(), it) } ?: findNavController()

    val bundle = Bundle().apply { putSerializable(NAVIGATION_KEY, data) }

    navController.navigate(actionId, bundle)
}

val Fragment.navigationData: Serializable?
    get() = arguments?.getSerializable(NAVIGATION_KEY)



data class Info(
    val name: String,
    val surname: String
) : Serializable
