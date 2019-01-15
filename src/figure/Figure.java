package figure;

public abstract class Figure {
	
	protected String imageName;
	protected int figureSize;
	
	protected int figureX;
	protected int figureY;
	
	public Figure(String imageName, int figureSize, int figureX, int figureY) {
		super();
		
		this.imageName = imageName;
		this.figureSize = figureSize;
		this.figureX = figureX;
		this.figureY = figureY;
	}
	
	

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public int getFigureSize() {
		return figureSize;
	}

	public void setFigureSize(int figureSize) {
		this.figureSize = figureSize;
	}

	public int getFigureX() {
		return figureX;
	}

	public void setFigureX(int figureX) {
		this.figureX = figureX;
	}

	public int getFigureY() {
		return figureY;
	}

	public void setFigureY(int figureY) {
		this.figureY = figureY;
	}
	
}
