package com.mycompany;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.PropertyModel;


public class HomePage extends WebPage {
	
    private static final long serialVersionUID = 1L;
    
    private String output = "";
    
        public HomePage(){
		
            PropertyModel<String> nameModel = new PropertyModel<>(this, "output");
            
            add(new Label("output", nameModel));
            
            Form<?> form = new Form("form");
            form.add(new TextField<>("inputName", nameModel));
            add(form);
            
            add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
	}
        
        public String getOutput()
        {
            return output;
        }
        
        public void setOuput(String output)
        {
            this.output = output;
        }
}

		

                
                
                
                
         

    


