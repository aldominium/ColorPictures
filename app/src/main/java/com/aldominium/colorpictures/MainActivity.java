package com.aldominium.colorpictures;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int PETICION_FOTO = 1;
    public static final int PETICION_VIDEO = 2;
    public static final int PETICION_GALERIA_FOTOS = 3;
    public static final int PETICION_GALERIA_VIDEOS = 4;

    public static final int MEDIA_FOTO = 5;
    public static final int MEDIA_VIDEO = 6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    


    public void tomarFoto(View view) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        startActivityForResult(intent,PETICION_FOTO);


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
