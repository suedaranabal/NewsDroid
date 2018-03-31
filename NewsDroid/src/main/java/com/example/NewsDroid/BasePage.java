package com.example.NewsDroid;

import java.io.IOException;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;

public class BasePage extends GridLayout {
	GridLayout gridLayout = new GridLayout();
	FileOperations fileOperations;
	int count=1;

	public BasePage() throws IOException {

		gridLayout.setRows(4);
		gridLayout.setColumns(3);
		gridLayout.setSpacing(true);
		imageAdd();
		addComponent(gridLayout);

	}

	public void imageAdd() throws IOException {
		 JsoupConnect connect = new JsoupConnect("http://www.haber7.com.tr/dunya",
				 "div[id=\"page\"]>div>li>a", "http://www.sabah.com.tr");
				 connect.imageAdd("img", "alt");

		for (int i = 0; i < 20; i++) {
			
			fileOperations = new FileOperations("C:/Users/ASUS/haber" + count + ".txt");
			
			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));
			
			
			MyPanel myPanel = new MyPanel(h1,externalResource);
			gridLayout.addComponent(myPanel);
			count++;
			
			
		}
		

	}
}
