package com.example.NewsDroid;

import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Slider;
import com.vaadin.ui.VerticalLayout;

public class NewsDetail extends Panel {
	String dosyayolu;

	File file;
	FileOperations fileOperations;

	VerticalLayout layout = new VerticalLayout();
	
	public NewsDetail(String dosyayolu) throws IOException {
		setWidth(1000, UNITS_PIXELS);

		fileOperations = new FileOperations(dosyayolu);
		design();
		setContent(layout);
	

	}

	public void design() throws IOException {

		Label spacing = new Label();
		spacing.setHeight(15, UNITS_PIXELS);
		spacing.setSizeFull();

		fileOperations.FileRead(fileOperations.dosya);
		Label h1 = new Label(fileOperations.newsDetail.get(1));
		h1.addStyleName("h1");
		h1.addStyleName("bold");
		h1.setWidth(1000, UNITS_PIXELS);
		h1.setHeight(10, UNITS_PIXELS);

		Label h2 = new Label(fileOperations.newsDetail.get(2));
		h2.addStyleName("h2");
		h2.addStyleName("bold");
		h2.setWidth(1000, UNITS_PIXELS);
		h2.setHeight(100, UNITS_PIXELS);
		h2.setSizeFull();

		ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));
		Image image = new Image("", externalResource);
		image.setWidth(850, UNITS_PIXELS);
		image.setHeight(500, UNITS_PIXELS);

		Label paragraf = new Label(fileOperations.newsDetail.get(4));
		paragraf.addStyleName("bold");
		paragraf.setWidth(900, UNITS_PIXELS);
		paragraf.setSizeFull();

		layout.addComponents(h1, h2, image, spacing, paragraf);
		layout.setComponentAlignment(image, Alignment.BOTTOM_CENTER);
		layout.setComponentAlignment(paragraf, Alignment.BOTTOM_CENTER);
		layout.setComponentAlignment(h1, Alignment.BOTTOM_CENTER);
		layout.setComponentAlignment(h2, Alignment.BOTTOM_CENTER);

	}

}
