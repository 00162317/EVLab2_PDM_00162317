package com.example.laboevaluado.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.laboevaluado.Fragmento.Fragment_first
import com.example.laboevaluado.Fragmento.Fragment_second
import com.example.laboevaluado.R
import kotlinx.android.synthetic.main.fragment_fragment_first.*

class MainActivity : AppCompatActivity(),Fragment_first.OnFragmentInteractionListener,Fragment_second.OnFragmentInteractionListener {
    lateinit var fragment:Fragment_second
    var listaColores = ArrayList<Int>()
    var auxiliar:Int=0

    override fun cambiarColor(id: Int) {
        if(id==R.id.btn_atras){
            if(auxiliar==0){
                auxiliar=2
            }
            else{
                auxiliar--
            }
        }
        if(id==R.id.btn_siguiente){
            if(auxiliar==2){
                auxiliar=0
            }
            else{
                auxiliar++
            }
        }
        fragment=Fragment_second.newInstance(listaColores,auxiliar)
        supportFragmentManager.beginTransaction().replace(R.id.secundario,fragment).commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listaColores.add(R.color.red)
        listaColores.add(R.color.blue)
        listaColores.add(R.color.green)
        listaColores.add(R.color.colorAccent)

        fragment = Fragment_second.newInstance(listaColores,auxiliar)
        supportFragmentManager.beginTransaction().replace(R.id.secundario,fragment).commit()
    }

}
