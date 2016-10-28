package ru.bender.spring.impls.toshiba;

import ru.bender.spring.interfaces.Hand;

public class ToshibaHand implements Hand{
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

}
