package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by fahadalorifi on 9/3/17.
 */

public class SquareToken extends SimpleMapToken

{

    //protected float x; // my x coordinate
    //protected float y; // my y coordinate
    //protected float radius; //my radius
    //protected Paint paint;  //my color


   public SquareToken(float xCoord, float yCoord) {
      super(xCoord, yCoord);

   }

   @Override
   public void drawOn(Canvas canvas) {
       // paint the square on the canvas

       canvas.drawRect(super.x, super.y, super.x+30,super.y+30,super.paint);
   }//drawOn



}
