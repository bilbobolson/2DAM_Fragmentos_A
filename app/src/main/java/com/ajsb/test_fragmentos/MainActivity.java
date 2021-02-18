package com.ajsb.test_fragmentos;

/**
 * Antonio José Sánchez Bujaldón
 * Curso 2020/21
 */

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.ajsb.test_fragmentos.fragmentos.PrimerFragmento;
import com.ajsb.test_fragmentos.fragmentos.SegundoFragmento;
import com.ajsb.test_fragmentos.fragmentos.TercerFragmento;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
{
    private BottomNavigationView bnv ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout.activity_main) ;

        bnv = findViewById(R.id.menuNavegacion) ;
        bnv.setOnNavigationItemSelectedListener(item ->
        {

            switch (item.getItemId())
            {
                case R.id.mnuOp1:
                    Log.i("FRAGMENTOS", "SE HA PULSADO EN LA OPCIÓN 1") ;
                    if (!cargado("PrimerFragmento")) cargarFragmento(new PrimerFragmento());
                    break ;
                case R.id.mnuOp2:
                    Log.i("FRAGMENTOS", "SE HA PULSADO EN LA OPCIÓN 2") ;
                    if (!cargado("SegundoFragmento"))
                    {
                        SegundoFragmento fragmento ;
                        fragmento = new SegundoFragmento() ;

                        // Definimos un diccionario y asociamos los valores
                        // que necesitamos pasar al fragmento
                        Bundle bundle = new Bundle() ;
                        bundle.putString("dato", "Pistachos con chocolate") ;

                        // Asociamos el diccionario al fragmento
                        fragmento.setArguments(bundle) ;

                        // Cargamos el fragmento
                        cargarFragmento(fragmento);
                    }

                    break ;
                case R.id.mnuOp3:
                    Log.i("FRAGMENTOS", "SE HA PULSADO EN LA OPCIÓN 3") ;
                    if (!cargado("TercerFragmento")) cargarFragmento(new TercerFragmento());
                    break ;

                default:
                    return false ;
            }

            return true ;
        });
    }

    /**
     * @param fragmento
     */
    private void cargarFragmento(Fragment fragmento)
    {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.contenedor, fragmento)
                .commit() ;
    }

    /**
     * @param clase
     * @return
     */
    private boolean cargado(String clase)
    {
        Fragment fragmento = getSupportFragmentManager()
                                .findFragmentById(R.id.contenedor) ;

        return (fragmento!=null) &&
               (fragmento.getClass().getSimpleName().equals(clase)) ;
    }

}