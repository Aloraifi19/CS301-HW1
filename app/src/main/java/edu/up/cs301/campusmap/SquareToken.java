package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Paint;



  /*
   *This class represents a single map token (square) that can be drawn on a canvas. This class is a child class of SimpleMapToken
   * It only overrides the drawing method
   *
   * @author of child class <Fahd Aloraifi>
   *@version September 2017
   *
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
