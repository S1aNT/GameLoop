package com.zanyxdev.gameloop;

import android.graphics.Bitmap;


public class Sprite {
    int x;
    int y;
    int directionX = 1;
    int directionY = 1;
    int speed = 100;
    Bitmap image;
    int color = 0;

    public Sprite(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Sprite(int x, int y, Bitmap image, int color) {
        this(x, y, image);
        this.color = color;
    }

    public Sprite(int x, int y, Bitmap image) {
        this(x, y);
        this.image = image;
    }
}