package com.android.mounika.blinkingeffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void animate(View v){
        TextView textView= (TextView) findViewById(R.id.textView);
        Animation animation= AnimationUtils.loadAnimation(this,R.anim.myanimation);
        textView.startAnimation(animation);

    }
}
