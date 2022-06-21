package com.pageobj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpom {
	WebDriver driver;
	@FindBy(how=How.XPATH,using="//input[@name='email']")
	
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	@FindBy(how=How.XPATH,using="//input[@name='pass']")
	private WebElement pass;
	public WebElement getPass() {
		return pass;
	}
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	@FindBy(how=How.XPATH,using="//img[@class='hu5pjgll bixrwtb6'][1]")
	
	private WebElement friends;
	public WebElement Getfriends() {
		return friends;
	}
	
}
