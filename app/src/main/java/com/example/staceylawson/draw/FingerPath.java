package com.example.staceylawson.draw;


import android.graphics.Path;

import static android.graphics.Color.BLUE;

public class FingerPath {
    public int color;
    public int strokeWidth;
    public Path path;

    public FingerPath(int color, int strokeWidth, Path path) {
        this.color = color;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }
}