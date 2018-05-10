package com.song.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by song on 2018/5/9.
 * Email：815464927@qq.com
 */
public class DrawView extends View {

    public DrawView(Context context) {
        this(context,null);
    }

    public DrawView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public DrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //init
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //drawCircle(canvas);
        //drawCircle2(canvas);
        //drawCircle3(canvas);
        //drawCircle4(canvas);

        //drawRect(canvas);
        //drawRect2(canvas);

        //drawPoint(canvas);
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(20);
        float[] pts = {0,0,50,50,100,100,150,150,200,200,250,250};
        canvas.drawPoints(pts,paint);

    }

    /**
     * 画一个点
     * @param canvas 画布
     */
    private void drawPoint(Canvas canvas) {

        Paint paint = new Paint();
        paint.setStrokeWidth(20);
        paint.setStrokeCap(Paint.Cap.ROUND);
        //paint.setStrokeCap(Paint.Cap.BUTT);
        //paint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(100,100,paint);
    }

    /**
     * 画矩形
     * @param canvas 画布
     */
    private void drawRect2(Canvas canvas) {

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        //RectF rectF = new RectF(100,100,500,500);
        //canvas.drawRect(rectF,paint);

        Rect rect = new Rect(100,100,500,500);
        paint.setColor(Color.RED);
        canvas.drawRect(rect,paint);
    }

    /**
     * 画两个矩形
     * @param canvas 画布
     */
    private void drawRect(Canvas canvas) {
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(100,100,200,200,paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawRect(400,100,500,200,paint);
    }

    /**
     * 画一个抗锯齿的圆
     * @param canvas 画布
     */
    private void drawCircle4(Canvas canvas) {
        //设置抗锯齿的画笔
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        //paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(400,400,300,paint);
    }

    /**
     * 画一个宽度为20个像素的圆
     * @param canvas 画布
     */
    private void drawCircle3(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        //paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(20);//设置线条的宽度为20个像素
        canvas.drawCircle(300,300,200,paint);
    }

    /**
     * 画一个空心圆
     * @param canvas 画布
     */
    private void drawCircle2(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        //paint.setStyle(Paint.Style.FILL);
        //paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawCircle(300,300,200,paint);
    }

    /**
     * 画一个实心圆
     * @param canvas 画布
     */
    private void drawCircle(Canvas canvas) {
        Paint paint = new Paint();
        //设置画笔颜色
        paint.setColor(Color.RED);
        //设置抗锯齿
        paint.setAntiAlias(true);
        //画一个实心圆
        canvas.drawCircle(400,400,300,paint);
    }
}
