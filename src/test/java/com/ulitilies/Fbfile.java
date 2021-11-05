package com.ulitilies;

	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;



	public class Fbfile  extends BaseClass {
		
		@FindBy(id="email")
		private WebElement txtUser;
		@FindBy(id="pass")
		private WebElement txtPass;
		@FindBy(xpath="//button[@name='login']")
		private WebElement btnClick;
		
		public void FBLogin() {
			PageFactory.initElements(driver, this);
		}

		public void getTxtUser(String uname) {
			
			txtUser.sendKeys("uname");
			
		}

		public void getTxtPass(String pass) {
			
			txtPass.sendKeys("pass");
			
		}

		public void getBtnClick() {
			btnClick.click();
			
		}

		
			
		}

		

	



