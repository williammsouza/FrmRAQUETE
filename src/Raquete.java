
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author William Souza
 */
public class Raquete {
        
        private static final int Y = 330;
	private static final int WIDTH = 60;
	private static final int HEIGHT = 10;
        private FrmBolas frm;
	int x = 0;
	int xa = 0;
       
        public Raquete(FrmBolas frm){
           this.frm = frm;
        }
        
        public void mover()
        {
         if (x + xa > 0 && x + xa < frm.getWidth() - WIDTH)
			x = x + xa;
        }

        public void desenhar(Graphics g) {
		g.fillRect(x, Y, WIDTH, HEIGHT);
	}

	public void keyReleased(KeyEvent e) {
		xa = 0;
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			xa = -1;
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			xa = 1;
	}

	public Rectangle getBounds() {
		return new Rectangle(x, Y, WIDTH, HEIGHT);
	}

	public int getTopY() {
		return Y;
	}
}
