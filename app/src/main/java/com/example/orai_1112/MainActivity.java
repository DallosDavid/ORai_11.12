package com.example.orai_1112;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button buttonFadedin,buttonFadeout,buttonBounce,buttonzoomin,buttonzoomout,buttonrotate,buttonFrameAnim;
    private Animation fadeIn,fadeOut,Bounce,zoomin,zoomout,rotate;
    private ImageView imageViewFormation,imageViewFrameAnim;
    private  boolean runnig;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        buttonFadedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewFormation.startAnimation(fadeIn);
            }
        });

        buttonFadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewFormation.startAnimation(fadeOut);
            }
        });

        buttonBounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewFormation.startAnimation(Bounce);
            }
        });

        buttonzoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewFormation.startAnimation(zoomin);
            }
        });

        buttonzoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewFormation.startAnimation(zoomout);
            }
        });

        buttonrotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageViewFormation.startAnimation(rotate);
                buttonrotate.startAnimation(rotate);
            }
        });

            buttonFrameAnim.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                        if (!runnig)
                        {
                            ((AnimationDrawable) imageViewFormation.getBackground()).start();
                            runnig=true;
                        }
                        else{
                            ((AnimationDrawable) imageViewFormation.getBackground()).stop();
                            runnig=false;
                        }

                   }
               }
            );


    }
    public void init()
    {
        buttonFadedin=findViewById(R.id.buttonFadein);
        buttonFadeout=findViewById(R.id.buttonFadeout);
        buttonBounce=findViewById(R.id.buttonFadeBounce);
        buttonzoomin=findViewById(R.id.buttonzoomin);
        buttonzoomout=findViewById(R.id.buttonzoomout);
        buttonrotate=findViewById(R.id.buttonzoomrotate);
        buttonFrameAnim=findViewById(R.id.buttonFramAnim);

        imageViewFormation=findViewById(R.id.imageview_formation);
        imageViewFormation=findViewById(R.id.imageview_framAnim);

        fadeIn= AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        fadeOut= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade_out);
        Bounce= AnimationUtils.loadAnimation(MainActivity.this,R.anim.bounce);
        rotate= AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
        zoomin= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_in);
        zoomout= AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoom_out);
        runnig=false;

    }
}