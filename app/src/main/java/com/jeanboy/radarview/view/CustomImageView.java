package com.jeanboy.radarview.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.ImageView;

@SuppressLint("AppCompatCustomView")
public class CustomImageView extends ImageView {

    private float[] points = new float[0];
    private Paint paint;
    private Path path;

    public CustomImageView(Context context) {
        super(context);
        init();
    }

    public CustomImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(2);

        path = new Path();
    }

    public void setPoints(float[] points) {
        this.points = points;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();
        float centerX = width / 2f;
        float centerY = height / 2f;
        float scale = Math.min(width, height) / 10f;

        // 绘制坐标点
        for (int i = 0; i < points.length; i += 2) {
            float x = centerX + points[i] * scale;
            float y = centerY - points[i + 1] * scale;
            canvas.drawCircle(x, y, 2f, paint);
        }

        // 绘制连线
        paint.setColor(Color.parseColor("#1AAE6C32"));
        path.reset();
        for (int i = 0; i < points.length; i += 2) {
            float x = centerX + points[i] * scale;
            float y = centerY - points[i + 1] * scale;
            if (i == 0) {
                path.moveTo(x, y);
            } else {
                path.lineTo(x, y);
            }
        }
        path.close();
        canvas.drawPath(path, paint);
    }
}