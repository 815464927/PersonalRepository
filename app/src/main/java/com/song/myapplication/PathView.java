package com.song.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by song on 2018/5/20.
 * Email：815464927@qq.com
 */
public class PathView extends View {

    Paint paint = new Paint();
    Path path = new Path();

    {
        //使用path对图形描述
        path.addArc(200,200,400,400,-225,225);
        path.arcTo(400,200,600,400,-180,225,false);
        path.lineTo(400,542);
    }

    public PathView(Context context) {
        this(context,null);
    }

    public PathView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public PathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //init

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //canvas.drawPath(path,paint);

        //addCircle(canvas);

        //LineTo(canvas);

        drawEVEN_ODD(canvas);
    }

    /**
     * Path.setFillType(Path.FillType ft) 设置填充方式---EVEN_ODD
     * 即 even-odd rule （奇偶原则）
     * @param canvas 画布
     */
    private void drawEVEN_ODD(Canvas canvas) {
        //===========================交叉圆============================
        Paint paint = new Paint();
        Path path = new Path();
        path.addCircle(200,200,100, Path.Direction.CW);
        path.addCircle(300,200,100, Path.Direction.CW);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path,paint);

        Path path1 = new Path();
        path1.setFillType(Path.FillType.EVEN_ODD);
        path1.addCircle(600,200,100, Path.Direction.CW);
        path1.addCircle(700,200,100, Path.Direction.CW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawPath(path1,paint);

        //===========================内嵌圆============================
        Path path2 = new Path();
        path2.addCircle(200,600,100, Path.Direction.CW);
        path2.addCircle(200,600,50, Path.Direction.CW);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path2,paint);

        Path path3 = new Path();
        path3.addCircle(600,600,100, Path.Direction.CW);
        path3.addCircle(600,600,50, Path.Direction.CW);
        paint.setStyle(Paint.Style.FILL);
        path3.setFillType(Path.FillType.EVEN_ODD);
        canvas.drawPath(path3,paint);

        //===========================重合五角星============================
        Path path4 = new Path();
        path4.moveTo(130,1000);
        path4.lineTo(370,1000);//横线
        path4.lineTo(170,1160);//撇线
        path4.lineTo(250,900);//左上
        path4.lineTo(330,1160);//右下
        path4.close();
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path4,paint);
        canvas.drawPath(path4,paint);

        Path path5 = new Path();
        path5.moveTo(530,1000);
        path5.lineTo(770,1000);//横线
        path5.lineTo(570,1160);//撇线
        path5.lineTo(650,900);//左上
        path5.lineTo(730,1160);//右下
        path5.close();
        paint.setStyle(Paint.Style.FILL);
        path5.setFillType(Path.FillType.EVEN_ODD);
        canvas.drawPath(path5,paint);
        canvas.drawPath(path5,paint);
    }

    /**
     * xxxTo() ——画线（直线或曲线）
     * 画线
     * @param canvas 画布
     */
    private void LineTo(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.lineTo(100,100);//由当前位置（0,0）向（100,100）画一条直线

//        path.rLineTo(200,0);//相对于（100,100），向有200个像素的位置画一条直线
//        path.moveTo(400,100);
//        path.lineTo(400,200);

        //path.arcTo(100,100,300,300,-90,90,true);
        //path.addArc(100,100,300,300,-90,90);

        path.moveTo(300,300);
        path.lineTo(600,300);
        path.lineTo(450,500);
        path.close();

        canvas.drawPath(path,paint);

    }

    /**
     * addXxx() ——添加子图形
     * 画一个圆
     * @param canvas 画布
     */
    private void addCircle(Canvas canvas) {
        Paint paint = new Paint();
        Path path = new Path();
        path.addCircle(100,100,50, Path.Direction.CCW);
        canvas.drawPath(path,paint);
    }
}
