package com.example.usuario.persistencia;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.Altas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialogAltas = new Dialog(MainActivity.this);


                dialogAltas.setContentView(R.layout.alta_dialog);
                dialogAltas.setCancelable(false);
                dialogAltas.findViewById(R.id.Aceptar).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
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
    }
}
