package com.example.cheburek.presentation.ui.fragments.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.example.cheburek.R
import com.example.cheburek.databinding.FragmentSplashBinding
import com.example.cheburek.presentation.base.BaseFragment
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class SplashFragment : BaseFragment<FragmentSplashBinding>() {
    override val bindingInflater: (LayoutInflater) -> ViewBinding
        get() = FragmentSplashBinding::inflate

    @OptIn(DelicateCoroutinesApi::class)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        GlobalScope.launch {
            delay(2000)
            activity?.runOnUiThread {
                findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
            }
        }
    }
}