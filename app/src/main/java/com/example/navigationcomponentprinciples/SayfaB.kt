package com.example.navigationcomponentprinciples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentprinciples.databinding.FragmentSayfaBBinding

class SayfaB : Fragment() {
    private lateinit var tasarim: FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = FragmentSayfaBBinding.inflate(inflater, container, false)

        tasarim.button4.setOnClickListener { //Sayfa B'den Sayfa Y'ye geçiş
            Navigation.findNavController(it).navigate(SayfaBDirections.actionSayfaBToSayfaY())
        }

        return tasarim.root
    }


}