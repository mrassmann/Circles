package us.matt.rassmann.circles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.Log;
import android.view.View;
import us.matt.rassmann.circles.Circle;

import java.util.ArrayList;

/**
 * Created by Matt on 6/2/2015.
 */
public class GameView extends View {

    public GameView(Context context){
        super(context);
    }
    protected void onDraw(Canvas canvas, GameActivity act){
        Log.d("onDraw","In onDraw");
        super.onDraw(canvas);
        for(int x=0;x<act.getLevel().getCircs().size();x++) {
            act.getLevel().getCircs().get(x).render(canvas);
        }
    }

}
