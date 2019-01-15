package tanksGame;

import java.awt.Image;

import javax.swing.ImageIcon;

import figure.Bullet;
import figure.Figure;
import figure.Tank;

public class Service {

	public final static int SIZE = 640;

	public static Image loadImages(String imageName) {

		ImageIcon iil = new ImageIcon(imageName);
		Image name = iil.getImage();
		return name;

	}
	
	public static Image rotateImage(String imageName, boolean left, boolean right, boolean up, boolean down) {

		if (left) {
			imageName = "l_" + imageName;
		} else if (right) {
			imageName = "r_" + imageName;
		} else if (up) {
			imageName = "u_" + imageName;
		} else if (down) {
			imageName = "d_" + imageName;
		}
		System.out.println(imageName);
		ImageIcon iil = new ImageIcon(imageName);
		Image name = iil.getImage();
		
		return name;
	}
	
	/*public static int[] positioningFigure(Tank tank, Bullet bullet) {
		int[] position = {0,0};
		//if (tank.isDown()) {
			
		//}
		
		
		return position;
	}*/

}
