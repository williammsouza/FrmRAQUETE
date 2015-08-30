

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author William Souza
 */
public class Bola {
        
    public static final int DIAMETER = 30;
	int x = 0;
	int y = 0;
	int xa = 1;
	int ya = 1;
     private FrmBolas frm;
        
        
      public  void mover()
        {
           x=x + xa;
           y=y +ya;
        }

       public void desenha(Graphics g)
        {
           g.setColor(Color.pink);
           g.fillOval(x,y,40,40);
        }
       
        public boolean collision() {
		return frm.ract.getBounds().intersects(getBounds());
	}

            public Rectangle getBounds() {
               return new Rectangle(x, y, DIAMETER, DIAMETER);
            }

	
	

}
