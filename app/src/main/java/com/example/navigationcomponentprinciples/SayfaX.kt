package com.example.navigationcomponentprinciples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentprinciples.databinding.FragmentSayfaXBinding


class SayfaX : Fragment() {

    private lateinit var tasarim: FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentSayfaXBinding.inflate(inflater, container, false)

        tasarim.button5.setOnClickListener { //Sayfa X'ten Sayfa Y'ye geçiş
            Navigation.findNavController(it).navigate(SayfaXDirections.actionSayfaXToSayfaY())

        }

        return tasarim.root
    }

}