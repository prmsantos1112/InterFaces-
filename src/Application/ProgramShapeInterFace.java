package Application;

import model.Enuns.Color;
import model.entities.AbstractShape;
import model.entities.CircleShapeInterFace;
import model.entities.RectangleShapeInterFace;

public class ProgramShapeInterFace {

	public static void main(String[] args) {
		
		AbstractShape shape_1 = new CircleShapeInterFace(Color.BLACK, 2.0);
		AbstractShape shape_2 = new RectangleShapeInterFace(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle Color: " + shape_1.getColor());
		System.out.println("Circle Àrea: " + String.format("%.3f", shape_1.area()));
		System.out.println("Rectangle Color: " + shape_2.getColor());
		System.out.println("Rectangle Área: " + String.format("%.3f", shape_2.area()));		

	}
}
