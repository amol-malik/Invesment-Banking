package policybazar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class program02 {
	public static void main(String[] args) throws InterruptedException {
		
		int b=1;
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(b+" ");
				b++;
			}
			System.out.println();
		}
		System.setProperty("webdriver chrome. driver", "chromedriver");

		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
			
//		 WebElement img1=driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/img"));
//		 WebElement img2=driver.findElement(By.xpath("/html/body/div[1]/ul/li[2]/img"));
//		 WebElement target=driver.findElement(By.xpath("//div[@id='trash']"));
//		 WebElement frm=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
//		Actions act=new Actions(driver);
//		 driver.switchTo().frame(frm);
//		 act.dragAndDrop(img1, target).perform();
//		 Thread.sleep(2000);
//			act.dragAndDrop(img2, target).build().perform();
//		 Thread.sleep(2000);	
//			
//		 driver.close();
//		
//			
			

	}

}
