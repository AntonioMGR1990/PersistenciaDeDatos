package com.example.usuario.persistencia;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final XXX dialogAltas = new XXX(MainActivity.this,R.layout.alta_dialog);
        dialogAltas.setCancelable(false);
        findViewById(R.id.Altas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialogAltas.findViewById(R.id.Aceptar).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String nombre1 = dialogAltas.getNombre().getText().toString();
                        String apellido1 = dialogAltas.getApellido().getText().toString();
                        PersonasSingleton.getInstance().getPersonas().add(new Persona(nombre1,apellido1,20));
                        dialogAltas.dismiss();
                    }
                });
                dialogAltas.findViewById(R.id.Cancel).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogAltas.dismiss();
                    }
                });
                dialogAltas.show();
            }
        });
        findViewById(R.id.Mostrar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);
            }
        });
    }
}

class XXX extends Dialog{
    private EditText nombre;
    private EditText apellido;

    public EditText getNombre() {
        return nombre;
    }

    public void setNombre(EditText nombre) {
        this.nombre = nombre;
    }

    public EditText getApellido() {
        return apellido;
    }

    public void setApellido(EditText apellido) {
        this.apellido = apellido;
    }

    private XXX(@NonNull Activity context) {
        super(context);


    }
    public XXX(@NonNull Activity context,int id) {
        super(context);
        setContentView(id);
        nombre = findViewById(R.id.NombreEditText);
        apellido = findViewById(R.id.ApellidoEditText);
    }
}
