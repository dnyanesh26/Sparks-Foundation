package dnyanesh_tsf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;  
import org.testng.annotations.Test;  
public class SparksTesting {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test(priority=1,groups="Home Page")
	public void TestPageTitle()
	{
		driver.get("https://www.thesparksfoundationsingapore.org/");
		String actualtitle=driver.getTitle();
		String expectedtitle= "The Sparks Foundation | Home";		if(actualtitle.equals(expectedtitle)) 
		{ 
			System.out.println("Page Title is correct"); 
		}
		else 
		{ 
			System.out.println("Page Title not correct"); 
		} 
	} 
	@Test(priority=2,groups="Home Page") 
	public void Logo() 
	{ 
		driver.get("https://www.thesparksfoundationsingapore.org/");
		boolean logo=driver.findElement(By.xpath("//*[@id=\"home\"]")).isDisplayed();
		if(logo) 
			System.out.println("Logo is present"); 
		else 
			System.out.println("Logo is not present"); 
	}
	
	@Test(priority=3,groups="Home Page") 
	public void VisionMissionLinkTest() 
	{ 
		driver.get("https://www.thesparksfoundationsingapore.org/"); 
		driver.findElement(By.xpath("//a[contains(text() , 'know more')]")).click(); 
	}
	
	@Test(priority=4,groups="Vision & Mission") 
	public void VisionMissionNoOfLinksTest() 
	{ 
		driver.get("https://www.thesparksfoundationsingapore.org/about/vision-mission-and-values/");
		int TotalCount=driver.findElements(By.tagName("a")).size(); 
		System.out.println("Total no of links available in this page="+TotalCount); 
		if(TotalCount == 73) 
			System.out.println("Correct Number of Links"); 
		else 
			System.out.println("Incorrect Number of Links"); 
	}
	
	@Test(priority=5,groups="Vision & Mission")
	public void ExecutiveTeamTextElementTest() 
	{ 
		driver.get("https://www.thesparksfoundationsingapore.org/about/vision-mission-and-values/"); 
		String actualTextElement=driver.findElement(By.linkText("Executive Team")).getText(); 
		String expectedTextElement="Executive Team"; 
		if(actualTextElement.equals(expectedTextElement)) 
			System.out.println("Text Element is correct"); 
		else 
			System.out.println("Text Element is not correct"); 
	} 
	
	@Test(priority=6,groups="Home Page") 
	public void JoinUsLinkTest() 
	{ 
		driver.get("https://www.thesparksfoundationsingapore.org/"); 
		driver.findElement(By.xpath("//a[contains(text() , 'Learn more')]")).click(); 
	}
		
	@Test(priority=7,groups="Join Us Page") 
	public void JoinUsPageNoOfLinkTest() 
	{
		driver.get("httos://www.thesparksfoundationsingapore.org/join-us/why-join-us/");
		int TotalCount=driver.findElements(By.tagName("a")).size(); 
		System.out.println("Total no of links available in this page="+TotalCount); 
		if(TotalCount==72) 
			System.out.println("Correct number of links"); 
		else 
			System.out.println("Incorrect number of links"); 
	} 
	
	@Test(priority=8,groups="Join Us Page") 
	public void InternshipPositionTextElementTest() 
	{ 
		driver.get("https://www.thesparksfoundationsingapore.org/join-us/why-join-us/"); 
		String actualText= driver.findElement(By.linkText("Internship Positions")).getText(); 
		String expectedText="Internship Positions"; 
		if(actualText.equals(expectedText)) 
			System.out.println("Text Element is correct"); 
		else 
			System.out.println("Text ELement is not correct"); 
	} 
	
	@Test(priority=9,groups="Home Page")
	public void visitNowLinKTest() 
	{ 
		driver.get("https://www.thesparksfoundationsingapore.org/"); 
		driver.findElement(By.xpath("//a[contains(text() , 'Visit Now')]")).click(); 
	}
	
	@Test(priority=10,groups="Policies and Code") 
	public void PoliciesNoOfLinkTest() 
	{ 
		driver.get("https://www.thesparksfoundationsingapore.org/policies-and-code/policies/"); 
		int TotalCount=driver.findElements(By.tagName("a")).size(); 
		System.out.println("Total no of links available in this page="+TotalCount); 
		if(TotalCount==71) 
			System.out.println("Correct number of links"); 
		else 
			System.out.println("Incorrect number of links"); 
	}
	
	@Test(priority=11,groups="Policies and Code") 
	public void PoliciesCorrectPageDisplayedTest() 
	{ 
	driver.get("https://www.thesparksfoundationsingapore.org/policies-and-code/policies/");
	boolean b=driver.findElement(By.linkText("Code of Ethics and Conduct")).isDisplayed(); 
	if(b) 
		System.out.println("Correct Page is displayed"); 
	else 
		System.out.println("Incorrect Page is displayed"); 
	}
	
	@Test(priority=12,groups="Home Page") 
	public void ContactUslinkTest() 
	{ 
		driver.get("https://www.thesparksfoundationsingapore.org/"); 
		driver.findElement(By.xpath("//a[contains(text() , 'Contact Us')]")).click(); 
	} 
	
	@Test(priority=13,groups="Contact Us") 
	public void ContactUsNoOfLinksTest() 
	{ 
		driver.get("https://www.thesparksfoundationsingapore.org/contact-us/"); 
		int TotalCount=driver.findElements(By.tagName("a")).size(); 
		System.out.println("Total no of links available in this page="+TotalCount); 
		if(TotalCount==67) 
			System.out.println("Correct number of links"); 
		else 
			System.out.println("Incorrect number of links"); 
	} 
	
	@Test(priority=14,groups="Home Page") 
	public void SparksPageGlobalLinkTest() 
	{ 
		driver.get("https://www.thesparksfoundationsingapore.org/"); 
		driver.findElement(By.xpath("//a[contains(text() , 'The Sparks Foundation (Global)')]")).click(); 
	} 
	
	@Test(priority=15,groups="Sparks Page (Global)") 
	public void CorrectPageDisplayedTest() 
	{ 
		driver.get("https://thesparksfoundation.info/"); 
		boolean b=driver.findElement(By.linkText("TSF India")).isDisplayed(); 
		if(b) 
			System.out.println("Correct Page is displayed"); 
		else 
			System.out.println("Incorrect page is displayed"); 
	}
	
	@Test(priority=16,groups="Sparks Page (Global)") 
	public void NoOfLinkTest() 
	{ 
		driver.get("https://thesparksfoundation.info/"); 
		int TotalCount=driver.findElements(By.tagName("a")).size(); 
		System.out.println("Total no of links available in this page."+TotalCount); 
		if(TotalCount==26) 
			System.out.println("Correct number of links"); 
		else 
			System.out.println("Incorrect number of links"); 
	} 
	
	@AfterMethod 
	public void close() 
	{ 
		driver.quit(); 
	} 
}
