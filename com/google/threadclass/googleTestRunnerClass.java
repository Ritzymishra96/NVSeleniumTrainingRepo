package com.google.threadclass;

public class googleTestRunnerClass {

	public static void main(String[] args) {


		Thread T1 = new googleFeatureThread("chrome thread", "chrome");
		
		Thread T2 = new googleFeatureThread("firefox thread", "firefox");

		System.out.println("thread started ....");
		
		T1.start();
		T2.start();

	}

}
