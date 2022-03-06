package StepDefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.cuctomerpageobject;
import PageObject.loginpage;
import io.cucumber.java.en.*;

public class Steps extends  Baseclass {
	
	
	@Given("lauch chrome browser")
	public void lauch_chrome_browser() {
		//logger=Logger.getLogger("nop commerce");//Adding logger to our project//
		//PropertyConfigurator.configure("log4jproperties");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver=new ChromeDriver ();
		//logger.info("------launcing url-------");
	    lp=new loginpage(driver);   
	}
	
	

	@When("open url {string}")
	public void open_url(String url) {
		logger.info("------launcing url-------");
	   driver.get(url);
	}

	@When("enter email as this {string} password as {string}")
	public void enter_email_as_this_password_as(String email, String password) {
		logger.info("------launcing url-------");
	   lp.setUserName("email");
	   lp.setPassword("password");
	}

	@When("enter login")
	public void enter_login() {
		logger.info("------launcing url-------");
	    lp.clickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
	   if (driver.getPageSource().contains("Login was unsuccessful.")) {
		   driver.close();
		   logger.info("------launcing url-------");
		   Assert.assertTrue(false);
	   } else {
		   Assert.assertEquals(title, driver.getTitle());
	   }
	   Thread.sleep(3000);
	}

	@When("user click on logout button")
	public void user_click_on_logout_button() throws InterruptedException {
		logger.info("------launcing url-------");
		lp.cliclLogout();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
		logger.info("------launcing url-------");
        driver.close();
	}
	
	
	//Add customer info features//
	
	@Then("user can view dashboard")
	public void user_can_view_dashboard() {
		Addcust= new cuctomerpageobject(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", Addcust.getPageTitle());
	}

	@When("user click on customer menu")
	public void user_click_on_customer_menu() {
		Addcust.clickOnCostumerMenu();
	}

	@When("click on customer menu item")
	public void click_on_customer_menu_item() {
	    Addcust.clickOnCostumerMenuItem();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
	   Addcust.clickOnAddnew();
	}

	@Then("user can view Add customer page")
	public void user_can_view_add_customer_page() {
	    Assert.assertEquals("Add a new customer / nopCommerce administration", Addcust.getPageTitle());
	}

	@When("user enter customer info")
	public void user_enter_customer_info() throws InterruptedException {
	    String email= randomestring()+"@gmail.com";
	    Addcust.setEmail(email);
	    Addcust.setPassword("test123");
	    Addcust.setCustomerRoles("Guest");
	    Thread.sleep(3000);
	    
	    Addcust.setManagerOfVendor("Vendor 2");
	    Addcust.setGender("Male");
	    Addcust.setFirstName("pavan");
	    Addcust.setLastName("kumar");
	    Addcust.setDob("7/06/1995");
	    Addcust.setCompanyName("busyQA");
	    Addcust.setAdminContent("this is for trsting.....");
	}

	@When("click on save button")
	public void click_on_save_button() throws InterruptedException {
	    Addcust.clickOnSave();
	    Thread.sleep(2000);
	}

	@Then("user can view confirmation message  {string}")
	public void user_can_view_confirmation_message(String msg) {
	   Assert.assertTrue(driver.findElement(By.tagName("body")).getText().
			   contains("The new customer has been added successfully."));
	}


}
