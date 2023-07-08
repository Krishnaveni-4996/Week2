package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Krishnaveni");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select (sourceDD);
		sec.selectByIndex(4);
		WebElement marketingDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select se = new Select (marketingDD);
		se.selectByVisibleText("Automobile");
		WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel = new Select (ownershipDD);
		sel.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		
		
				}

	
}

