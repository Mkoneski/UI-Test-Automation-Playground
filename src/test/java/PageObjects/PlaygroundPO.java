package PageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PlaygroundPO {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public PlaygroundPO(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(16));
	}

	By dynamicId = By.xpath("//*[@id=\"overview\"]/div/div[1]/div[1]/h3/a");

	By buttonDynamicId = By.xpath("//button[contains(@class, 'btn btn-primary')]");

	By ajaxData = By.xpath("//a[normalize-space()='AJAX Data']");

	By buttonTriggeringAjaxData = By.xpath("//button[@id='ajaxButton']");

	By scrollBars = By.xpath("//a[normalize-space()='Scrollbars']");

	By hidingButton = By.xpath("//button[@id='hidingButton']");

	By visibility = By.xpath("//a[normalize-space()='Visibility']");

	By hideOtherButtons = By.xpath("//button[@id='hideButton']");

	By opacityButton = By.xpath("//button[@id='transparentButton']");

	By removedButton = By.xpath("//button[@id='removedButton']");

	By visibilityHiddenButton = By.xpath("//button[@id='invisibleButton']");

	By zeroWidthButton = By.xpath("//button[@id='zeroWidthButton']");

	By displayNoneButton = By.xpath("//button[@id='notdisplayedButton']");

	By overlappedButton = By.xpath("//button[@id='overlappedButton']");

	By offScreenButton = By.xpath("//button[@id='offscreenButton']");

	By classAttribute = By.xpath("//a[normalize-space()='Class Attribute']");

	By blueButton = By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]");

	By overlappedElement = By.xpath("//a[normalize-space()='Overlapped Element']");
	
	By fieldLastName = By.xpath("//input[@id='name']");
	
	By clientSideDelay = By.xpath("//a[normalize-space()='Client Side Delay']");
	
	By buttonTrigeringDelay = By.xpath("//button[@id='ajaxButton']");
	
	By dynamicTable = By.xpath("//a[normalize-space()='Dynamic Table']");
	
	By sampleApp = By.xpath("//a[normalize-space()='Sample App']");
	
	By userName = By.xpath("//input[@placeholder='User Name' and @name='UserName']\r\n"	+ "");
	
	By password = By.xpath("//input[@type='password'='User Name' and @name='Password']");
	
	By logIn = By.xpath("//button[@id='login']");
	
	By shadowDom = By.xpath("//a[normalize-space()='Shadow DOM']");
	
	By hiddenLayers = By.xpath("//a[normalize-space()='Hidden Layers']");
	
	By hiddenLayersButton = By.xpath("//button[@id='blueButton']");
	
	By click = By.xpath("//a[normalize-space()='Click']");
	
	By buttonThatIgnores = By.xpath("//button[@id='badButton']");
	
	By verifyText = By.xpath("//a[normalize-space()='Verify Text']");
	
	By mouseOver = By.xpath("//a[normalize-space()='Mouse Over']");
	
	By clickMe = By.xpath("//a[@title='Click me']");
	
	By waitForDelay = By.xpath("//a[normalize-space()='Load Delay']");
	
	By textInput = By.xpath("//a[normalize-space()='Text Input']");
	
	By enterText = By.xpath("//input[@id='newButtonName']");
	
	By inputTextButton = By.xpath("//button[@id='updatingButton']");
	
	By nonBreaking = By.xpath("//a[normalize-space()='Non-Breaking Space']");
	
	By nonBreakingButton = By.xpath("//button[text()='My\u00A0Button']");
	
	By progressBar = By.xpath("//a[normalize-space()='Progress Bar']");
	
	By clickStart = By.xpath("//button[@id='startButton']");
	
	By clickStop = By.xpath("//button[@id='stopButton']");
	
	
	
	public void clickStop () {
		driver.findElement(clickStop).click();
	}
	
	public void clickStart () {
		driver.findElement(clickStart).click();
	}
	
	
	
	public void clickProressBar () {
		driver.findElement(progressBar).click();
	}
	
	public void clickNonBreakingButton () {
		driver.findElement(nonBreakingButton).click();
	}
	
	public void clickNonBreaking () {
		driver.findElement(nonBreaking).click();
	}
	
	public void clickTextinputButton () {
		driver.findElement(inputTextButton).click();
	}
	
	public void enterTextField (String enterTextNow) {
		driver.findElement(enterText).sendKeys(enterTextNow);
	}
	
	public void textInput () {
		driver.findElement(textInput).click();
	}
	
	public void loadDelay () {
		driver.findElement(waitForDelay).click();
	}
	
	public void waitForTheButton () {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Button Appearing After Delay']")));
		driver.findElement(By.xpath("//button[normalize-space()='Button Appearing After Delay']")).click();
	}
	
	
	public void hoverAndClick () {
		
		
		WebElement elementToHover = driver.findElement(clickMe);
		Actions actions = new Actions(driver);

		
		actions.moveToElement(elementToHover).perform();				
		driver.findElement(By.xpath("//a[@title='Active Link']")).click();
		driver.findElement(By.xpath("//a[@title='Active Link']")).click();

		
	}
	
	public void clickMouseOver () {
		driver.findElement(mouseOver).click();
	}
	
	public void findTheWelcome () {
		
		String path = driver.findElement(By.xpath("//div[@class='bg-primary']/span[contains(text(), 'Welcome')]")).getText();
		System.out.println(path);

	}
	
	
	public void verifyText () {
		driver.findElement(verifyText).click();
	}
	
	public void clickBadButton () {
		driver.findElement(buttonThatIgnores).click();
	}
	
	
	public void click () {
		driver.findElement(click).click();
	}
	
	
	public void hiddenLayers () {
		driver.findElement(hiddenLayers).click();
	}
	
	public void hiddenLayersButton () {
		driver.findElement(By.id("greenButton")).click();
	}
	
	public void hiddenLayersButtonAgain () {
		driver.findElement(By.id("blueButton")).click();
	}
	

	public void dynamicId() {
		driver.findElement(dynamicId).click();
	}

	public void dynamicIdButton() {
		driver.findElement(buttonDynamicId).click();
	}

	public void ajaxData() {
		driver.findElement(ajaxData).click();
	}

	public void buttonAjax() {
		driver.findElement(buttonTriggeringAjaxData).click();
	}

	public void waitForSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void waitForAjaxData(By locator) {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
	}

	public void testWithAssertions(WebElement element, String expectedText) {

		String actualText = element.getText();
		Assert.assertTrue(actualText.contains(expectedText));

	}

	public void ClickscrollBars() {
		driver.findElement(scrollBars).click();
	}

	public void findButtonWithScroll(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public void clickHidingButton() {
		driver.findElement(hidingButton).click();
	}

	public void clickVisibility() {
		driver.findElement(visibility).click();
	}

	public void clickHideButton() {
		driver.findElement(hideOtherButtons).click();
	}

	public void clickclassAttribute() {
		driver.findElement(classAttribute).click();
	}

	public void clickBlueButton() {
		driver.findElement(blueButton).click();
	}

	public void popUpAlert() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert found.");
			
		}
	}

	public void popUpAlert2() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void clickOverlappeedElement() {
		driver.findElement(overlappedElement).click();
	}

	public void findFieldWithScroll(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public void writeLastName (String lastNameText) {
		driver.findElement(fieldLastName).sendKeys(lastNameText);
	} 
	
	public void clickClientDelaySide () {
		driver.findElement(clientSideDelay).click();
	}
	
	public void clickButtonTriggeringDelay () {
		driver.findElement(buttonTrigeringDelay).click();
	}
	
	public void clickDynamicTable () {
		driver.findElement(dynamicTable).click();
	}
	
	public void clickSampleApp () {
		driver.findElement(sampleApp).click();
	}
	
	public void enterUserName (String userNameText) {
		driver.findElement(userName).sendKeys(userNameText);
	}
	
	public void enterPassword (String passText) {
		driver.findElement(password).sendKeys(passText);
	}
	
	public void clickLogin () {
		driver.findElement(logIn).click();
	}
	
	public void clickShadowDom () {
		driver.findElement(shadowDom).click();
	}
		
	
	public void clickGearIcon() {
        // Find the parent element containing the shadow host
        WebElement parentElement = driver.findElement(By.cssSelector(".container"));

        // Execute JavaScript to find the shadow host element within the parent element
        WebElement shadowHost = (WebElement) ((JavascriptExecutor) driver).executeScript(
                "return arguments[0].shadowRoot.querySelector('guid-generator')", parentElement);

        // Execute JavaScript to find and click the button within the shadow root
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].shadowRoot.querySelector('button.button-generate#buttonGenerate').click()", shadowHost);
    }
		

	
	public void clickCopyIcon () {
		
	}


	public boolean testNextPage(String nextPageIndeed) {

		WebElement element = driver.findElement(By.xpath(nextPageIndeed));

		if (element.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

}

