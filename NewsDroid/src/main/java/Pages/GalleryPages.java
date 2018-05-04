package Pages;

import java.io.IOException;
import java.util.ArrayList;

import com.example.NewsDroid.FileOperations;
import com.example.NewsDroid.JsoupConnect;
import com.example.NewsDroid.MyPanel;
import com.example.NewsDroid.SliderShow;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.GridLayout;

public class GalleryPages extends GridLayout {

	GridLayout gridLayout = new GridLayout();
	ArrayList<String> slider = new ArrayList<>();
	FileOperations fileOperations;
	int count = 1;

	public GalleryPages() throws IOException {

		gridLayout.setRows(4);
		gridLayout.setColumns(4);
		gridLayout.setSpacing(true);
		imageAdd();
		//SliderShow sliderShow = new SliderShow(slider.get(0),slider.get(2), slider.get(4), slider.get(1), slider.get(3), slider.get(5));
		//addComponent(sliderShow);
		addComponent(gridLayout);

	}

	public void imageAdd() throws IOException {


		for (int i = 0; i < 24; i++) {
			String url="News/Gallery/Gallery"+ count + ".txt";
			try {
				fileOperations = new FileOperations(url);
				fileOperations.FileRead(fileOperations.dosya);
				ExternalResource externalResource = new ExternalResource(fileOperations.newsDetail.get(0));
				if(i<3) {
					
					slider.add(fileOperations.newsDetail.get(0));//135
				}
				MyPanel myPanel = new MyPanel("", externalResource,url);
				gridLayout.addComponent(myPanel);
				count++;
			}
			catch (Exception e) {
				i = 24;
			}
			

		}

	}

}
