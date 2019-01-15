package figure;

import java.awt.Image;

import tanksGame.Service;

public class TileGrass_transitionE extends Figure {

	private Image grassImage = Service.loadImages(imageName);
	
	public TileGrass_transitionE(int figureX, int figureY) {
		super("tileGrass_transitionE.png", 100, figureX, figureY);
	}

	public Image getGrassImage() {
		return grassImage;
	}

	public void setGrassImage(Image grassImage) {
		this.grassImage = grassImage;
	}
	
	
}
