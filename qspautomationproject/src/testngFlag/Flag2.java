package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(enabled = true)
  public void login() {
	  
	  Reporter.log("Login Performed",true);
  }
  @Test(enabled = false)
  public void logout() {
	  Reporter.log("Logout Performed",true);
  }
}
