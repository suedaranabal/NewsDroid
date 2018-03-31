package com.example.NewsDroid;

import java.io.File;
import java.io.IOException;

import javax.swing.JLabel;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class PagesDesigner extends VerticalLayout {
	String dosyayolu;
	File file;
	FileOperations fileOperations;
	VerticalLayout layout = new VerticalLayout();

	public PagesDesigner(String dosyayolu) throws IOException {
		fileOperations = new FileOperations(dosyayolu);
		design();
		addComponent(layout);

	}

	public void design() throws IOException {

		Panel panel = new Panel();
		
		panel.setWidth(1000, UNITS_PIXELS);
		panel.setHeight(800 , UNITS_PIXELS);
		panel.setSizeFull();
		
		fileOperations.FileRead(fileOperations.dosya);
		Label h1 = new Label(fileOperations.newsDetail.get(1));
		Label h2 = new Label(fileOperations.newsDetail.get(2));
		ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));
		Image image = new Image("", externalResource);
		Label paragraf = new Label(fileOperations.newsDetail.get(4));
		layout.addComponent(h1);
		layout.addComponent(h2);
		layout.addComponent(image);
		layout.addComponent(panel);
		panel.setContent(paragraf);
	}

}
