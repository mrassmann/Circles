package us.matt.rassmann.circles;

import android.content.pm.ActivityInfo;
import android.graphics.Canvas;
import android.graphics.Point;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;


public class GameActivity extends FragmentActivity {
    int x;
    int y;
    GameView gameView;
    public static Circle test;
    public Level lev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView = new GameView(this);
        test = new Circle();
        lev = new Level();
        lev.makeCircleArray();

        setContentView(gameView);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
         x = (int) event.getX();
         y = (int) event.getY();
        //Point point = new Point(x,y);
        //test.setCenter(point);
        //test.setRadius(50);
        Log.d("onTouchEvent", "In touch event");
        if(test.isDestroyed()){

        }
        gameView.invalidate();

        return true;
    }

    public Level getLevel(){
        return lev;
    }



}
