package uem.dam.mynicestart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Ventana de bienvenida con una animacion y un scrim
 *
 *  @author Alejandro
 *  @see SplashActivity
 *
 */

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }

    public void inicio(View view) {
        Intent i = new Intent(this, LoginActivity.class);

        startActivity(i);
    }

}