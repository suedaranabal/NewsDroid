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
import Pages.FlashPage;
import Pages.GalleryPages;
import Pages.HomePage;
import Pages.SciencePage;
import Pages.SportPage;

import Pages.WorldPage;
import Pages.WorshipPage;
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
	HomePage homePage = null;
	FlashPage flash = null;
	AgendaPage agenda = null;
	WorldPage world = null;
	SportPage sport = null;
	SciencePage science = null;
	ColumnistsPage columnists = null;
	GalleryPages gallery = null;
	CinemaPage cinema = null;
	WorshipPage worship = null;
	NewsDetail detail = null;

	final VerticalLayout layout = new VerticalLayout();

	@Override
	protected void init(VaadinRequest vaadinRequest) {

		MenuBar menubar = new MenuBar();

		menubar.home.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectHomePage();

			}
		});

		menubar.flash.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectFlash();

			}

		});
		menubar.agenda.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectAgenda();

			}

		});

		menubar.world.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectWorld();

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

		menubar.worship.setCommand(new Command() {

			@Override
			public void menuSelected(MenuItem selectedItem) {
				selectWorshipPage();
			}
		});

		try {

			homePage = new HomePage();
			flash = new FlashPage();
			agenda = new AgendaPage();
			world = new WorldPage();
			sport = new SportPage();
			science = new SciencePage();
			columnists = new ColumnistsPage();
			gallery = new GalleryPages();
			cinema = new CinemaPage();
			worship = new WorshipPage();

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
		layout.addComponent(flash);
		layout.addComponent(world);
		layout.addComponent(agenda);
		layout.addComponent(sport);
		layout.addComponent(science);
		layout.addComponent(columnists);
		layout.addComponent(gallery);
		layout.addComponent(cinema);
		layout.addComponent(worship);

		setContent(layout);
		layout.setComponentAlignment(menubar, Alignment.MIDDLE_CENTER);

		layout.setComponentAlignment(homePage, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(flash, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(world, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(agenda, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(sport, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(science, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(columnists, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(gallery, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(cinema, Alignment.MIDDLE_CENTER);
		layout.setComponentAlignment(worship, Alignment.MIDDLE_CENTER);

		layout.setSpacing(false);

	}

	public void selectHomePage() {

		homePage.setVisible(true);
		flash.setVisible(false);
		columnists.setVisible(false);
		world.setVisible(false);
		agenda.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		worship.setVisible(false);

		detail.setVisible(false);
	}

	public void selectFlash() {
		flash.setVisible(true);
		agenda.setVisible(false);
		homePage.setVisible(false);
		world.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		worship.setVisible(false);

		detail.setVisible(false);
	}

	public void selectAgenda() {
		agenda.setVisible(true);
		homePage.setVisible(false);
		flash.setVisible(false);
		world.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		worship.setVisible(false);

		detail.setVisible(false);
	}

	public void selectWorld() {
		world.setVisible(true);
		homePage.setVisible(false);
		flash.setVisible(false);
		agenda.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		worship.setVisible(false);
		detail.setVisible(false);

	}

	public void selectSport() {
		sport.setVisible(true);
		homePage.setVisible(false);
		flash.setVisible(false);
		agenda.setVisible(false);
		world.setVisible(false);
		science.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		worship.setVisible(false);

		detail.setVisible(false);
	}

	public void selectScience() {
		science.setVisible(true);
		homePage.setVisible(false);
		flash.setVisible(false);
		sport.setVisible(false);
		agenda.setVisible(false);
		world.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		worship.setVisible(false);

		detail.setVisible(false);
	}

	public void selectColumnists() {

		columnists.setVisible(true);
		homePage.setVisible(false);
		flash.setVisible(false);
		world.setVisible(false);
		agenda.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		gallery.setVisible(false);
		cinema.setVisible(false);
		worship.setVisible(false);

		detail.setVisible(false);
	}

	public void selectGalleryPage() {

		gallery.setVisible(true);
		homePage.setVisible(false);
		flash.setVisible(false);
		columnists.setVisible(false);
		world.setVisible(false);
		agenda.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		cinema.setVisible(false);
		worship.setVisible(false);
		detail.setVisible(false);
	}

	public void selectCinemaPage() {
		cinema.setVisible(true);
		homePage.setVisible(false);
		flash.setVisible(false);
		agenda.setVisible(false);
		world.setVisible(false);
		sport.setVisible(false);
		science.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		worship.setVisible(false);
		detail.setVisible(false);

	}

	public void selectWorshipPage() {
		worship.setVisible(true);
		homePage.setVisible(false);
		flash.setVisible(false);
		agenda.setVisible(false);
		world.setVisible(false);
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
		flash.setVisible(false);
		science.setVisible(false);
		sport.setVisible(false);
		agenda.setVisible(false);
		columnists.setVisible(false);
		gallery.setVisible(false);
		world.setVisible(false);
		cinema.setVisible(false);
		worship.setVisible(false);

		layout.addComponent(detail);
		layout.setComponentAlignment(detail, Alignment.MIDDLE_CENTER);

	}

	@WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
	@VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
	public static class MyUIServlet extends VaadinServlet {
	}
}
