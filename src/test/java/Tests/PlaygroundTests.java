package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


import Base.Base;
import PageObjects.PlaygroundPO;

public class PlaygroundTests extends Base {

	PlaygroundPO po = new PlaygroundPO(driver);

	@Test
	public void dynamicIdTest() {

		po.dynamicId();
		po.testNextPage("//title[text()='Dynamic ID']");
		po.dynamicIdButton();

	}

	@Test
	public void ajaxRequestTest() {

		po.ajaxData();
		po.testNextPage("//title[text()='AJAX Data']");
		po.buttonAjax();
		po.waitForSeconds(16);
		// po.testNextPage("//p[@class='bg-success']");
		// Assert.assertEquals(driver.findElements(By.xpath("//p[@class='bg-success']")),
		// "Data loaded with AJAX get request.");
		 Assert.assertEquals(driver.findElements(By.xpath("//p[@class='bg-success']")).size(), 1);

		

	}

	@Test
	public void ajaxRequestTestWithVisibility() {

		po.ajaxData();
		po.testNextPage("//title[text()='AJAX Data']");
		po.buttonAjax();
		po.waitForAjaxData(null);
		//po.waitForSeconds(16);
		WebElement element = driver.findElement(By.xpath("//p[@class='bg-success']"));
		String actualText = element.getText();
		String expectedText = "Data loaded with AJAX get request.";
		Assert.assertEquals(actualText, expectedText);
		
		
	}
	
	@Test
	public void scrollBarsTest () {
		po.ClickscrollBars();
		po.testNextPage("//title[text()='Scrollbars']");
		WebElement buttonElement = driver.findElement(By.xpath("//button[@id='hidingButton']"));
		po.findButtonWithScroll(buttonElement);
		po.clickHidingButton();
	}
	
	@Test
	public void visibilityTest () {
		po.clickVisibility();
		po.testNextPage("//title[text()='Visibility']");
		po.clickHideButton();
		Assert.assertFalse(driver.findElement(By.xpath("//button[@id='transparentButton']")).isDisplayed());
		//Assert.assertFalse(driver.findElement(By.xpath("//button[@id='removedButton']")).isDisplayed());
		Assert.assertFalse(driver.findElement(By.xpath("//button[@id='invisibleButton']")).isDisplayed());
		Assert.assertFalse(driver.findElement(By.xpath("//button[@id='zeroWidthButton']")).isDisplayed());
		Assert.assertFalse(driver.findElement(By.xpath("//button[@id='notdisplayedButton']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//button[@id='overlappedButton']")).isDisplayed());
		Assert.assertFalse(driver.findElement(By.xpath("//button[@id='offscreenButton']")).isDisplayed());
	}
	
	@Test
	public void classAttributeTest () {
		po.clickclassAttribute();
		po.testNextPage("//title[text()='Class Attribute']");
		po.clickBlueButton();
		//po.popUpAlert();
		po.popUpAlert2();
	}
	
	@Test
	public void overlappedElementTest () {
		po.clickOverlappeedElement();
		po.testNextPage("//title[text()='Overlapped Element']");
		WebElement fieldElement = driver.findElement(By.xpath("//input[@id='name']"));
		po.findFieldWithScroll(fieldElement);
		po.writeLastName("Koneski");
	}
	
