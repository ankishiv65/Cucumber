package StepDefinitions;

import base.base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends base{
@Before("@SeleniumTest")
public void before1() {
	System.out.println("before");
}
@After("@SeleniumTest")
public void after1() {
	
}
}
