package com.ajsb.test_fragmentos.fragmentos;

/**
 * Antonio José Sánchez Bujaldón
 * Curso 2020/21
 */

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.ajsb.test_fragmentos.R;

public class SegundoFragmento extends Fragment
{

    private Button boton ;
    private TextView mensaje ;

    public SegundoFragmento() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_segundo_fragmento, container, false);

        // Instancio los elementos del layout del framento
        boton = layout.findViewById(R.id.button) ;
        mensaje = layout.findViewById(R.id.textView) ;

        // Devuelvo el layout (vista)
        return layout ;
    }

    @Override
    public void onStart()
    {
        super.onStart();

        String dato = getArguments().getString("dato") ;

        mensaje.setText(dato) ;
        boton.setOnClickListener(view ->
        {
            Log.i("**FRAGMENTOS", ".... Me has pulsado....") ;
        });
    }
}