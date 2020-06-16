package com.qa.amazon.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.amazon.base.TestBase;

public class loginPage extends TestBase {
	//pageFactory or object repository 
//	====================================================
@FindBy(name="user_name")
WebElement  username;
@FindBy(xpath="//*[@name='lastname'")
WebElement lastname;


	

}
