package com.lts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.lts.autowire.ShapeFactory;
import com.lts.foodwiring.FoodPanda;

@SpringBootApplication
public class Trail1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Trail1Application.class, args);
	}
@Autowired
ApplicationContext context,t;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Employee employee=context.getBean(Employee.class);
		//System.out.println(employee);
		//Student s=t.getBean(Student.class);
		//System.out.println(s);
		//ShapeFactory sf=context.getBean(ShapeFactory.class);
		// sf.printArea(10, 20);
		FoodPanda fp=context.getBean(FoodPanda.class);
		fp.ShoWMenu("indian");
		
		
	}

}
