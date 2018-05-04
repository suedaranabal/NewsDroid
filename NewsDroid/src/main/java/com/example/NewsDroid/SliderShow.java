package com.example.NewsDroid;

import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.ExternalResource;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.Slider;
import com.vaadin.ui.VerticalLayout;

import Pages.ForeignCurrencyPage;
import Pages.WeatherPage;

public class SliderShow extends VerticalLayout {

	Slider slider = new Slider();
	Panel panel = new Panel();
	String img1;
	String img2;
	String img3;
	String h11;
	String h12;
	String h13;
	VerticalLayout layout = new VerticalLayout();
	HorizontalLayout horizontalLayout = new HorizontalLayout();
	VerticalLayout layout2 = new VerticalLayout();
	WeatherPage weatherPage = new WeatherPage();

	ForeignCurrencyPage currencyPage;

	public SliderShow(String img1, String img2, String img3, String h11, String h12, String h13) {
		this.img1 = img1;
		this.img2 = img2;
		this.img3 = img3;
		this.h11 = h11;
		this.h12 = h12;
		this.h13 = h13;

		slider.setMin(0.0);
		slider.setMax(2.0);
		slider.setValue(1.0);

		panel.setWidth(650, Unit.PIXELS);

		ExternalResource externalResource = new ExternalResource(img1);
		Image image = new Image(h11, externalResource);
		image.addClickListener(new ClickListener() {

			@Override
			public void click(ClickEvent event) {
				slider.setValue(2.0);

			}
		});

		panel.setCaption(h11);
		image.setWidth(630, Unit.PIXELS);
		panel.setContent(image);

		try {
			currencyPage = new ForeignCurrencyPage();
		} catch (Exception e) {

		}

		slider.addValueChangeListener(event -> sliderValue());
		layout.addComponent(panel);
		
		horizontalLayout.addComponent(layout);
		

		layout2.addComponent(weatherPage);
		layout2.setComponentAlignment(weatherPage, Alignment.TOP_CENTER);
		layout2.addComponent(currencyPage);
		layout2.setComponentAlignment(currencyPage, Alignment.TOP_CENTER);
		layout2.setSpacing(false);
		layout2.setHeight(500,Unit.PIXELS);
		
		horizontalLayout.addComponent(layout2);
		
		horizontalLayout.setSpacing(false);
		addComponent(horizontalLayout);
		horizontalLayout.setComponentAlignment(layout2, Alignment.TOP_LEFT);
	}

	public void sliderValue() {

		if (slider.getValue() == 0.0) {
			ExternalResource externalResource = new ExternalResource(img1);

			Image image = new Image(h12, externalResource);
			image.addClickListener(new ClickListener() {

				@Override
				public void click(ClickEvent event) {
					slider.setValue(1.0);

				}
			});
			image.setWidth(650, Unit.PIXELS);
			panel.setCaption(h11);
			panel.setContent(image);

		} else if (slider.getValue() == 1.0) {
			ExternalResource externalResource = new ExternalResource(img2);
			Image image = new Image("", externalResource);
			image.addClickListener(new ClickListener() {

				@Override
				public void click(ClickEvent event) {
					slider.setValue(2.0);

				}
			});
			image.setWidth(650, Unit.PIXELS);
			panel.setCaption(h12);
			panel.setContent(image);

		} else {
			ExternalResource externalResource = new ExternalResource(img3);
			Image image = new Image(h13, externalResource);
			image.addClickListener(new ClickListener() {

				@Override
				public void click(ClickEvent event) {
					slider.setValue(0.0);

				}
			});
			image.setWidth(650, Unit.PIXELS);
			panel.setCaption(h13);
			panel.setContent(image);

		}

	}
}
