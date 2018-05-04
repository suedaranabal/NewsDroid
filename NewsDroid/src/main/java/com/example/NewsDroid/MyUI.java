package com.example.NewsDroid;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.annotation.WebServlet;

import org.atmosphere.util.analytics.GoogleAnalytics_v1_URLBuildingStrategy;

import com.vaadin.annotations.StyleSheet;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.Page;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Component;
import com.vaadin.ui.JavaScript;
import com.vaadin.ui.JavaScriptFunction;
import com.vaadin.ui.MenuBar.Command;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import Pages.AgendaPage;
import Pages.CinemaPage;
import Pages.ColumnistsPage;
import Pages.GalleryPages;
import Pages.HomePage;
import Pages.SciencePage;
import Pages.SportPage;
import Pages.TrafficPage;

import Pages.WorldPage;
import elemental.json.JsonArray;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of an HTML page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 */

@Theme("mytheme")

public class MyUI extends UI {
	WorldPage world = null;
	AgendaPage agenda = null;
	NewsDetail detail = null;
	SportPage sport = null;
	SciencePage science = null;
	ColumnistsPage columnists = null;
	HomePage homePage = null;
	GalleryPages gallery = null;
	CinemaPage cinema = null;
	TrafficPage traffic = null;


	final VerticalLayout layout = new VerticalLayout();

	
	
	@Override
	protected void init(VaadinRequest vaadinRequest) {

		
		
		
		
		MenuBar menubar = new MenuBar();
		menubar.world.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectWorld();

			}

		});

		menubar.agenda.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectAgenda();

			}

		});

		menubar.sport.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectSport();

			}

		});
		menubar.science.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectScience();

			}

		});

		menubar.columnists.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectColumnists();

			}
		});
		menubar.home.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectHomePage();

			}
		});
		menubar.gallery.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectGalleryPage();

			}

		});
		menubar.cinema.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectCinemaPage();
			}
		});

		menubar.traffic.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectTrafficPage();
			}
		});

		

		try {

			homePage = new HomePage();
			agenda = new AgendaPage();
			world = new WorldPage();
			sport = new SportPage();
			science = new SciencePage();
			columnists = new ColumnistsPage();
			gallery = new GalleryPages();
			cinema = new CinemaPage();
			traffic = new TrafficPage();
			
			detail = new NewsDetail("News/World/World1.txt");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		layout.addComponent(menubar);
		layout.addComponent(homePage);
		layout.addComponent(world);
		layout.addComponent(agenda);
		layout.addComponent(sport);
		layout.addComponent(science);
		layout.addComponent(columnists);
		layout.addComponent(gallery);
		layout.addComponent(cinema);
		layout.addComponent(traffic);
		
		setContent(layout);
		layout.setComponentAlignment(menubar, Alignment.MIDDLE_CENTER);

		layout.setComponentAlignment(homePage, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(world, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(agenda, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(sport, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(science, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(columnists, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(gallery, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(cinema, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(traffic, Alignment.MIDDLE_CENTER);
	

		layout.setSpacing(false);

	}

	public void selectWorld() {
		world.setVisible(true);
		homePage.setVisible(false);
		agenda.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		traffic.setVisible(false);
		detail.setVisible(false);
		

	}

	public void selectAgenda() {
		agenda.setVisible(true);
		homePage.setVisible(false);
		world.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		traffic.setVisible(false);
		
		detail.setVisible(false);
	}

	public void selectSport() {
		sport.setVisible(true);
		homePage.setVisible(false);
		agenda.setVisible(false);
		world.setVisible(false);
		science.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		traffic.setVisible(false);
		
		detail.setVisible(false);
	}

	public void selectScience() {
		science.setVisible(true);
		homePage.setVisible(false);
		sport.setVisible(false);
		agenda.setVisible(false);
		world.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		traffic.setVisible(false);
		
		detail.setVisible(false);
	}

	public void selectColumnists() {

		columnists.setVisible(true);
		homePage.setVisible(false);
		world.setVisible(false);
		agenda.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		traffic.setVisible(false);
		
		detail.setVisible(false);
	}

	public void selectHomePage() {

		homePage.setVisible(true);
		columnists.setVisible(false);
		world.setVisible(false);
		agenda.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		traffic.setVisible(false);
		
		detail.setVisible(false);
	}

	public void selectGalleryPage() {

		gallery.setVisible(true);
		homePage.setVisible(false);
		columnists.setVisible(false);
		world.setVisible(false);
		agenda.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		cinema.setVisible(false);
		traffic.setVisible(false);
		detail.setVisible(false);
	}

	public void selectCinemaPage() {
		cinema.setVisible(true);
		world.setVisible(false);
		homePage.setVisible(false);
		agenda.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		traffic.setVisible(false);
		detail.setVisible(false);

	}

	public void selectTrafficPage() {
		traffic.setVisible(true);
		world.setVisible(false);
		homePage.setVisible(false);
		agenda.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		detail.setVisible(false);

	}

	

	public void selectDetail(String url) throws IOException {
		detail = new NewsDetail(url);

		detail.setVisible(true);
		homePage.setVisible(false);
		science.setVisible(false);
		sport.setVisible(false);
		agenda.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		world.setVisible(false);
		cinema.setVisible(false);
		traffic.setVisible(false);

		layout.addComponent(detail);
		layout.setComponentAlignment(detail, Alignment.MIDDLE_CENTER);

	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
}
