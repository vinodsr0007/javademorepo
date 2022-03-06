package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class cuctomerpageobject {
	public WebDriver ldriver;
	
	public cuctomerpageobject(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	By lnkCustomers_menu=By.xpath("//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]");
	By lnkCustomers_menuitem=By.xpath("//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/p[1]");
	
	By btnAddnew=By.xpath("//body/div[3]/div[1]/form[1]/div[1]/div[1]/a[1]");
	By txtEmail=By.xpath("//input[@id='Email']");
	By txtPassword=By.xpath("//input[@id='Password']");
	
	By txtcostomerRoles=By.xpath("//body/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-"
			+ "cards[1]/nop-card[1]/div[1]/div[2]/div[10]/div[2]/div[1]/div[1]/div[1]/div[1]");
	
	By lstitemAdministations=By.xpath("//span[contains(text(),'Administrators')]");
	By lstitemRegistered=By.xpath("//span[contains(text(),'Registered')]");
	By lstitemGuests=By.xpath("//span[contains(text(),'Guests')]");
	By lstitemVendors=By.xpath("//span[contains(text(),'Vendors')]");
	
	By drpmgrofVendors=By.xpath("//*[@id='VendorId']");  
	By rdMaleGendor=By.id("Gender_Male");
	By rdFemaleGendor=By.id("Gender_Femail");
	
	By txtFirstName=By.xpath("//input[@id='FirstName']");
	By txtLastName=By.xpath("//input[@id='LastName']");
	
	By txtDob= By.xpath("//input[@id='DateOfBirth']");
	By txtCompanyName= By.xpath("//input[@id='Company']");
	
	By txtAdminContent= By.xpath("//textarea[@id='AdminContent']");
	By btnSave= By.xpath("//buttton[@name='Save']");
	
	//Action methods//
	
	public String getPageTitle() {
		return ldriver.getTitle();
	}
	
	public void clickOnCostumerMenu() {
		ldriver.findElement(lnkCustomers_menu).click();
	}
	
	public void clickOnCostumerMenuItem() {
		ldriver.findElement(lnkCustomers_menuitem).click();
	}
	
	public void clickOnAddnew() {
		ldriver.findElement(btnAddnew).click();
	}
	
	public void setEmail(String email) {
		ldriver.findElement(txtEmail).sendKeys(email);
	}
	
	public void setPassword(String password) {
		ldriver.findElement(txtPassword).sendKeys(password);
	}
	
	public void setCustomerRoles(String role) throws InterruptedException {
		if(!role.equals("Vendors")) {
			ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]"));
		}
		ldriver.findElement(txtcostomerRoles).click();
		
		WebElement listitem;
		Thread.sleep(3000);
		if(role.equals("Administations")) {
			listitem=ldriver.findElement(lstitemAdministations);
		}
		else if(role.equals("Guests")) {
			listitem=ldriver.findElement(lstitemGuests);
		}
		else if(role.equals("Registered")) {
			listitem=ldriver.findElement(lstitemRegistered);
		}
		else if(role.equals("Vendors")) {
			listitem=ldriver.findElement(lstitemVendors);
		}		else {
			listitem=ldriver.findElement(lstitemGuests);
		}
		
		listitem.click();
		Thread.sleep(3000);
		
		JavascriptExecutor js= (JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].clicl();", listitem);
	}
	     public void setManagerOfVendor(String value) {
	    	 Select drp= new Select(ldriver.findElement(drpmgrofVendors));
	    	 drp.selectByVisibleText(value);
	     }
	     
	     public void setGender(String gender) {
	    	 if(gender.equals("Male")) {
	    		 ldriver.findElement(rdMaleGendor).click();
	    	 }
	    	 else if (gender.equals("Female")) {
	    		 ldriver.findElement(rdFemaleGendor).click();
	    	 }
	    	 else {
	    		 ldriver.findElement(rdMaleGendor).click();
	    	 }
	     }
	     
	     public void setFirstName(String fname) {
	    	 ldriver.findElement(txtFirstName).sendKeys(fname);
	     }
	     
	     public void setLastName(String lname) {
	    	 ldriver.findElement(txtLastName).sendKeys(lname);
	     }
	     public void setDob(String dob) {
	    	 ldriver.findElement(txtDob).sendKeys(dob);
	     }
	     public void setCompanyName(String comname) {
	    	 ldriver.findElement(txtCompanyName).sendKeys(comname);
	     }
	     public void setAdminContent(String content) {
	    	 ldriver.findElement(txtAdminContent).sendKeys(content);
	     }
	     public void clickOnSave() {
	    	 ldriver.findElement(btnSave).click();
	     }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


