package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Paint;

/*
 * Created by fahadalorifi on 9/3/17.
 */

public class SquareToken extends SimpleMapToken

{


   public SquareToken(float xCoord, float yCoord)//constructor to send the x,y coordinates to the parent class
   {
      super(xCoord, yCoord);

   }

   @Override
   public void drawOn(Canvas canvas)
   {
       // paint the square on the canvas

       canvas.drawRect(super.x, super.y, super.x+30,super.y+30,super.paint);// takes the coordinates from the parent class and generating a new color

   }//drawOn



}
