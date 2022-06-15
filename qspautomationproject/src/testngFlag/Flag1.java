package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description ="This method perform login operation")
  public void f() {
	  Reporter.log("Login is performed",true);
  }
}
