/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package foo;

import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlMessage;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;

/**
 * A typical simple backing bean, that is backed to <code>helloworld.jsp</code>
 * 
 * @author <a href="mailto:matzew@apache.org">Matthias Weﬂendorf</a> 
 */
public class HelloWorldBacking
{

    //properties
    private String name;
    private HtmlForm myForm = new HtmlForm();

    /**
     * default empty constructor
     */
    public HelloWorldBacking()
    {
//    	UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
//    	HtmlPanelGrid hpg = (HtmlPanelGrid) viewRoot.findComponent("form:pippo");    
//    	
//    	if(hpg!=null && hpg.getChildCount() == 0) {
//    	
//	    	// Col1
//	    	HtmlOutputLabel lab = new HtmlOutputLabel();
//	    	lab.setValue("Label");
//	    		
//	    	// Col2
//	    	HtmlInputText inp = new HtmlInputText();
//	    	inp.setValue("Initial value");
//	    	inp.setId("inp");
//	    	inp.setRequired(true);
//	    	
//	    	// Col3
//	    	HtmlMessage mes = new HtmlMessage();
//	    	mes.setFor(inp.getId());    	
//	    	lab.setFor(inp.getId());
//	    	
//	    	hpg.getChildren().add(lab);    	
//	    	hpg.getChildren().add(inp);
//	    	hpg.getChildren().add(mes);
//    	}
    }

	//-------------------getter & setter
    
    public HtmlForm getMyForm() {
    	HtmlOutputText template1 = new HtmlOutputText();
    	template1.setEscape(false);
    	template1.setValue("<table id=\"pluto\" width=\"100%\" border=\"1\">" + 
				"<tr>" + 
					"<td>");
    	myForm.getChildren().add(template1);
    	
    	// Col1
    	HtmlOutputLabel lab = new HtmlOutputLabel();
    	lab.setValue("Label");
    	myForm.getChildren().add(lab);
    	
    	HtmlOutputText template2 = new HtmlOutputText();
    	template2.setEscape(false);
    	template2.setValue("</td><td>");
    	myForm.getChildren().add(template2);
    	
    	// Col2
    	HtmlInputText inp = new HtmlInputText();
    	inp.setValue("Initial value");
    	inp.setId("inp");
    	inp.setRequired(true);
    	myForm.getChildren().add(inp);
    	
    	HtmlOutputText template3 = new HtmlOutputText();
    	template3.setEscape(false);
    	template3.setValue("</td></tr>" +
			"</table>");
    	myForm.getChildren().add(template3);
    	
		return myForm;
	}
    
    public void setMyForm(HtmlForm f) {
    	
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Method that is backed to a submit button of a form.
     */
    public String send()
    {
        //do real logic
        return ("success");
    }
    
    public String getJsf() {
    	return "<h:outputText value=\"hhhhhh\"/>";
    }
}