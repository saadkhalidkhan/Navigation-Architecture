package com.saad.navigationgraph

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * A simple [Fragment] subclass.
 */

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View =  inflater.inflate(R.layout.fragment_main, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Sending data from one fragment to another fragment
        buttonWelcomeMe.setOnClickListener{

            val name = enterName.text.toString()
            val bundleToTransfer = Bundle()
            if(name.isEmpty()) {
                enterName.error = "Please enter a name"
            } else {

                val action = MainFragmentDirections.actionMainFragmentToDestinationFragment()
                action.setNameToShow(name)
                findNavController().navigate(action)
            }
        }
    }

}
