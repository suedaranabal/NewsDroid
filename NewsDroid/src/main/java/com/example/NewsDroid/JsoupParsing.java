package com.example.NewsDroid;

import java.io.IOException;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class JsoupParsing{

	public static void main(String[] args) throws IOException {

		
		
		JsoupConnect connectFlash = new JsoupConnect("http://www.haber7.com/sondakika",
				"div[class=\"breaking-news row mb\"]>ul>li>a");
		connectFlash.parseOperations("Flash/Flash", "", "src");

		 JsoupConnect connectScience = new
		 JsoupConnect("http://www.webtekno.com/haber",
		 "div[class=\"content-timeline__media\"]>a");
		 connectScience.parseOperations("Science/Science", "", "data-original");
		
		 JsoupConnect connectColumnists = new
		 JsoupConnect("http://www.hurriyet.com.tr/yazarlar/",
		 "div[class=\"col-xs-4 author-box-title\"]>a");
		 connectColumnists.parseOperations("Columnists/Columnists",
		 "http://www.hurriyet.com.tr", "src");
		
		 JsoupConnect connectAgenda = new
		 JsoupConnect("http://www.sozcu.com.tr/kategori/gundem/",
		 "div[class=\"listed-box\"]>a");
		 connectAgenda.parseOperations("Agenda/Agenda", "", "src");
		
		 JsoupConnect connectWorld = new
		 JsoupConnect("http://www.haber7.com.tr/dunya", "div[id=\"page\"]>div>li>a");
		 connectWorld.parseOperations("World/World", "", "src");
		
		 JsoupConnect connectSports = new
		 JsoupConnect("http://www.karar.com/spor-haberleri",
		 "div[class=\"body\"]>a");
		 connectSports.parseOperations("Sports/Sport", "http://www.karar.com",
		 "data-original");
		
		 JsoupConnect connectGallery = new
		 JsoupConnect("http://www.nationalgeographic.com.tr/kategori/fotograf/5",
		 "section[class=\"visualArticles big gest articlelinks\"]>div>div>img");
		 connectGallery.gallery("Gallery/Gallery");
		
		 JsoupConnect connectCinema = new
		 JsoupConnect("http://www.istanbul.net.tr/sinema-filmler-vizyondakiler-1/",
		 "div[class=\"row-xs row-eq-height\"]>div>div>div");
		 connectCinema.parseOperations("Cinema/Cinema", "http://www.istanbul.net.tr",
		 "src");

	}

	

	
}
