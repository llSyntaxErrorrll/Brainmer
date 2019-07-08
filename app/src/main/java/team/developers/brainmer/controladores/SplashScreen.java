package team.developers.brainmer.controladores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;

import team.developers.brainmer.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //poner pantalla completa
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        //splash screen
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    //esperar 1.5s
                    Thread.sleep(1500);

                    //pasar a la siguiente actividad
                    startActivity(new Intent(SplashScreen.this, Main.class));
                    finish();
                }catch (Exception e){
                    Log.e("Error", "run: ", e);
                }
            }
        }).start();
    }
}
