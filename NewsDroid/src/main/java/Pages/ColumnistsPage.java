package Pages;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import com.example.NewsDroid.FileOperations;
import com.example.NewsDroid.JsoupConnect;
import com.example.NewsDroid.MyPanel;
import com.example.NewsDroid.SliderShow;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Slider;

public class ColumnistsPage extends GridLayout {

	GridLayout gridLayout = new GridLayout();

	FileOperations fileOperations;
	int count = 1;

	public ColumnistsPage() throws IOException {

		gridLayout.setRows(4);
		gridLayout.setColumns(4);
		gridLayout.setSpacing(true);
		imageAdd();

		addComponent(gridLayout);

	}

	public void imageAdd() throws IOException {

		for (int i = 0; i < 24; i++) {
			String url = "News/Columnists/Columnists" + count + ".txt";
			try {
				fileOperations = new FileOperations(url);

				fileOperations.FileRead(fileOperations.dosya);
				String h1 = fileOperations.newsDetail.get(1);
				ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));

				MyPanel myPanel = new MyPanel(h1, externalResource, url);
				gridLayout.addComponent(myPanel);
				count++;
			} catch (Exception e) {
				i = 24;
			}

		}

	}

}
