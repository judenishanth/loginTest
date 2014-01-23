package aol.coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.http.message.BasicNameValuePair;

public class RegistrationHandler {
	
	String firstname,lastname,email,is_subscribed,password,confirmation;
	

	private final static String USER_AGENT = "Mozilla/5.0";
	CloseableHttpResponse myresponse = null;
	
public RegistrationHandler(){
	
}
public RegistrationHandler(String firstName,String lastName,String email_addr,String is_Subscribed,String passworD,String conformatioN){

	this.firstname=firstName;
	this.lastname=lastName;
	this.email=email_addr;
	this.is_subscribed=is_Subscribed;
	this.password=passworD;
	this.confirmation=conformatioN;
}

	
	public String postHttpRequest(){
		
		// A Default client object is created to request a httpPost 
	CloseableHttpClient httpclient = HttpClientBuilder.create().setRedirectStrategy(new LaxRedirectStrategy()).build();
	String rtn = null;
		try {
			// the html form values are added to the form params which is added to the httpPost object
			// add header
		
			List<NameValuePair> formparams = new ArrayList<NameValuePair>();
			formparams.add(new BasicNameValuePair("firstname", firstname));
			formparams.add(new BasicNameValuePair("lastname",lastname));
			formparams.add(new BasicNameValuePair("email", email));
			formparams.add(new BasicNameValuePair("is_subscribed",is_subscribed));
			formparams.add(new BasicNameValuePair("password",password));
			formparams.add(new BasicNameValuePair("confirmation",confirmation));
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, Consts.UTF_8);
			HttpPost httppost = new HttpPost("http://myopenissues.com/magento/index.php/customer/account/createpost/");
			// add header
			httppost.setHeader("User-Agent", USER_AGENT);
			httppost.setHeader("cookie","test");
			httppost.setEntity(entity);
			
			// a http post request send the params to the end service
			 myresponse = httpclient.execute(httppost);
			
			System.out.println(myresponse.getStatusLine().getStatusCode());
						
			InputStream ips  = myresponse.getEntity().getContent();
	        BufferedReader buf = new BufferedReader(new InputStreamReader(ips,"UTF-8"));
	        StringBuilder sb = new StringBuilder();
	        int c;
	        while ((c = buf.read()) != -1) {
	          sb.append((char) c);
	        }
	       // System.out.println(sb.toString());
	       rtn=sb.toString();
			
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return rtn;
	}
	
	 public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getIs_subscribed() {
			return is_subscribed;
		}
		public void setIs_subscribed(String is_subscribed) {
			this.is_subscribed = is_subscribed;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getConfirmation() {
			return confirmation;
		}
		public void setConfirmation(String confirmation) {
			this.confirmation = confirmation;
		}
public int getStatus(){
	return myresponse.getStatusLine().getStatusCode();
}

}
