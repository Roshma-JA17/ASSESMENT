package com.capgemini.concurrency.executorexample;

public class RunnableTwo implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println("Executing the task Two");
			try {
				Thread.sleep(1000);
			}catch(Throwable e) {
				e.printStackTrace();
			}
		}
	}

}
