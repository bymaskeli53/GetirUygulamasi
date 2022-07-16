package com.example.getiruygulamasi

import android.graphics.BitmapFactory
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getiruygulamasi.databinding.FragmentMudavimBinding

class MudavimFragment : Fragment(R.layout.fragment_mudavim) {
    private var _binding : FragmentMudavimBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMudavimBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = "<font color=#FFC300>getir</font><font color=#ffffff>yemek</font>"
        binding.getirTitle.setText(Html.fromHtml(text))
        val bitmap = BitmapFactory.decodeResource(resources,R.drawable.getir)
        var getirList = mutableListOf(
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim"),
            Model(bitmap,"getir bi mutluluk","getir de getirelim")
        )


        val adapter = GetirAdapter(getirList)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(activity)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}