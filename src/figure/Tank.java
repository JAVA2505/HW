package figure;

import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import tanksGame.Service;

public class Tank extends Figure {

	private int speed = 8;

	private Image tankImage = Service.loadImages(imageName);

	private boolean left = false;
	private boolean right = false;
	private boolean up = false;
	private boolean down = false;

	public Tank() {
		super("tank_blue.png", 32, 0, 0);
	}

	public void move() {
		if (left && figureX != 0) {
			figureX -= figureSize / speed;
			left = false;
			tankImage = Service.loadImages("l_" + imageName);
		}
		if (right && figureX != Service.SIZE) {
			figureX += figureSize / speed;
			right = false;
			tankImage = Service.loadImages("r_" + imageName);;
		}
		if (up && figureY != 0) {
			figureY -= figureSize / speed;
			up = false;
			tankImage = Service.loadImages("u_" + imageName);;
		}
		if (down && figureY != Service.SIZE) {
			figureY += figureSize / speed;
			down = false;
			tankImage = Service.loadImages("d_" + imageName);;
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
		if (key == KeyEvent.VK_DOWN && !up) {
			right = false;
			down = true;
			left = false;
		}
	}

	public Image getTankImage() {
		return tankImage;
	}

	public void setTankImage(Image tankImage) {
		this.tankImage = tankImage;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}
	
	
	
	
}
