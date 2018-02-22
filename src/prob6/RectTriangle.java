package prob6;

public class RectTriangle extends Shape {
	private int width;
	private int height;

	public RectTriangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		
		return width * height /2;
	}

	@Override
	public double getPerimeter() {
		return width + height + Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
