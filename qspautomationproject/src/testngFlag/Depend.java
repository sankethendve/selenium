package testngFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depend {
  @Test
  public void login() {
	  Reporter.log("loginToActitime");
  }
  @Test(priority = -1,dependsOnMethods = "createContact")
  public void logout() {
	  Reporter.log("logout from the actitime",true);
  }
  @Test(dependsOnMethods = "login")
  public void createContact() {
	  Reporter.log("create contact");
  }
}
