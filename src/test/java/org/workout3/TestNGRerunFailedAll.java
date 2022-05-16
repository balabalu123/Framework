package org.workout3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IAnnotationTransformer2;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class TestNGRerunFailedAll implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer retry = annotation.getRetryAnalyzer();
		
		if (retry==null) {
			
			
			annotation.setRetryAnalyzer(TestNGRerunFailed.class);
			
			
		}
		
		
		
		
		
	}

	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
