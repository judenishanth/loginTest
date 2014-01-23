package aol.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.http.message.BasicNameValuePair;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname,lastname,email,is_subscribed,password,confirmation;
		firstname = request.getParameter("firstname");
		lastname = request.getParameter("lastname");
		email=request.getParameter("email");
		is_subscribed=request.getParameter("is_subscribed");
		password=request.getParameter("password");
		confirmation=request.getParameter("confirmation");
		System.out.println("firstname:"+firstname);
		System.out.println("lastname: "+lastname);
		System.out.println("email: "+email);
		System.out.println("is_subscribed: "+is_subscribed);
		System.out.println("password: "+password);
		System.out.println("confirmation: "+confirmation);
		RegistrationHandler register = new RegistrationHandler(firstname,lastname,email,is_subscribed,password,confirmation);
		String success = register.postHttpRequest();
		 if(register.getStatus()==200){
			 
			 request.getRequestDispatcher("/success.jsp").forward(request, response);
		 }else{
			 request.getRequestDispatcher("/failure.jsp").forward(request, response);
		 }
		
	}

}
