package uem.dam.mynicestart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void regitro(View view) {
        Intent i = new Intent(this, SigninActivity.class);

        startActivity(i);
    }

    public void cambiarventana1(View view) {
        Intent i = new Intent(this, MainActivity.class);

        startActivity(i);
    }
}