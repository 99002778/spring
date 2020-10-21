package com.lts.autowire;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	@Override
	public void CaluculateArea(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Area of Triangle:"+(0.5*x*y));

	}

}
