package user_registration;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class BollyTest {
	public static void main(String[] args) throws InterruptedException, IOException {

//		step 1 -> get the java representation object of the physical file
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData.properties");

//		step 2 -> Create the object of Properties class of java and load the keys
		Properties pObj = new Properties();
		pObj.load(fis);

//		step - 3 -> get the value by using getProperty()
		String BROWSER = pObj.getProperty("bro");
		String URL = pObj.getProperty("url");
		String USER_NAME = pObj.getProperty("us_un");
		String USER_PASSWORD = pObj.getProperty("us_pwd");
		String ADMIN_NAME = pObj.getProperty("admin_un");
		String ADMIN_PASSWORD = pObj.getProperty("admin_pwd");
 
		WebDriver driver = null;

		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equals("safari")) {
			driver = new SafariDriver();
		} else if (BROWSER.equals("ie")) {
			driver = new InternetExplorerDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		Login
		driver.get("http://49.249.28.218:8081/TestServer/Build/Online_Couple_Marriage_Registration_System/");

		driver.findElement(By.partialLinkText("User")).click();

		WebElement mob = driver.findElement(By.name("mobno"));
		mob.sendKeys("1234567890");

		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("Test@123");

		driver.findElement(By.name("login")).click();

//		Fill one reg form 
		driver.findElement(By.xpath("//span[text()='Registration Form']")).click();

		WebElement dateOfWed = driver.findElement(By.name("dom"));
		dateOfWed.sendKeys("08/15/2025");

		WebElement hus = driver.findElement(By.name("nofhusband"));
		hus.sendKeys("Amitabh Bachchan");

		WebElement husPic = driver.findElement(By.name("husimage"));
		husPic.sendKeys("C:\\Users\\User\\Basic_Selenium\\marriage-registration\\resources\\abpassport.jpeg");

		WebElement wif = driver.findElement(By.name("nofwife"));
		wif.sendKeys("Jaya Bachchan");

		WebElement wifPic = driver.findElement(By.name("wifeimage"));
		wifPic.sendKeys("C:\\Users\\User\\Basic_Selenium\\marriage-registration\\resources\\jbpassport.jpeg");

		WebElement hrel = driver.findElement(By.name("hreligion"));
		hrel.sendKeys("Hindu");

		WebElement wrel = driver.findElement(By.name("wreligion"));
		wrel.sendKeys("Hindu");

		WebElement hdob = driver.findElement(By.name("hdob"));
		hdob.sendKeys("11/10/1942");

		WebElement wdob = driver.findElement(By.name("wdob"));
		wdob.sendKeys("11/10/1948");

		WebElement hwdDD = driver.findElement(By.name("hsbmarriage"));
		Select selHus = new Select(hwdDD);
		selHus.selectByIndex(1);

		WebElement wwdDD = driver.findElement(By.name("wsbmarriage"));
		Select selWife = new Select(wwdDD);
		selWife.selectByIndex(1);

		String add = "Jalsa, B/2, Kapol Housing Society, VL Mehta Road, Juhu Mumbai - 400049";

		WebElement hAdd = driver.findElement(By.name("haddress"));
		hAdd.sendKeys(add);
 
		WebElement wAdd = driver.findElement(By.name("waddress"));
		wAdd.sendKeys(add);

		WebElement hZip = driver.findElement(By.name("hzipcode"));
		hZip.sendKeys("400049");

		WebElement wZip = driver.findElement(By.name("wzipcode"));
		wZip.sendKeys("400049");

		WebElement hState = driver.findElement(By.name("hstate"));
		hState.sendKeys("Maharashtra");

		WebElement wState = driver.findElement(By.name("wstate"));
		wState.sendKeys("Maharashtra");

		String hadh = (int) (Math.random() * (999999999)) + "021";
		String wadh = (int) (Math.random() * (999999999)) + "021";

		WebElement hAdhar = driver.findElement(By.name("hadharno"));
		hAdhar.sendKeys(hadh);

		WebElement wAdhar = driver.findElement(By.name("wadharno"));
		wAdhar.sendKeys(wadh);

		WebElement wit1 = driver.findElement(By.name("witnessnamef"));
		wit1.sendKeys("Govind");

		WebElement wit1add = driver.findElement(By.name("waddressfirst"));
		wit1add.sendKeys("Ashoknagar");

		WebElement wit2 = driver.findElement(By.name("witnessnames"));
		wit2.sendKeys("Namrata");

		WebElement wit2add = driver.findElement(By.name("waddresssec"));
		wit2add.sendKeys("Sector 3");

		WebElement wit3 = driver.findElement(By.name("witnessnamet"));
		wit3.sendKeys("Pankaj");

		WebElement wit3add = driver.findElement(By.name("waddressthird"));
		wit3add.sendKeys("Sonipat");

		driver.findElement(By.id("submit")).click();

//		driver.switchTo().alert().accept();

		System.out.println("Registered Successfully!!!");

		Thread.sleep(3000);
		driver.quit();
	}
}
