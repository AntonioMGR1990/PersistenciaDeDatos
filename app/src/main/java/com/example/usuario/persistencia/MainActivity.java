package com.example.usuario.persistencia;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText nombre;
    private EditText apellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.NombreEditText);
        apellido = findViewById(R.id.ApellidoEditText);
        findViewById(R.id.Altas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialogAltas = new Dialog(MainActivity.this);
                nombre = findViewById(R.id.NombreEditText);
                apellido = findViewById(R.id.ApellidoEditText);

                dialogAltas.setContentView(R.layout.alta_dialog);
                dialogAltas.setCancelable(false);
                dialogAltas.findViewById(R.id.Aceptar).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String nombre1 = "antonio";
                        String apellido1 = "garcia";
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


    static class DialogPersonalizado extends Dialog{

        private Button aceptar = findViewById(R.id.Aceptar);
        private Button cancelar = findViewById(R.id.Cancel);

        public DialogPersonalizado(@NonNull Context context) {
            super(context);
        }

        @Override
        public void setContentView(int layoutResID) {
            this.setContentView(R.layout.alta_dialog);
        }

        @Override
        public void setCancelable(boolean flag) {
            this.setCancelable(false);
        }

    }
}
