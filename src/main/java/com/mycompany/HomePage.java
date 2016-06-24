package com.mycompany;

import com.mycompany.SuccessPage;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.examples.WicketExamplePage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;



public class HomePage extends WebPage {
	
    private static final long serialVersionUID = 1L;
        public HomePage(){
		
			}			
		});
                add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
                add(new Label("name"));
                add(new Label("sirname"));
	}

//                Form<?> form;
                
		
// TODO Add your page's components here
//            form = new Form<Void>("userForm") {
                
//                protected void onSubmit() {
//                    
//                    PageParameters pageParameters = new PageParameters();
//                    pageParameters.add("name", "");
//                    pageParameters.add("sirname", "");
//                    setResponsePage(SuccessPage.class, pageParameters);
//                    
//                }
                
                
            };

    


