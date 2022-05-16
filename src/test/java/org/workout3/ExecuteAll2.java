package org.workout3;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ExecuteAll2 {
	
	public static void main(String[] args) {
		
		Result r = JUnitCore.runClasses(A1.class,B1.class);
		
		System.out.println("Failed Count "+r.getFailureCount());
		System.out.println("Run Count"+r.getRunCount());
		System.out.println("Ignore Count"+r.getIgnoreCount());
		System.out.println("Runtime"+r.getRunTime());
		
	     int passCount=	r.getRunCount()-r.getFailureCount();
	     System.out.println("passCount"+passCount);
	     
	     List<Failure> fail = r.getFailures();
	     for (Failure f : fail) {
	    	 System.out.println(f);
	    	 
			
	    	 
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
