package figure;

import java.awt.Image;

import tanksGame.Service;

public class TileGrass1 extends Figure {

	private Image grassImage = Service.loadImages(imageName);

	public TileGrass1(int figureX, int figureY) {
		super("tileGrass1.png", 100, figureX, figureY);
	}

	public Image getGrassImage() {
		return grassImage;
	}

	public void setGrassImage(Image grassImage) {
		this.grassImage = grassImage;
	}

}
