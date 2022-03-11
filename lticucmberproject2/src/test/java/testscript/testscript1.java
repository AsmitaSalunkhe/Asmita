package testscript;
import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class testscript1 {
	WebDriver driver;
	
	@Given("user open chrome browser")
	public void user_open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asmita Salunkhe\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
  }

	@Given("navigates to newtours")
	public void navigates_to_newtours() {
		driver.get("https://demo.guru99.com/test/newtours/");
	    
	}
	@Then("click on Register button")
	public void click_on_Register_button() {
		driver.findElement(By.linkText("REGISTER")).click();
	    
	}

	@Given("enter username as{string}")
	public void enter_username_as(String string) {
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	}

	@Given("enter password as{string}")
	public void enter_password_as(String string) {
		driver.findElement(By.name("password")).sendKeys("Mercury");
	   
	}
	@Then("user enters confirm password")
	public void user_enters_confirm_password() {
	    driver.findElement(By.name("confirmPassword")).sendKeys("Mercury");
	}

	@Given("user clicks On submit")
	public void user_clicks_On_submit() {
		driver.findElement(By.name("submit")).click();
	    
	}
    @Given("verify login success")
	public void verify_login_success() {
	   Assert.assertTrue(driver.getTitle().contains("REGISTER")); 
	}


	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	   
	}



}
