package com.zanyxdev.gameloop;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    private ImageView image = null;
    private final int FPS = 40;
    private int directionX = 1;
    private int directionY = 1;
    private int speed = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources resources = getResources();
        image = (ImageView) findViewById(R.id.imageView);
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                int x = (int) image.getX();
                int y = (int) image.getY();
                Log.d("TAG", "x=" + x + " y=" + y);
                //Then we’ll go ahead and increment that position.
                image.setX(x + (speed * directionX));
                image.setY(y + (speed * directionY));
            }
        }, 0, 1000 / FPS);
    }
}
