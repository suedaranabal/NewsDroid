package com.example.NewsDroid;

import java.io.IOException;

import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class MyPanel extends Panel {

	VerticalLayout layout = new VerticalLayout();
	Panel panel = new Panel();
	
	private MyUI myUI;
	private Image img;
	private String url;
	private String stringSub;

	
	public MyPanel(String caption, ExternalResource ex, String url) {
		myUI = (MyUI) UI.getCurrent();
		
		//stringSub =caption.substring(32);
		img = new Image("", ex);
		
		img.setWidth(200, Unit.PIXELS);
		
//		img.setSizeFull();
		setContent(layout);
		layout.addComponent(img);
		layout.setComponentAlignment(img,Alignment.BOTTOM_CENTER);
		
		if(caption.length()<25) {
			img.setCaption(caption);
		}
		else{
			img.setCaption(caption.substring(0, 25 ) + "...");
		}
		
		
		img.addClickListener(new ClickListener() {

			@Override
			public void click(ClickEvent event) {
				try {
					myUI.selectDetail(url);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});
		
		
		
		setCaptionAsHtml(true);
		setSizeFull();
		setWidth(240,UNITS_PIXELS);
		
		
	}

}
