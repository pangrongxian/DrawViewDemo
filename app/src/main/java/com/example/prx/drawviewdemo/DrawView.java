package com.example.prx.drawviewdemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by prx on 2016/4/4 23:36.
 * Email:pangrongxian@gmail.com
 */
public class DrawView extends View {

    private float currentX = 30;
    private float currentY = 30;

    //定义并创建画笔
    Paint paint = new Paint();

    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画笔的颜色
        paint.setColor(Color.RED);
        //绘制一个小圆
        canvas.drawCircle(currentX,currentY,15,paint);
    }
    //为该组件的触碰事件重写事件的处理方法
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //修改currentX,currentY 两个属性
        currentX = event.getX();
        currentY = event.getY();
        //通知当前组件重绘自己
        invalidate();
        //返回true表明该处理方法已经处理该事件
        return true;
    }
}
