package TestLayer;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.PersonalPage;

public class PersonalPageTest extends BaseClass{
	
	@Test
	public void validatePersonalPage() throws InterruptedException
	{
		PersonalPage personalPage = new PersonalPage();
		personalPage.personalPageFunctionality("Durgesh", "Prajapati", "274402");
	}

}
