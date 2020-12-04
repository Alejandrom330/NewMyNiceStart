package uem.dam.mynicestart;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

/**
 * Ventana de bienvenida con una animacion y un scrim
 *
 * @author Alejandro
 * @see SplashActivity
 *
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView myImage = (ImageView) findViewById(R.id.imageView2);
        Animation myanim1 = AnimationUtils.loadAnimation(this, R.anim.fadein_animation);
        myImage.startAnimation(myanim1);


        ImageView bosque = findViewById(R.id.imageView1);

        Glide.with(this)
                .load(R.drawable.bosque)
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade(500))
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.colorPrimary)))
                .into(bosque);


        openApp(true);
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this,
                        LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4500);
    }

}