package com.qa.TestScripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmzonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\Downloads\\New folder\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    String s=driver.getTitle();
	    System.out.println(s);
	    int b=s.length();
	    System.out.println(b);
	    char ch[]=s.toCharArray();
	     
	    int uc=0,lc=0,num=0,spc=0,other=0;
	    for(int i=0;i<s.length();i++)
	    {
	    	if(Character.isUpperCase(ch[i]))
	    	{
	    		uc++;
	    	}
	    	else if(Character.isLowerCase(ch[i]))
	    		{
	    			lc++;
	    		}
	    	else if(Character.isDigit(ch[i]))
	    	{
	    		num++;
	    	}
	    	else if(Character.isSpaceChar(ch[i]))
	    	{
	    		spc++;
	    	}
	    	else 
	    	{
	    		other++;
	    	}
	    	
	    }	
	    System.out.println("No of Uppercase "+uc);
	    System.out.println("No of Lowercase "+lc);
	    System.out.println("No of Number "+num);
	    System.out.println("No of Space "+spc);
	    System.out.println("No of Special character "+other);
	   
	
	
	}

}
