package com.crm.Vtiger.GenericUtils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserClass implements IRetryAnalyzer{

	int count=0;
	int retryLimit=5;
	@Override
	public boolean retry(ITestResult result) {
		
		if(count<retryLimit)
		{
			count++;
			return true;
		}
		return false;
		
	}

	

}
