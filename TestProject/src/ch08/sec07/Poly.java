package ch08.sec07;

public class Poly extends DrawingObject{
	
	public Poly() {
		penColor = "green";
	}
	
	@Override
	public void draw() {
		System.out.println(penColor + "색상으로 사각형 그리기");

	}
}
