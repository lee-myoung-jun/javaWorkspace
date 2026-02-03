package ch08.sec07;

public class Rect extends DrawingObject{
	
	public Rect() {
		penColor = "red";
	}
	
	@Override
	public void draw() {
		System.out.println(penColor + "색상으로 선 그리기");
		
	}
}
