package figure;

import java.awt.Image;
import java.awt.event.KeyEvent;

import tanksGame.Service;

public class Bullet extends Figure {

	private Image bulletImage = Service.loadImages(imageName);

	private int speed = 8;
	
	String direction;
	
	private boolean left = false;
	private boolean right = false;
	private boolean up = false;
	private boolean down = false;
	private boolean shot = false;
	
	public Bullet(int figureX, int figureY) {
		super("bulletBlue1.png", 32, figureX, figureY);

	}
	
	
	public void move() {

		if (left && figureX != 0 && shot) {
			figureX -= figureSize / speed;
			left = true;
			shot = false;
			bulletImage = Service.loadImages("l_" + imageName);
		}
		if (right && figureX != Service.SIZE && shot) {
			figureX += figureSize / speed;
			right = true;
			shot = false;
			bulletImage = Service.loadImages("r_" + imageName);;
		}
		if (up && figureY != 0 && shot) {
			figureY -= figureSize / speed;
			up = true;
			shot = false;
			bulletImage = Service.loadImages("u_" + imageName);;
		}
		if (down && figureY != Service.SIZE && shot) {
			figureY += figureSize / speed;
			down = true;
			shot = false;
			bulletImage = Service.loadImages("d_" + imageName);;
		}
	}


	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
			left = true;
			up = false;
			down = false;
		}
		if (key == KeyEvent.VK_RIGHT) {
			right = true;
			up = false;
			down = false;
		}

		if (key == KeyEvent.VK_UP) {
			right = false;
			up = true;
			left = false;
		}
		if (key == KeyEvent.VK_DOWN) {
			right = false;
			down = true;
			left = false;
		}
		if (key == KeyEvent.VK_SPACE) {
			shot = true;
		}
		
	}


	public Image getBulletImage() {
		return bulletImage;
	}


	public void setBulletImage(Image bulletImage) {
		this.bulletImage = bulletImage;
	}

	
	
	
	

}
