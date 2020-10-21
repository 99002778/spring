package com.lts.autowire;

import org.springframework.stereotype.Component;

@Component("shape")
public class Rectangle implements Shape {

	@Override
	public void CaluculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle:"+x*y);
	}

}
