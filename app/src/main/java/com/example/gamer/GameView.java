package com.example.gamer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class GameView extends View{
    private int posX=400;
    private int posY=600;
    private Bitmap bitmap;

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {

        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        if(posY>0&&posY<getHeight()-bitmap.getHeight()-50)
        this.posY = posY;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        canvas.drawLine(400,0,0,600,paint);
        bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.donaldtrump);
        canvas.drawBitmap(bitmap,posX,posY,paint);



    }
    void moveUp(){

        posY-=50;
    }
    void moveDown(){
        posY+=50;
    }
    void moveLeft(){
        if(posX>0){
            posX-=50;
        }else{
            posX = getWidth()-bitmap.getWidth();
        }

    }
    void moveRight(){
        if (posX < getWidth()-bitmap.getWidth()) {
            posX+=50;
        }else{
            posX =0;
        }

    }
    public GameView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
