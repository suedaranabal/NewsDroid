package Pages;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import com.example.NewsDroid.FileOperations;
import com.example.NewsDroid.MyPanel;
import com.example.NewsDroid.SliderShow;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

public class HomePage extends GridLayout {

	GridLayout gridLayout = new GridLayout();
	FileOperations fileOperations;
	ArrayList<String> slider = new ArrayList<>();
	org.jsoup.nodes.Document doc;
	Elements element;
	Label weather;

	int count = 1;

	public HomePage() throws IOException, ParseException {

		gridLayout.setRows(4);
		gridLayout.setColumns(4);
		gridLayout.setSpacing(true);

		specialDay();
		feastDay();
		//weather();

		newsParse("Agenda/Agenda");
		newsParse("World/World");
		newsParse("Sports/Sport");
		SliderShow sliderShow = new SliderShow(slider.get(0), slider.get(2), slider.get(4), slider.get(1),
				slider.get(3), slider.get(5));
		addComponent(sliderShow);
		addComponent(gridLayout);

	}

	public void feastDay() throws IOException, ParseException {

		SimpleDateFormat bicim3 = new SimpleDateFormat("dd-MM");
		GregorianCalendar tarihnow = new GregorianCalendar();

		

		if (tarihnow.get(Calendar.MONTH) == 3 && tarihnow.get(Calendar.DAY_OF_MONTH) == 23) {
			String url = "News/Feast/23April" + ".txt";

			fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

			MyPanel myPanel = new MyPanel(h1, externalResource, url);
			gridLayout.addComponent(myPanel);
		}

		else if (tarihnow.get(Calendar.MONTH) == 4 && tarihnow.get(Calendar.DAY_OF_MONTH) == 19) {
			String url = "News/Feast/19May" + ".txt";

			fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

			MyPanel myPanel = new MyPanel(h1, externalResource, url);
			gridLayout.addComponent(myPanel);
		}

		else if (tarihnow.get(Calendar.MONTH) == 9 && tarihnow.get(Calendar.DAY_OF_MONTH) == 29) {
			String url = "News/Feast/29October" + ".txt";

			fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

			MyPanel myPanel = new MyPanel(h1, externalResource, url);
			gridLayout.addComponent(myPanel);
		} else if (tarihnow.get(Calendar.MONTH) == 7 && tarihnow.get(Calendar.DAY_OF_MONTH) == 30) {
			String url = "News/Feast/30August" + ".txt";

			fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

			MyPanel myPanel = new MyPanel(h1, externalResource, url);
			gridLayout.addComponent(myPanel);
		}
		
		else if (tarihnow.get(Calendar.MONTH) == 4 && tarihnow.get(Calendar.DAY_OF_MONTH) == 1) {
			String url = "News/Feast/1May" + ".txt";

			fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

			MyPanel myPanel = new MyPanel(h1, externalResource, url);
			gridLayout.addComponent(myPanel);
		}
	}

	public void specialDay() throws IOException, ParseException {

		SimpleDateFormat bicim3 = new SimpleDateFormat("dd-MM");
		GregorianCalendar tarihnow = new GregorianCalendar();

		

		if (tarihnow.get(Calendar.DAY_OF_MONTH) == 15) {
			String url = "News/Special/BedelliAskerlik" + ".txt";

			fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

			MyPanel myPanel = new MyPanel(h1, externalResource, url);
			gridLayout.addComponent(myPanel);
		} 
		else if(tarihnow.get(Calendar.MONTH) == 5 | tarihnow.get(Calendar.MONTH) == 6 && tarihnow.get(Calendar.DAY_OF_MONTH) == 1 | tarihnow.get(Calendar.DAY_OF_MONTH) == 14 | tarihnow.get(Calendar.DAY_OF_MONTH) == 25) {
			String url = "News/Special/SıcakHava" + ".txt";

			fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

			MyPanel myPanel = new MyPanel(h1, externalResource, url);
			gridLayout.addComponent(myPanel);
		}
		
		
		else if(tarihnow.get(Calendar.MONTH) == 4 | tarihnow.get(Calendar.MONTH) == 12 | tarihnow.get(Calendar.MONTH) == 0 && tarihnow.get(Calendar.DAY_OF_MONTH) == 1 | tarihnow.get(Calendar.DAY_OF_MONTH) == 14 | tarihnow.get(Calendar.DAY_OF_MONTH) == 25) {
			String url = "News/Special/SoğukHava" + ".txt";

			fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

			MyPanel myPanel = new MyPanel(h1, externalResource, url);
			gridLayout.addComponent(myPanel);
		}
		
	}

//	public void weather() {
//		try {
//			
//			doc = Jsoup.connect("http://tr.freemeteo.com/havadurumu/istanbul/7-days/list/?gid=745044&language=turkish&country=turkey").get();
//			element = doc.select("div[class=\"temps\"]>b");
//			weather.setValue(element.text());
//			System.out.println(weather.getValue());
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}

	public void newsParse(String urlPage) throws IOException {

		for (int i = 0; i < 10; i++) {
			String url = "News/" + urlPage + count + ".txt";
			try {
				fileOperations = new FileOperations(url);
				fileOperations.FileRead(fileOperations.dosya);
				String h1 = fileOperations.newsDetail.get(1);
				ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));
				if (i < 2) {
					slider.add(fileOperations.newsDetail.get(3));// 024
					slider.add(fileOperations.newsDetail.get(1));// 135
				}
				MyPanel myPanel = new MyPanel(h1, externalResource, url);
				gridLayout.addComponent(myPanel);
				count++;

			} catch (Exception e) {
				i = 24;

			}

		}

		count = 1;

	}
}
