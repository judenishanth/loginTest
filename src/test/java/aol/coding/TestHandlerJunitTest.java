package aol.coding;

import static org.junit.Assert.*;
import org.junit.Test;
import aol.coding.RegistrationHandler;

public class TestHandlerJunitTest {


	@Test
	public void testRegistrationHandler() {
		final String firstname = "jude nishanth";
		final String lastname = "wilfred";
		final String email = "test@123.com";
		final String is_subscribed = "1";
		final String password = "qwerty";
		final String confirmation="qwerty";
		RegistrationHandler rh = new RegistrationHandler(firstname,lastname,email,is_subscribed,password,confirmation);
		
		assertEquals(firstname,rh.getFirstname());
		assertEquals(lastname,rh.getLastname());
		assertEquals(email,rh.getEmail());
		assertEquals(is_subscribed,rh.getIs_subscribed());
		assertEquals(password,rh.getPassword());
		assertEquals(confirmation,rh.getConfirmation());
		
	}

	@Test
	public void testPostHttpRequest() {
		final String firstname = "nishanth";
		final String lastname = "jude";
		final String email = "test@1234.com";
		final String is_subscribed = "1";
		final String password = "qwerty";
		final String confirmation="qwerty";
		RegistrationHandler rh = new RegistrationHandler(firstname,lastname,email,is_subscribed,password,confirmation);
		String output = rh.postHttpRequest();
		assertEquals(true,output.contains("<title>Create New Customer Account</title>"));
	}
	@Test
	public void testPostHttpRequest1() {
		final String firstname = "nishanth";
		final String lastname = "jude";
		final String email = "test@1234.com";
		final String is_subscribed = "1";
		final String password = "qwerty";
		final String confirmation="qwerty";
		RegistrationHandler rh = new RegistrationHandler(firstname,lastname,email,is_subscribed,password,confirmation);
		String output = rh.postHttpRequest();
		assertEquals(false,output.contains("<title>Enable Cookies</title>"));
	}
	
	

}
