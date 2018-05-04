package Pages;

import java.io.EOFException;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.vaadin.server.ExternalResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.JavaScript;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class ForeignCurrencyPage extends VerticalLayout {

	Document doc;
	Elements element;
	Elements elements;

	Label labelDolar = new Label();
	Label labelEuro = new Label();

	VerticalLayout layout = new VerticalLayout();
	HorizontalLayout horizontalDolar = new HorizontalLayout();
	HorizontalLayout horizontalEuro = new HorizontalLayout();

	public ForeignCurrencyPage() throws IOException {

		Panel panel = new Panel();
		panel.setStyleName("dovizpanel");
		dovizParse();

		Image dolarImage = new Image("",
				new ExternalResource("https://freeiconshop.com/wp-content/uploads/edd/dollar-solid.png"));
		dolarImage.setWidth(20, Unit.PIXELS);

		Image euroImage = new Image("",
				new ExternalResource("https://image.freepik.com/free-icon/euro-symbol_318-33107.jpg"));
		euroImage.setWidth(20, Unit.PIXELS);

		horizontalDolar.addComponent(dolarImage);
		horizontalDolar.addComponent(labelDolar);
		horizontalDolar.setComponentAlignment(dolarImage, Alignment.TOP_LEFT);
		horizontalDolar.setComponentAlignment(labelDolar, Alignment.BOTTOM_CENTER);
		layout.addComponent(horizontalDolar);
		layout.setComponentAlignment(horizontalDolar, Alignment.BOTTOM_CENTER);

		horizontalEuro.addComponent(euroImage);
		horizontalEuro.addComponent(labelEuro);
		horizontalEuro.setComponentAlignment(euroImage, Alignment.TOP_LEFT);
		horizontalEuro.setComponentAlignment(labelEuro, Alignment.BOTTOM_CENTER);
		layout.addComponent(horizontalEuro);
		layout.setComponentAlignment(horizontalEuro, Alignment.BOTTOM_CENTER);

		panel.setWidth(300 ,Unit.PIXELS);
		panel.setCaption("Döviz Kuru");
		panel.setContent(layout);
		addComponent(panel);
	}

	public void dovizParse() throws IOException {
		doc = Jsoup.connect("http://www.haber7.com/").get();
		element = doc.select("div[class=\"currency-item DOLAR\"]");
		labelDolar.setValue(element.text());

		doc = Jsoup.connect("http://www.haber7.com/").get();
		elements = doc.select("div[class=\"currency-item EURO\"]");
		labelEuro.setValue(elements.text());
	}

}
