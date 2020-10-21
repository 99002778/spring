package com.lts.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {
	@Autowired
	@Qualifier("triangle")
	Shape shape;
	@Autowired
	@Qualifier("triangle")
	Shape nshape;
	public void printArea(int x,int y)
	{
		shape.CaluculateArea(x,y);
		nshape.CaluculateArea(x, y);
	}

}
