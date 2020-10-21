package com.lts.foodwiring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class Chinies implements Menu {

	@Override
	public List<String> itemsAvailable() {
		// TODO Auto-generated method stub
		return Arrays.asList("Anhui","Zhejiang");
	}

}
