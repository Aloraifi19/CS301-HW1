package edu.up.cs301.campusmap;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by fahadalarifi on 9/3/17.
 */

public class CustomToken extends SimpleMapToken
{





        public CustomToken(float xCoord, float yCoord)//constructor to send the x,y coordinates to the parent class
        {
            super(xCoord, yCoord);

        }

        @Override
        public void drawOn(Canvas canvas)
        {
            // paint the customed shape on the canvas

            paint = new Paint(); // defines new paint object to draw the whole shape in the same color

            this.paint.setColor(super.getRandomColor());// assigning a random color to the shape



            canvas.drawCircle(super.x, super.y, 10,this.paint);//head


            this.paint.setStrokeWidth(5);// assigning the lines' width

            canvas.drawLine(super.x,super.y,super.x,super.y+45,this.paint);//body

            canvas.drawLine(super.x,super.y+16,super.x+27,super.y+13,this.paint);//right hand
            canvas.drawLine(super.x,super.y+16,super.x-15,super.y+37,this.paint);//left hand

            canvas.drawLine(super.x,super.y+40,super.x+15,super.y+61,this.paint);//right foot
            canvas.drawLine(super.x,super.y+40,super.x-15,super.y+61,this.paint);//left foot




        }//drawOn

    }
