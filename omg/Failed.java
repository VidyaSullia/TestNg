package omg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer{
int min=1;
int max=10;
	@Override
	public boolean retry(ITestResult arg0) {
	if(min<=max) {
		min++;
		return true;
	}
	return false;
	}

}
