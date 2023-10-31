package com.example.travelapp_tugas9

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.travelapp_tugas9.databinding.FragmentOrderTicketBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OrderTicketFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OrderTicketFragment : Fragment() {

    private lateinit var binding: FragmentOrderTicketBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOrderTicketBinding.inflate(inflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){

            val spinnerItems = arrayOf("Jenis Tiket",
                "First Class Ticket" ,
                "Business Class Ticket" ,
                "Economy Class Ticket")
            val spinner = spinnerTicket
            val adapter = ArrayAdapter(requireContext(), R.layout.simple_spinner_item, spinnerItems)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter

            btnBuyticket.setOnClickListener(){
                findNavController().navigateUp()
            }
        }
    }


}