package lecture4;

import lecture4.example.extendss.HomePage;
import lecture4.example.extendss.LoginPage;

import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{

		Cat murka = new Cat();
		Cat cat = new Cat("fishka");
		Cat bigCat = new Cat("Big", "black");





		LoginPage loginPage = new LoginPage();
		HomePage homePage = new HomePage();

		Scanner scanner = new Scanner(System.in);

		loginPage.openPage("login");

		String inputEmail =  loginPage.emailField;
		String inputPassword =  loginPage.passwordField;

		String clickButton = loginPage.getButtonLogin();

		String log =  homePage.logger;
//		String profile = homePage.getProfile();
		homePage.checkName("Dmytro");

	}

}
