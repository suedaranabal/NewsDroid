package Pages;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

public class WorshipPage extends Panel {

	VerticalLayout layout = new VerticalLayout();
	HorizontalLayout horizontalLayout = new HorizontalLayout();
	
	public WorshipPage() {
		setWidth(1000, Unit.PIXELS);
		Label label = new Label("<iframe name=\"vakit\" src=\"http://www.vakitci.com/vakit2.php?tema=sty\" height=\"565\" "
				+ "width=\"450\" scrolling=\"no\" border=\"0\" frameborder=\"0\"></iframe>");
		label.setContentMode(ContentMode.HTML);
		
		
		Image image = new Image("",new ExternalResource("https://www.gencdoku.com/wp-content/uploads/cami_6326.jpg"));
		
		
		
		
		horizontalLayout.addComponent(label);
		horizontalLayout.addComponent(image);
		image.setSizeFull();
		layout.addComponent(horizontalLayout);
		setContent(layout);
		
		
	}
}
//<iframe name=\"vakit\" src=\"http://www.vakitci.com/vakit2.php?tema=sty\" height=\"550\" width=\"450\" scrolling=\"no\" border=\"0\" frameborder=\"0\"></iframe>
//<iframe src=\"http://gadget.turktakvim.com/\" width=\"750\" height=\"750\" scrolling=\"Auto\" frameborder=\"0\"></iframe>