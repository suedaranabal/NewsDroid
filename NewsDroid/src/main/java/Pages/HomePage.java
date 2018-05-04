package Pages;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.example.NewsDroid.FileOperations;
import com.example.NewsDroid.MyPanel;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.GridLayout;

public class HomePage extends GridLayout {

	GridLayout gridLayout = new GridLayout();
	FileOperations fileOperations;
	int count = 1;

	public HomePage() throws IOException, ParseException {

		gridLayout.setRows(4);
		gridLayout.setColumns(4);
		gridLayout.setSpacing(true);
		imageAdd();
		addComponent(gridLayout);

	}

	public void imageAdd() throws IOException, ParseException {


		SimpleDateFormat bicim3 = new SimpleDateFormat("dd-MM");
		GregorianCalendar tarihnow = new GregorianCalendar();
		
		
		System.out.println(tarihnow.get(Calendar.MONTH));
		
		System.out.println(tarihnow.get(Calendar.DAY_OF_MONTH));
		
		if (tarihnow.get(Calendar.MONTH)==4 && tarihnow.get(Calendar.DAY_OF_MONTH)==27)  {
			String url = "News/Feast/23April" + ".txt";

			fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

			MyPanel myPanel = new MyPanel(h1, externalResource, url);
			gridLayout.addComponent(myPanel);
		}

		else if (tarihnow.get(Calendar.MONTH)==4 && tarihnow.get(Calendar.DAY_OF_MONTH)==19) {
			String url = "News/Feast/19May" + ".txt";

			fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

			MyPanel myPanel = new MyPanel(h1, externalResource, url);
			gridLayout.addComponent(myPanel);
		}

		else if (tarihnow.get(Calendar.MONTH)==9 && tarihnow.get(Calendar.DAY_OF_MONTH)==29) {
			String url = "News/Feast/29October" + ".txt";

			fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

			MyPanel myPanel = new MyPanel(h1, externalResource, url);
			gridLayout.addComponent(myPanel);
		}
		else if (tarihnow.get(Calendar.MONTH)==7 && tarihnow.get(Calendar.DAY_OF_MONTH)==30) {
			String url = "News/Feast/30August" + ".txt";

			fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

			MyPanel myPanel = new MyPanel(h1, externalResource, url);
			gridLayout.addComponent(myPanel);
		}
	}
}
