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

import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlMessage;
import javax.faces.component.html.HtmlOutputLabel;
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

    /**
     * default empty constructor
     */
    public HelloWorldBacking()
    {
    	UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
    	HtmlPanelGrid hpg = (HtmlPanelGrid) viewRoot.findComponent("form:pippo");    
    	
    	if(hpg.getChildCount() == 0) {
    	
	    	// Col1
	    	HtmlOutputLabel lab = new HtmlOutputLabel();
	    	lab.setValue("Label");
	    		
	    	// Col2
	    	HtmlInputText inp = new HtmlInputText();
	    	inp.setValue("Initial value");
	    	inp.setId("inp");
	    	inp.setRequired(true);
	    	
	    	// Col3
	    	HtmlMessage mes = new HtmlMessage();
	    	mes.setFor(inp.getId());    	
	    	lab.setFor(inp.getId());
	    	
	    	hpg.getChildren().add(lab);    	
	    	hpg.getChildren().add(inp);
	    	hpg.getChildren().add(mes);
    	}
    }

    //-------------------getter & setter
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