package Pages;

import com.vaadin.annotations.JavaScript;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupView;
import com.vaadin.ui.VerticalLayout;

public class TrafficPage extends VerticalLayout {
	
	
	
	
	public TrafficPage() {
		Label label = new Label("<div id=\"map\"></div>\r\n" + 
				"<script async defer src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCkUOdZ5y7hMm0yrcCQoCvLwzdM6M8s5qk&callback=initMap\">"
				+ " </script>");
		label.setContentMode(ContentMode.HTML);
		addComponent(label);
		
		
	}

}

