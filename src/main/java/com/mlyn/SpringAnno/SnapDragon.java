package com.mlyn.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public void process() {
		
		System.out.println("best CPU");
	}

}
