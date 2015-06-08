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
    Canvas canvas = new Canvas();
    public static Circle test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView = new GameView(this);
        test = new Circle();

        setContentView(gameView);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
         x = (int) event.getX();
         y = (int) event.getY();
        Point point = new Point(x,y);
        test.setCenter(point);
        test.setRadius(50);
        Log.d("onTouchEvent", "In touch event");
        gameView.invalidate();
        return true;
    }



}
