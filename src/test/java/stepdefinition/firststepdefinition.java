package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
public class firststepdefinition {
	@Given("User mouse event actions using to build on course offered")
	public void user_mouse_event_actions_using_to_build_on_course_offered() {
	  System.out.println("User mouse event actions using to build on course offered");
	}
	@When("click on {string} in webpage")
	public void click_on_in_webpage(String string) {
	  System.out.println("click on QA Automation Course Brochure. in webpage");
	}
	@When("navigate back")
	public void navigate_back() {
	    System.out.println("navigate back");
	}
	@When("move to over the text box:{string}")
	public void move_to_over_the_text_box(String string) {
	    System.out.println("move to over the text box:divya");
	}
	@When("user mouse event actions using double click on {string} in webpage")
	public void user_mouse_event_actions_using_double_click_on_in_webpage(String string) {
	    System.out.println("user mouse event actions using double click on Double Click Me in webpage");
	}
	@When("right click on my webpage")
	public void right_click_on_my_webpage() {
	  System.out.println("right click on my webpage");
	}
	@When("click on {string}")
	public void click_on(String string) {
	  System.out.println("click on Alert Popup");
	}
	@When("click on {string} gettext and {string} the alert box")
	public void click_on_gettext_and_the_alert_box(String string, String string2) {
	  System.out.println("click on Alert Box gettext and accept the alert box");
	}
	@When("click on {string} gettext and {string} the alert box and gettext")
	public void click_on_gettext_and_the_alert_box_and_gettext(String string, String string2) {
	   System.out.println("And click on Confirm Alert Box gettext and accept the alert box and gettext");
	}
	@Then("click on {string} gettext and {string} the alert box and gettext")
	public void click_on_gettext_and_the_alert_box_and_gettext1(String string, String string2) {
	   System.out.println("click on Prompt Alert Box gettext and accept the alert box and gettext");
}
}
