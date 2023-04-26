package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Check
{
	WebDriver driver;
	@Given("user is open the browser")
	public void user_is_open_the_browser() 
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium folder\\chromedriver.exe");
		// driver= new ChromeDriver();
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(o);

	}

	@And("user enters URL")
	public void user_enters_url()
	{
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user enters username and password")
	public void user_enters_username_and_password()
	{
		WebElement e = driver.findElement(By.xpath("//input[@id='username']"));
		e.sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);

	}

	@Then("click on task")
	public void click_on_task()
	{
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
	}

	@Then("click on logout")
	public void click_on_logout()
	{
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}

	@Then("user close browser")
	public void user_close_browser()
	{
		driver.close();
	}


}
