package model.entities;

import model.Enuns.Color;

public class CircleShapeInterFace extends AbstractShape {
	
	private Double radius;
	
	public CircleShapeInterFace(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}	

}
