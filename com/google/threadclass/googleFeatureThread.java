package com.google.threadclass;


import Multithreading.GooglePage;

public class googleFeatureThread extends Thread {
	
	public String browserName;
	GooglePage googlePage;
	
	//Constructor
	
	public googleFeatureThread(String threadName, String browserName) {
		super(threadName);
		this.browserName = browserName;
		googlePage = new GooglePage();
		
	}
	
	@Override
	public void run() {
		
		System.out.println("thread -- started " + Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
			googlePage.setUp(this.browserName);
			googlePage.googlesearch();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			googlePage.tearDown();
		}
		
		System.out.println("thread -- ended" + Thread.currentThread().getName());
	}

}
