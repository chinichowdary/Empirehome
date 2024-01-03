package com.pages;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;


	public class Allcustomers extends Testbase{
		@FindBy(xpath="//li[@class='treeview'][5]")
		WebElement Symbol;
		
		
		@FindBy(xpath = "//*[@id=\"sideBarMenu\"]/ul/li[6]/ul/li[1]/a")
		WebElement Allcustomers;
		
		
		@FindBy(xpath ="//a[@class='btn btn-add']" )
		WebElement addnew; // 
		
		@FindBy(xpath ="//div[@class='submit-button']" )
		WebElement customername;
		
		@FindBy(xpath ="/html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/div/div/div[2]/div/input ")
		WebElement mobilenumber;
		
		@FindBy(xpath ="/html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/div/div/div[3]/div/input " )
		WebElement emailid;
		
		
		@FindBy(xpath ="/html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/div/div/div[4]/div/input")
		WebElement number;
		
		@FindBy(xpath ="/html/body/div[3]/div/div/div/div/div/div[2]/form/div[1]/div/div/div/div[5]/div/input")
		WebElement organizationname;
		
		
		@FindBy(xpath ="//button[@class='btn btn-success']")
		WebElement saveclick;
		
		
	public Allcustomers(WebDriver driver) {
		PageFactory.initElements(driver, this );
		
	}

	public void customers() {
	Symbol.click();
	Allcustomers.click();
	addnew.click();
	customername.sendKeys("chinni");
	mobilenumber.sendKeys("9876543210");
	emailid.sendKeys("mahweswari@gmail.com");
	number.sendKeys("9876543210");
	organizationname.sendKeys("marolix");
	saveclick.click();


		
	}
	}

