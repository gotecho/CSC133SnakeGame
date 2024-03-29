package com.example.snakegame;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
public class PauseButton extends GameObject implements Drawable {
    // Constructor: Called when the PauseButton class is first created
    PauseButton(Context context) {
        super(context);
        setBitmap(loadAndScaleResource(context, R.drawable.pausebutton));

    }
    // Function: Draw the pause button
    @Override
    public void draw(Canvas canvas, Paint paint) {
        canvas.drawBitmap(getBitmap(), 10, 980, paint);
    }

    private Bitmap loadAndScaleResource(Context context, int resourceId) {
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), resourceId);
        return Bitmap.createScaledBitmap(bitmap, 100, 100, false);
    }
}
