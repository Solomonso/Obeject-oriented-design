package controller;

import menu.FileMenu;
import menu.HelpMenu;
import menu.ViewMenu;
import presentation.PresentationFrame;

import java.awt.*;

public class MenuController extends MenuBar {

	private PresentationFrame presentationFrame;
	private FileMenu fileMenu;
	private ViewMenu viewMenu;
	private HelpMenu helpMenu;

	public MenuController(PresentationFrame presentationFrame) {
		this.presentationFrame = presentationFrame;
		fileMenu = new FileMenu(this.presentationFrame);
		viewMenu = new ViewMenu(this.presentationFrame);
		helpMenu = new HelpMenu(this.presentationFrame);
		add(fileMenu.makeFileMenu());
		add(viewMenu.makeViewMenu());
		add(helpMenu.makeAboutMenu());
	}

}
