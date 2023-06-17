package testcases;

import base.Base;

public class Verify_online_courses_appears_in_Landing_page extends Base {

	public static void main(String[] args) {

		setup();

		// go to https:skyitschool.com
		navigateURL();


		// Get the text of the Element (H3) online course
		// and get the text of that element

		String s = getElementText("//h3[text()='Online Courses']");

		// Verify the text is "Online Courses"
		if (s.contentEquals("Online Courses"))
			System.out.println("Online Courses - Pass");
		else
			System.out.println("Online Courses - Fail");
		// driver.close();// close current tab of browser
		// driver.quit();// close the browser with all tab
		tearDown();

	}

}
