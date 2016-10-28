package ru.bender.spring.impls.sony;

import ru.bender.spring.interfaces.Hand;

public class SonyHand implements Hand{
	
	public void catchSomething(){
		System.out.println("Catched from Sony!!");
	}

}
