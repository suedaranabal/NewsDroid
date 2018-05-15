package com.example.NewsDroid;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.vaadin.server.ExternalResource;

public class JsoupConnect {

	private Elements p;
	private String img;
	private Elements h1;
	private Elements h2;
	private String dosyaAdi;

	private Elements elementClass;
	@SuppressWarnings("unused")
	private ExternalResource imageEx;
	String target;
	String address;
	private String src;
	Document doc;
	int count = 1;

	public JsoupConnect(String connect, String htmlClass) throws IOException {

		doc = Jsoup.connect(connect).get();

		elementClass = doc.select(htmlClass);

	}

	public void parseOperations(String dosyaAdi, String address, String attr) throws IOException {
		this.dosyaAdi = dosyaAdi;
		for (Element image : elementClass) {

			src = image.getElementsByTag("img").attr(attr);
			target = image.getElementsByTag("a").attr("href");
			imageEx = new ExternalResource(src);
			content(address + target);
			count++;

		}

	}

	public void gallery(String dosyaAdi) throws IOException {
		for (Element image : elementClass) {

			src = image.getElementsByTag("img").attr("src"); 
			h2 = image.getElementsByTag("H2"); 
			
		
			
			
			for (int i = 0; i < 1; i++) {
				File path = new File("News/" + dosyaAdi + count + ".txt");
				if(!path.exists()) {
					FileOperations fileOperations = new FileOperations("News/" + dosyaAdi + count + ".txt");

					fileOperations.fileWrite(src);
					fileOperations.fileWrite(h2.text());
					
				

					fileOperations.yaz.close();
					System.out.println(src);
					System.out.println(h2.text());
				}else {
					path.delete();
					
					FileOperations fileOperations = new FileOperations("News/" + dosyaAdi + count + ".txt");

					fileOperations.fileWrite(src);
					
					fileOperations.fileWrite(h2.text());
					

					fileOperations.yaz.close();
					System.out.println(src);
					System.out.println(h2.text());
				}

				count++;
			}}}
	

	private void content(String connectHref) throws IOException {
		doc = Jsoup.connect(connectHref).get();
		p = doc.select("p");
		h1 = doc.select("H1");
		h2 = doc.select("H2");
		img = doc.select("img").attr("src");

		for (int i = 0; i < 1; i++) {
			File path = new File("News/" + dosyaAdi + count + ".txt");
			if (!path.exists()) {
				FileOperations fileOperations = new FileOperations("News/" + dosyaAdi + count + ".txt");

				fileOperations.fileWrite(connectHref);
				fileOperations.fileWrite(h1.text());
				fileOperations.fileWrite(h2.text());
				fileOperations.fileWrite(src);
				fileOperations.fileWrite(p.text());

				fileOperations.yaz.close();
				System.out.println(connectHref);
				System.out.println(h1.text());
			} else {
				path.delete();

				FileOperations fileOperations = new FileOperations("News/" + dosyaAdi + count + ".txt");

				fileOperations.fileWrite(connectHref);
				fileOperations.fileWrite(h1.text());
				fileOperations.fileWrite(h2.text());
				fileOperations.fileWrite(src);
				fileOperations.fileWrite(p.text());

				fileOperations.yaz.close();
				System.out.println(connectHref);
				System.out.println(h1.text());
			}

		
		}
	}

}
