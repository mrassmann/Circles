package us.matt.rassmann.circles;

import android.graphics.Point;

import java.util.ArrayList;

/**
 * Created by Matt on 6/2/2015.
 */
public class Level {
ArrayList<Circle> circs = new ArrayList<Circle>();
    public void makeCircleArray(){
        circs.add(new Circle(100,.1,new Point(110,110)));
        circs.add(new Circle(100,.1,new Point(210,110)));
        circs.add(new Circle(100,.1,new Point(310,110)));
        circs.add(new Circle(100,.1,new Point(110,210)));
        circs.add(new Circle(100,.1,new Point(210,210)));
        circs.add(new Circle(100,.1,new Point(310,210)));
        circs.add(new Circle(100,.1,new Point(110,310)));
        circs.add(new Circle(100,.1,new Point(210,310)));
        circs.add(new Circle(100,.1,new Point(310,310)));
    }

    public ArrayList<Circle> getCircs(){
        return circs;
    }
}
