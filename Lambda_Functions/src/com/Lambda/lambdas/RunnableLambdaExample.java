package com.Lambda.lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {

				System.out.println("Inside Runnable 1");
			}
		};
		
		new Thread(runnable).start();
		
		Runnable runnable2 = () -> {
			System.out.println("Inside Runnable 2");
		};
		
		new Thread(runnable2).start();
		
		// Java 8 style
		
		new Thread(() -> System.out.println("Inside Runnable")).start();
	}

}
