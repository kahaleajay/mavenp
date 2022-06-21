package com.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.Utility.BaseClass;
import com.pageobj.loginpom;

public class test_login  extends BaseClass{
	@Test
	public void test001(){
		loginpom login=PageFactory.initElements(driver, loginpom.class);
		 login.getEmail().sendKeys("kahaleajay@gmail.com");
		 login.getPass().sendKeys("Ajay@12345");
		 login.getLogin().click();
		 login.Getfriends().click();
	}
	

}
