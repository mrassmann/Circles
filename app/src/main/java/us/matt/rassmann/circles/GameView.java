package us.matt.rassmann.circles;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

/**
 * Created by Matt on 6/2/2015.
 */
public class GameView extends View {

    public GameView(Context context){
        super(context);
    }

    protected void onDraw(Canvas canvas){
        Log.d("onDraw","In onDraw");
        super.onDraw(canvas);
        GameActivity.test.render(canvas);
    }

}
