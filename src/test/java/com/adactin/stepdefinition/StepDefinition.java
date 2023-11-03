package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
 public static WebDriver driver = RunnerClass.driver;
 
 @Given("^user Launch The Url In Adactin Application$")
 public void user_Launch_The_Url_In_Adactin_Application() throws Throwable {
	 driver.get("https://adactinhotelapp.com/");
     
      
 }

 @When("^user Enter The Username In The Username Field$")
 public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {
	 driver.findElement(By.id("username")).sendKeys("Rajadurai1123");
      
 }

 @When("^user Enter The Password In The Password Field$")
 public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
	 driver.findElement(By.name("password")).sendKeys("Raj@3");
      
 }

 @Then("^user Click The Login Button And It Navigate To Search Hotel Page$")
 public void user_Click_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
	 driver.findElement(By.id("login")).click();
	 
	 
      
 }
 
 @When("^user Select The Location$")
 public void user_Select_The_Location() throws Throwable {
		WebElement singledd = driver.findElement(By.id("location"));
		Select s = new Select(singledd);
		s.selectByIndex(4);
      
 }

 @When("^user Select The Hotels$")
 public void user_Select_The_Hotels() throws Throwable {}

 @When("^user Select The Room Type$")
 public void user_Select_The_Room_Type() throws Throwable {
	 WebElement hoteltype = driver.findElement(By.id("room_type"));
		Select b = new Select(hoteltype);
		b.selectByVisibleText("Double");
      
 }

 @When("^user Select The Number Of Rooms$")
 public void user_Select_The_Number_Of_Rooms() throws Throwable {
	 WebElement rooms = driver.findElement(By.id("room_nos"));
		Select c = new Select(rooms);
		c.selectByIndex(3);
      
 }

 @When("^user Select The Check In Date$")
 public void user_Select_The_Check_In_Date() throws Throwable {
     driver.findElement(By.name("datepick_in")).sendKeys("31/10/2023");
      
 }

 @When("^user Select The Check Out Date$")
 public void user_Select_The_Check_Out_Date() throws Throwable {
     driver.findElement(By.name("datepick_out")).sendKeys("01/11/2023");
      
 }

 @When("^user Select The Adults Per Room$")
 public void user_Select_The_Aśḍdults_Per_Room() throws Throwable {
	 WebElement adr = driver.findElement(By.id("adult_room"));
		Select d = new Select(adr);
		d.selectByIndex(1);
      
 }

 @When("^user Select The Children Per Room$")
 public void user_Select_The_Children_Per_Room() throws Throwable {
	 WebElement chi = driver.findElement(By.id("child_room"));
		Select e = new Select(chi);
		e.selectByIndex(2);
      
 }

 @Then("^user Click The Search Button And Its Navigate To The Selected Hotel Page$")
 public void user_Click_The_Search_Button_And_Its_Navigate_To_The_Selected_Hotel_Page() throws Throwable {
	 driver.findElement(By.id("Submit")).click();
      
 }
 @When("^user Click The Radio Button To Confirm The Hotel$")
 public void user_Click_The_Radio_Button_To_Confirm_The_Hotel() throws Throwable {
	 driver.findElement(By.id("radiobutton_2")).click();
      
 }
 
 

 @Then("^user Click The Continue Button And Its Navigate To The Book A Hotel Page$")
 public void user_Click_The_Continue_Button_And_Its_Navigate_To_The_Book_A_Hotel_Page() throws Throwable {
     
	 driver.findElement(By.name("continue")).click();
 }


 @When("^user Enter The First Name$")
 public void user_Enter_The_First_Name() throws Throwable {
	 driver.findElement(By.name("first_name")).sendKeys("raja");
 }

 @When("^user Enter The Last Name$")
 public void user_Enter_The_Last_Name() throws Throwable {
	 driver.findElement(By.name("last_name")).sendKeys("durai");
 }

 @When("^user Enter The Billing Address$")
 public void user_Enter_The_Billing_Address() throws Throwable {
	 driver.findElement(By.name("address")).sendKeys("pillaiyar kovil st");
 }

 @When("^user Enter The Credit Card No$")
 public void user_Enter_The_Credit_Card_No() throws Throwable {
	 driver.findElement(By.name("cc_num")).sendKeys("1234567890123456");
 }

 @When("^user Enter The  Credit Card Type$")
 public void user_Enter_The_Credit_Card_Type() throws Throwable {
		WebElement cct = driver.findElement(By.id("cc_type"));
		Select n = new Select(cct);
		n.selectByIndex(2);
 }

 @When("^user Enter The Expiry Date$")
 public void user_Enter_The_Expiry_Date() throws Throwable {
	 WebElement ccm = driver.findElement(By.name("cc_exp_month"));
		Select m = new Select(ccm);
		m.selectByValue("1");
		
		 WebElement ccy = driver.findElement(By.name("cc_exp_year"));
			Select y = new Select(ccy);
			y.selectByValue("2013");
 }
 

 @When("^user Enter The CVV Number$")
 public void user_Enter_The_CVV_Number() throws Throwable {

	 driver.findElement(By.name("cc_cvv")).sendKeys("223");
 }
 

 @Then("^user Click The Book Now Button And Navigates To Next Page$")
 public void user_Click_The_Book_Now_Button_And_Navigates_To_Next_Page() throws Throwable {
	 driver.findElement(By.id("book_now")).click();
 }

 


	}


