package com.ajsb.test_fragmentos.fragmentos;

/**
 * Antonio José Sánchez Bujaldón
 * Curso 2020/21
 */

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ajsb.test_fragmentos.R;


public class PrimerFragmento extends Fragment
{

    public PrimerFragmento() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_primer_fragmento, container, false);
    }
}