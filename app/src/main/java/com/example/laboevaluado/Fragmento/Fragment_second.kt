package com.example.laboevaluado.Fragmento

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.laboevaluado.R
import kotlinx.android.synthetic.main.fragment_fragment_second.view.*

class Fragment_second : Fragment() {

    private var listener: OnFragmentInteractionListener? = null
    private lateinit var listaColor : ArrayList<Int>
    private var auxiliar : Int = 0

    companion object {
        fun newInstance(lista:ArrayList<Int>,aux:Int):Fragment_second{
            var fragment=Fragment_second()
            fragment.listaColor=lista
            fragment.auxiliar=aux
            return fragment
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Hola", arguments?.getInt("i").toString())
        var view = inflater.inflate(R.layout.fragment_fragment_second, container, false)

        view.colores.setBackgroundResource(listaColor[auxiliar])
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

    interface OnFragmentInteractionListener {

    }

}
