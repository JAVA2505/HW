package figure;

import java.awt.Image;

import tanksGame.Service;

public class CrateMetal extends Figure {
	
	private Image grassImage = Service.loadImages(imageName);

	public CrateMetal(int figureX, int figureY) {
		super("crateMetal.png", 100, figureX, figureY);

	}
	
	public void move() {

		grassImage = Service.loadImages(imageName);

	}

	public Image getGrassImage() {
		return grassImage;
	}

	public void setGrassImage(Image grassImage) {
		this.grassImage = grassImage;
	}
	
	
	
	

}
