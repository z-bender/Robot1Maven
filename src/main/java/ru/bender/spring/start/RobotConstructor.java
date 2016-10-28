package ru.bender.spring.start;


import ru.bender.spring.impls.sony.SonyHand;
import ru.bender.spring.impls.sony.SonyHead;
import ru.bender.spring.impls.toshiba.ToshibaLeg;

public class RobotConstructor {
	
	public static void main(String[] args){
		
		SonyHand sonyHand = new SonyHand();
		ToshibaLeg toshibaLeg = new ToshibaLeg();
		SonyHead sonyHead = new SonyHead();
		
		Robot robot = new Robot(sonyHand, toshibaLeg, sonyHead);
		
		robot.action();
		
		
	}

}
