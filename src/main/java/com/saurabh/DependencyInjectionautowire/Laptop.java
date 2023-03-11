package com.saurabh.DependencyInjectionautowire;

import org.springframework.stereotype.Component;

// import org.springframework.context.annotation.ComponentScan;
@Component
public class Laptop {
	private int make;

	public void run() {
		System.out.println("running");
	}

	public int getMake() {
		return make;
	}

	public void setMake(int make) {
		this.make = make;
	}

}
