package com.mlyn.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("samsung")
public class Samsung {

	@Autowired
	MobileProcessor cpu;

	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {

		System.out.println("Octa Core, 4gb Ram, 12Mp Camera");
		cpu.process();
	}

}
