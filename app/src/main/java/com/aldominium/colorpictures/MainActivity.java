package com.aldominium.colorpictures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void tomarFoto(View view) {

        Toast.makeText(this, "Foto!", Toast.LENGTH_SHORT).show();

    }

    public void tomarVideo(View view) {
        Toast.makeText(this, "Video!", Toast.LENGTH_SHORT).show();
    }

    public void verGaleriaFotos(View view) {
        Toast.makeText(this, "Galeria de Fotos!", Toast.LENGTH_SHORT).show();
    }

    public void verGaleriaVideos(View view) {
        Toast.makeText(this, "Galeria de Video!", Toast.LENGTH_SHORT).show();
    }
}
