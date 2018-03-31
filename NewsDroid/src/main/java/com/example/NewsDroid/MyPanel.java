package com.example.NewsDroid;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class MyPanel extends Panel {

	VerticalLayout layout = new VerticalLayout();

	public MyPanel(String caption, ExternalResource ex) {
		Image img = new Image("", ex);
		Label label = new Label(caption);
		img.setWidth(280, UNITS_PIXELS);
		img.setHeight(280, UNITS_PIXELS);
		
		layout.addComponent(img);
		layout.addComponent(label);
		layout.setSizeFull();
		setCaptionAsHtml(true);
		setContent(layout);

		setSizeFull();
		setHeight(340, UNITS_PIXELS);
		setWidth(320, UNITS_PIXELS);

	}

}
