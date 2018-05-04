package Pages;

import java.io.IOException;
import java.util.ArrayList;

import com.example.NewsDroid.FileOperations;
import com.example.NewsDroid.JsoupConnect;
import com.example.NewsDroid.MyPanel;
import com.example.NewsDroid.SliderShow;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.GridLayout;

public class SciencePage extends GridLayout {

	GridLayout gridLayout = new GridLayout();
	ArrayList<String> slider = new ArrayList<>();
	FileOperations fileOperations;
	int count = 1;

	public SciencePage() throws IOException {

		gridLayout.setRows(4);
		gridLayout.setColumns(4);
		gridLayout.setSpacing(true);
		imageAdd();
		SliderShow sliderShow = new SliderShow(slider.get(0),slider.get(2), slider.get(4), slider.get(1), slider.get(3), slider.get(5));
		addComponent(sliderShow);
		addComponent(gridLayout);

	}

	public void imageAdd() throws IOException {

		for (int i = 0; i < 24; i++) {
			String url = "News/Science/Science" + count + ".txt";
			try {
				fileOperations = new FileOperations(url);

			fileOperations.FileRead(fileOperations.dosya);
			String h1 = fileOperations.newsDetail.get(1);
			ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(3));
			if(i<3) {
				slider.add(fileOperations.newsDetail.get(3));//024
				slider.add(fileOperations.newsDetail.get(1));//135
			}
			MyPanel myPanel = new MyPanel(h1, externalResource, url);

			gridLayout.addComponent(myPanel);
			count++;
			} catch (Exception e) {
			i = 24;
			}
			

		}

	}

}
