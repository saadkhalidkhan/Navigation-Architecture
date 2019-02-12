package com.saad.navigationgraph

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_destination.*

/**
 * A simple [Fragment] subclass.
 */
class DestinationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destination, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = DestinationFragmentArgs.fromBundle(arguments!!).nameToShow

        welcomeWithNameTv.text = "Hello $name!"
    }
}// Required empty public constructor
