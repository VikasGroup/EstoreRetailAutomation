package utils;



import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.steps.estoreRetail_steps;


public class TabCatcher {
	public void setTab(){
		WebDriver driver=estoreRetail_steps.driver;
		 String base = driver.getWindowHandle();
			Set<String> set = driver.getWindowHandles();

			//set.remove(base);
			//assert set.size() == 1;
			
			/*if(set.toArray()[0].equals(base)){
				
			}else{
				driver.switchTo().window((String) set.toArray()[0]).close();
			}*/
			//driver.switchTo().window((String) set.toArray()[1]).close();
			System.out.println(driver.switchTo().window((String) set.toArray()[0]).getCurrentUrl());
			System.out.println("11111111"+driver.switchTo().window((String) set.toArray()[1]).getCurrentUrl());			
			//driver.switchTo().window((String) set.toArray()[1]);
			driver.switchTo().window(base);
	}
	public void setBaseTab(){
		WebDriver driver=estoreRetail_steps.driver;
		 String base = driver.getWindowHandle();
			Set<String> set = driver.getWindowHandles();

			//set.remove(base);
			//assert set.size() == 1;
			
			/*if(set.toArray()[0].equals(base)){
				
			}else{
				driver.switchTo().window((String) set.toArray()[0]).close();
			}*/
			//driver.switchTo().window(base).close();
			driver.switchTo().window((String) set.toArray()[1]);
			
	}
	public void setCurrentTab(){
		WebDriver driver=estoreRetail_steps.driver;
		 String base = driver.getWindowHandle();
			Set<String> set = driver.getWindowHandles();

			//set.remove(base);
			//assert set.size() == 1;
			
			/*if(set.toArray()[0].equals(base)){
				
			}else{
				driver.switchTo().window((String) set.toArray()[0]).close();
			}*/
			//driver.switchTo().window(base).close();
			driver.switchTo().window((String) set.toArray()[0]);
			
	}
	public void setBaseTabTnC(){
		WebDriver driver=estoreRetail_steps.driver;
		 String base = driver.getWindowHandle();
			Set<String> set = driver.getWindowHandles();
			//driver.switchTo().window(base).close();
			estoreRetail_steps.driver.switchTo().window((String) set.toArray()[1]);
			
	}
	public void closeTabTnC(){
		WebDriver driver=estoreRetail_steps.driver;
		 String base = driver.getWindowHandle();
			Set<String> set = driver.getWindowHandles();
			//driver.switchTo().window(base).close();
			
			//driver.switchTo().window((String) set.toArray()[1]).close();
			driver.switchTo().window(base);
	}

}
