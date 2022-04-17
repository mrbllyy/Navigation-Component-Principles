package com.example.navigationcomponentprinciples

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentprinciples.databinding.FragmentSayfaYBinding

class SayfaY : Fragment() {
    private lateinit var tasarim: FragmentSayfaYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        tasarim = FragmentSayfaYBinding.inflate(inflater, container, false)

        tasarim.button6.setOnClickListener { //Sayfa Y'den Anasayfa'ya geri geçiş
            Navigation.findNavController(it).navigate(SayfaYDirections.actionSayfaYToAnaSayfa())
        }
        return tasarim.root
    }

}