package Application;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.Enuns.Color;

public class ProgramInterFaceHerdar {

	public static void main(String[] args) {
		
		Shape shape_1 = new Circle(Color.BLACK, 4.0);
		Shape shape_2 = new Rectangle(Color.WHITE, 3.0, 5.0);
		
		System.out.println("Circle Color: " + shape_1.getColor());
		System.out.println("Circle Àrea: " + String.format("%.3f", shape_1.area()));
		System.out.println("Rectangle Color: " + shape_2.getColor());
		System.out.println("Rectangle Área: " + String.format("%.3f", shape_2.area()));		

	}
}
