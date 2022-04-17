package com.example.navigationcomponentprinciples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentprinciples.databinding.FragmentAnaSayfaBinding
import com.example.navigationcomponentprinciples.databinding.FragmentSayfaABinding

class SayfaA : Fragment() {
    private lateinit var tasarim: FragmentSayfaABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentSayfaABinding.inflate(inflater, container, false)

        tasarim.button3.setOnClickListener { //Sayfa A'dan Sayfa B'ye geçiş
            Navigation.findNavController(it).navigate(SayfaADirections.actionSayfaAToSayfaB())
        }

        return tasarim.root
    }

}