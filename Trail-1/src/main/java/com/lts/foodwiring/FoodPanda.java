package com.lts.foodwiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodPanda {
	@Autowired
	@Qualifier("indian")
	Menu imenu;
	@Autowired
	@Qualifier("chinies")
	Menu cmenu;
	public void ShoWMenu(String choice){
		 if(choice.equals("indian")) {
			 System.out.println(imenu.itemsAvailable());
		 }
		 else
			 System.out.println(cmenu.itemsAvailable());
		
	}
	

}
