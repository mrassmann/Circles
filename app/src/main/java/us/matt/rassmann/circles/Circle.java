package us.matt.rassmann.circles;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.Log;
import android.view.View;

/**
 * Created by Matt on 6/2/2015.
 */

public class Circle{
    int radius;
    Color color;
    double decaySpeed;
    Point center;
    boolean flag = true;

    public Circle(){
        radius = 100;
        center = new Point(400,400);
    }

    public Circle(int _radius, double _decaySpeed, Point _center){
        radius = _radius;
        decaySpeed = _decaySpeed;
        center = _center;
    }

    public Circle(int _radius, double _decaySpeed, Color _color, Point _center){
        radius = _radius;
        decaySpeed = _decaySpeed;
        color= _color;
        center = _center;
    }
    public void render(Canvas canvas){
        //renders the circles
        Log.d("flag",flag+"");
        if(!flag){
            Log.d("render","Entered Render");
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.RED);
            canvas.drawCircle(center.x, center.y, radius, paint);
        }
        flag = false;


    }
    // Checks whether the player has touched a circle
    public boolean isDestroyed(){
        //Using the Distance Formula see if the distance to the center of the circle is
        //greater than the radius

        return true;
    }

    public Point getCenter(){
        return center;
    }

    public int getRadius(){
        return radius;
    }

    public Color getColor(){
        return color;
    }

    public void setCenter(Point point){
        center = point;
    }

    public void setRadius(int rad){
        radius = rad;
    }

    public void setColor(Color col){
        color = col;
    }
}

