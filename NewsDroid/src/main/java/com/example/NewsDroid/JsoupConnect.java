package com.example.NewsDroid;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.vaadin.server.ExternalResource;

import com.vaadin.ui.Layout;

public class JsoupConnect {

	private Elements p;
	private String img;
	private Elements h1;
	private Elements h2;

	private Elements elementClass;
	private ExternalResource imageEx;
	String target;
	String address;
	private String src;
	Document doc;
	int count = 1;
	public JsoupConnect(String connect, String htmlClass, String address) throws IOException {

		doc = Jsoup.connect(connect).get();
		this.address = address;
		elementClass = doc.select(htmlClass);

	}

	public void imageAdd(String tag, String attr) throws IOException {

		for (Element image : elementClass) {

			src = image.getElementsByTag("img").attr("src");
			target = image.getElementsByTag("a").attr("href");

			//System.out.println("deneme" + target);
			imageEx = new ExternalResource(src);
			content(target);
			count++;
			//layout.addComponent(new MyPanel(target, imageEx));

		}

	}

	private void content(String connectHref) throws IOException {
		doc = Jsoup.connect(connectHref).get();
		p = doc.select("p");
		h1 = doc.select("H1");
		h2 = doc.select("H2");
		img = doc.select("img").attr("src");

		
		for (int i=0 ; i<1 ; i++) {

			FileOperations fileOperations = new FileOperations("../haber" + count + ".txt");

			fileOperations.fileWrite(connectHref);
			fileOperations.fileWrite(h1.text());
		fileOperations.fileWrite(h2.text());
			fileOperations.fileWrite(src);
			fileOperations.fileWrite(p.text());

			fileOperations.yaz.close();
			System.out.println(connectHref);
			System.out.println(h1.text());
			
			// System.out.println(p.text());
		}
	}

}
