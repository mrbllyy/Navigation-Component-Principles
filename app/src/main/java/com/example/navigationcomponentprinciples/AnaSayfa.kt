package com.example.navigationcomponentprinciples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentprinciples.databinding.FragmentAnaSayfaBinding

class AnaSayfa : Fragment() {
    private lateinit var tasarim:FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        tasarim.button.setOnClickListener { //Anasayfa'dan A'ya geçiş
            Navigation.findNavController(it).navigate(AnaSayfaDirections.actionAnaSayfaToSayfaA())
        }

        tasarim.button2.setOnClickListener { //Anasayfa'dan X'e geçiş
            Navigation.findNavController(it).navigate(AnaSayfaDirections.actionAnaSayfaToSayfaX())
        }

        return tasarim.root
    }

}