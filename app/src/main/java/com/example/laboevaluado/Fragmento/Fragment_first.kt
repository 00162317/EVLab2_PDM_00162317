package com.example.laboevaluado.Fragmento

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.laboevaluado.R
import kotlinx.android.synthetic.main.fragment_fragment_first.view.*

class Fragment_first : Fragment() {

    private var listener:OnFragmentInteractionListener?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view=inflater.inflate(R.layout.fragment_fragment_first,container)
        view.btn_atras.setOnClickListener { listener!!.cambiarColor(R.id.btn_atras) }
        view.btn_siguiente.setOnClickListener { listener!!.cambiarColor(R.id.btn_siguiente) }

        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is OnFragmentInteractionListener) {
            listener = context
        } else {
            throw RuntimeException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
    interface OnFragmentInteractionListener {
        fun cambiarColor(id:Int)
    }
}
