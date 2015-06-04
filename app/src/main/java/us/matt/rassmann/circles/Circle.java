package us.matt.rassmann.circles;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;

/**
 * Created by Matt on 6/2/2015.
 */

public class Circle{
    int radius;
    Color color;
    int decaySpeed;
    Point center;

    public Circle(int _radius, int _decaySpeed, Point _center){
        radius = _radius;
        decaySpeed = _decaySpeed;
        center = _center;
    }

    public Circle(int _radius, int _decaySpeed,Color _color, Point _center){
        radius = _radius;
        decaySpeed = _decaySpeed;
        color= _color;
        center = _center;
    }
    public void render(){
        //renders the circles
        Canvas grid = new Canvas(Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888));


    }
    // Checks whether the player has touched a circle
    public boolean isDestoryed(){
        //Using the Distance Formula see if the distance to the center of the circle is
        //greater than the radius
        return true;
    }
}

