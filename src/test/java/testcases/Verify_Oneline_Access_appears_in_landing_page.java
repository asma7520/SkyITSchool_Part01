package testcases;

import base.Base;

public class Verify_Oneline_Access_appears_in_landing_page extends Base {

	public static void main(String[] args) {

		setup();

		// go to https:skyitschool.com
		navigateURL();

		// Get the text of the Element (H3) online Access
		// locate that element

		String s = getElementText("//h3[text()='Online 24/7 Access']");

		// Verify the text is "Online 24/7 Access"
		if (s.contentEquals("Online 24/7 Access"))
			System.out.println("Online 24/7 Access - Pass");
		else
			System.out.println("Online 24/7 Access - Fail");
		// driver.close();// close current tab of browser
		// driver.quit();// close the browser with all tab
		tearDown();

	}

}
