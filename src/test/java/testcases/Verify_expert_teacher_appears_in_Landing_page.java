package testcases;

import base.Base;

public class Verify_expert_teacher_appears_in_Landing_page extends Base {

	public static void main(String[] args) {

		setup();

		// go to https:skyitschool.com
		navigateURL();

		// Get the text of the Element (H3) Expert Teacher
		// locate that element

		String s = getElementText("//h3[text()='Experts Teachers']");

		// Verify the text is "Experts Teachers"
		if (s.contentEquals("Experts Teachers"))
			System.out.println("Experts Teachers - Pass");
		else
			System.out.println("Experts Teachers - Fail");

		// driver.close();// close current tab of browser
		// driver.quit();// close the browser with all tab
		tearDown();

	}

}