	@Test
	public void clientSideDelayTest () {
		po.clickClientDelaySide();
		po.testNextPage("//title[text()='Client Side Delay']");
		po.clickButtonTriggeringDelay();
		po.waitForSeconds(16);
		WebElement element = driver.findElement(By.xpath("//p[@class='bg-success']"));
		String actualText = element.getText();
		String expectedText = "Data calculated on the client side.";
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test
	public void dynamicTableTest () {
		po.clickDynamicTable();
		po.testNextPage("//title[text()='Dynamic Table']");
		
		WebElement cpuValueElement = driver.findElement(By.xpath("//span[text()='Chrome']/parent::div/span[contains(text(), '%')]"));
		String cpuValue = cpuValueElement.getText();
		System.out.println(cpuValue);
		
		WebElement yellowLabel = driver.findElement(By.xpath("//p[@class='bg-warning']"));
		String yellowLabelValue = yellowLabel.getText();
		System.out.println(yellowLabelValue);
		
		//Assert.assertTrue(cpuValue.equals(yellowLabelValue));
		//Assert.assertEquals(cpuValue.trim(), yellowLabelValue.trim());				
		Assert.assertTrue(yellowLabelValue.contains(cpuValue));
		
	}
	
	@Test
	public void sampleAppTest () {
		po.clickSampleApp();
		po.testNextPage("//title[text()='Sample App']");
		po.enterUserName("marjan");
		po.enterPassword("pwd");
		po.clickLogin();
		
		WebElement loginSuccText = driver.findElement(By.xpath("//label[@id='loginstatus']"));
		String succLogin = loginSuccText.getText();
		
		Assert.assertEquals(succLogin, "Welcome, marjan!");
		
	}
	
	@Test
	public void shadowDomTest () {
		po.clickShadowDom();
		po.testNextPage("//title[text()='Shadow DOM']");
		
	}
	
	@Test
	public void hiddenLayersTest () {
		
		po.hiddenLayers();
		po.testNextPage("//title[text()='Hidden Layers']");
		po.hiddenLayersButton();
		po.hiddenLayersButtonAgain();
		
	}
	
	@Test
	public void clickTest () {
		
		po.click();
		po.testNextPage("//title[text()='Click']");
		po.clickBadButton();
		
	}
	
	@Test
	public void verifyTextTest () {
		
		po.verifyText();
		String path = driver.findElement(By.xpath("//div[@class='bg-primary']/span[contains(text(), 'Welcome')]")).getText();
		System.out.println(path);

		Assert.assertTrue(path.contains("Welcome"));
	}
	
	@Test
	public void mouseOverTest () {
		
		po.clickMouseOver();
		
		/*
		WebElement elementToHover = driver.findElement(By.xpath("//a[@title='Click me']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).perform();
		driver.findElement(By.xpath("//a[@title='Active Link']")).click();
		driver.findElement(By.xpath("//a[@title='Active Link']")).click();
		*/
		
		po.hoverAndClick();
		Assert.assertTrue(driver.findElement(By.xpath("//span[@id='clickCount'][contains(text(), '" + '2' + "')]")).isDisplayed());
		
	}
	
	
	@Test
	public void loadDelayTest () {
		
		po.loadDelay();
		po.waitForTheButton();
		
		Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Button Appearing After Delay']")).isDisplayed());
		
	}
	
	@Test
	public void textInputTest () {
		
		po.textInput();
		po.enterTextField("mofo");
		po.clickTextinputButton();
				
		WebElement button = driver.findElement(By.cssSelector("button.btn-primary"));		
		String buttonText = button.getText();
	
		WebElement inputField = driver.findElement(By.id("newButtonName"));		
		String inputText = inputField.getAttribute("value");
		
		Assert.assertEquals(buttonText, inputText);

		
	}
	
	@Test
	public void nonBreakingSpaceTest () {
		
		po.clickNonBreaking();
		//driver.findElement(By.xpath("//button[text()='My\u00A0Button']")).click();
		po.clickNonBreakingButton();
	}
	
	@Test
	public void progreessBarTest () {
		
		po.clickProressBar();
		po.clickStart();
		
		WebElement progressBar = driver.findElement(By.xpath("//div[@id='progressBar']"));
		int currentValue = Integer.parseInt(progressBar.getAttribute("aria-valuenow"));
		 while (currentValue < 75) {
	            progressBar.click();
	            currentValue = Integer.parseInt(progressBar.getAttribute("aria-valuenow"));
	        }
		 
		 po.clickStop();

	        // Assert that the progress bar value is now 75
	        Assert.assertEquals(75, currentValue);
		
		
	}

}
