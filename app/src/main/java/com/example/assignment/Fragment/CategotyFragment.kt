package com.example.assignment.Fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.assignment.R

class CategotyFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.category_fragment, container, false)
    }

    companion object {
        fun newInstance(): CategotyFragment {
            return CategotyFragment()
        }
    }
}
