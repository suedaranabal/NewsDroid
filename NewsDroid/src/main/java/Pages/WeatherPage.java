package Pages;

import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

public class WeatherPage extends VerticalLayout {
	
	public WeatherPage() {
		Label label = new Label("<iframe frameborder=\"0\" height=\"200\" scrolling=\"no\" "
				+ "src=\"http://www.cenkerli.org/sitene_ekle/havadurumu.php\" width=\"300\"></iframe>");
		label.setContentMode(ContentMode.HTML);
		addComponent(label);
	}

}
