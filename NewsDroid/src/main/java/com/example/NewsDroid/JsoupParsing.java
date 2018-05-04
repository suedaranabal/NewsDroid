package com.example.NewsDroid;

import java.io.IOException;

public class JsoupParsing {

	public JsoupParsing() throws IOException {

//		JsoupConnect connectScience = new JsoupConnect("http://www.bilim.org/",
//				"div[class=\"mosaic\"]>article>header>div>a");
//		connectScience.parseOperations("Science/Science", "", "src");
//
//		JsoupConnect connectColumnists = new JsoupConnect("http://www.hurriyet.com.tr/yazarlar/",
//				"div[class=\"col-xs-4 author-box-title\"]>a");
//		connectColumnists.parseOperations("Columnists/Columnists", "http://www.hurriyet.com.tr", "src");
//
//		JsoupConnect connectAgenda = new JsoupConnect("http://www.trthaber.com/haber/gundem/",
//				"ul[class=\"katListe2\"]>li>a");
//		connectAgenda.parseOperations("Agenda/Agenda", "http://www.trthaber.com/", "data-original");
//
//		JsoupConnect connectWorld = new JsoupConnect("http://www.haber7.com.tr/dunya", "div[id=\"page\"]>div>li>a");
//		connectWorld.parseOperations("World/World", "", "src");
//
//		JsoupConnect connectSports = new JsoupConnect("http://www.gunes.com/spor/", "div[class=\"haber\"]>a");
//		connectSports.parseOperations("Sports/Sport", "http://www.gunes.com", "data-src");
	
//		JsoupConnect connectGallery = new JsoupConnect("http://www.nationalgeographic.com.tr/kategori/fotograf/5", "section[class=\"visualArticles big gest articlelinks\"]>div>div>img");
//		connectGallery.gallery("Gallery/Gallery");
		
		JsoupConnect connectCinema = new JsoupConnect("http://www.istanbul.net.tr/sinema-filmler-vizyondakiler-1/", "div[class=\"row-xs row-eq-height\"]>div>div>div");
		connectCinema.parseOperations("Cinema/Cinema", "http://www.istanbul.net.tr", "src");
	}

	public static void main(String[] args) throws IOException {

		JsoupParsing jsoupParsing = new JsoupParsing();
	}
}
