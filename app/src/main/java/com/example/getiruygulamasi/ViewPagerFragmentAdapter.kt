package com.example.getiruygulamasi

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerFragmentAdapter(val fragmentManager: FragmentManager) : FragmentStateAdapter() {
    private var arrayList = arrayListOf<Fragment>()

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun createFragment(position: Int): Fragment {
        return arrayList.get(position)
    }
}