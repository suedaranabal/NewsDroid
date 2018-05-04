package com.example.NewsDroid;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.MenuBar.MenuItem;
import com.vaadin.ui.VerticalLayout;

import elemental.util.MapFromStringToNumber;

@SuppressWarnings("serial")
public class MenuBar extends VerticalLayout {

	private com.vaadin.ui.MenuBar menubar = new com.vaadin.ui.MenuBar();
	private com.vaadin.ui.MenuBar menubar2 = new com.vaadin.ui.MenuBar();
	public MenuItem home;
	public MenuItem flash;
	public MenuItem world;
	public MenuItem agenda;
	public MenuItem sport;
	public MenuItem science;
	public MenuItem columnists;
	public MenuItem gallery;
	public MenuItem cinema;
	public MenuItem weather;
	public MenuItem traffic;
	public MenuItem worship;

	@SuppressWarnings("deprecation")
	public MenuBar() {

		home = menubar.addItem("Anasayfa", null);
		home.setIcon(FontAwesome.HOME);
		flash = menubar.addItem("Son Dakika", null);
		flash.setIcon(FontAwesome.FLASH);
		agenda = menubar.addItem("Gündem", null);
		agenda.setIcon(FontAwesome.SUN_O);
		world = menubar.addItem("Dünya", null);
		world.setIcon(FontAwesome.GLOBE);
		sport = menubar.addItem("Spor", null);
		sport.setIcon(FontAwesome.SOCCER_BALL_O);
		science = menubar.addItem("Bilim", null);
		science.setIcon(FontAwesome.FLASK);
		columnists = menubar.addItem("Köşe Yazarları", null);
		columnists.setIcon(FontAwesome.EDIT);
		gallery = menubar.addItem("Galeri", null);
		gallery.setIcon(FontAwesome.IMAGE);
		cinema = menubar.addItem("BeyazPerde", null);
		cinema.setIcon(FontAwesome.FILE_MOVIE_O);
		// ikinci Menu bar başlangıcı

		traffic = menubar2.addItem("Trafik Durumu", null);
		traffic.setIcon(FontAwesome.CAR);
		worship = menubar2.addItem("Ezan Vakitleri", null);
		worship.setIcon(FontAwesome.CLOCK_O);
		addComponent(menubar);
		addComponent(menubar2);
		
		setComponentAlignment(menubar, Alignment.MIDDLE_CENTER);
		setComponentAlignment(menubar2, Alignment.MIDDLE_CENTER);
	}
}
