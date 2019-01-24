package model.entities;

import model.Enuns.Color;

public abstract class AbstractShape implements ShapeInterFace {
	
	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}	

}
