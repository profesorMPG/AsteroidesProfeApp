package com.example.maria.asteroidesprofeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ///ATRIBUTOS

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//fin Oncreate


    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true; /** true -> el menú ya está visible */
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        boolean correcto =true;

        int id = item.getItemId();
        switch(id){

            case R.id.acercaDe:
                lanzarAcercaDe(null);
                break;
            default:
                Toast mensa = Toast.makeText(this, "Nombre Apellido Alumno: Opción en construccion",
                        Toast.LENGTH_SHORT);
                mensa.show();
                correcto = super.onOptionsItemSelected(item);
                break;
        }
        return correcto;
    }
    //METODOS
    public void lanzarAcercaDe(View view){
        Intent i = new Intent(this, AcercaDeActivity.class);
        startActivity(i);
    }
    public void salir(View view){
        finish();
    }
}//fin actividad main
