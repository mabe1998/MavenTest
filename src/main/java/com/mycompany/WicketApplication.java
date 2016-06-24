package com.mycompany;

import com.mycompany.HomePage;
import com.mycompany.SuccessPage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application.
 * If you want to run this application without deploying, run the Start class.
 * 
 * @see com.mycompany.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{
	/**
     * @return 
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}

//	public Class<? extends WebPage> getSuccessPage()
//	{
//		return SuccessPage.class;
//	}
        
        
        
	/**
	 * @see org.apache.wicket.Application#init()
	 */
	/*@Override
	public void init()
	{
		super.init();

		// add your configuration here
	}*/
}
