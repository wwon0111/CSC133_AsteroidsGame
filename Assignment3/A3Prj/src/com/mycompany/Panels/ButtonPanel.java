package com.mycompany.Panels;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Button;
import com.codename1.ui.CheckBox;
import com.codename1.ui.ComboBox;
import com.codename1.ui.Command;
import com.codename1.ui.Component;
import com.codename1.ui.Container;
//Contents of File  SimpleForm.java:
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.geom.Dimension;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.plaf.Border;
import com.mycompany.commands.addAsteroids;
import com.mycompany.commands.addFlyingSaucers;
import com.mycompany.commands.addReloadMissiles;
import com.mycompany.commands.addShips;
import com.mycompany.commands.addSpaceStation;
/** This class creates a simple "Form"  by extending an existing
*  class "Form", defined in the CN1 ui package.
*/
public class ButtonPanel extends Button{
	
	public ButtonPanel(String Label, Command cmd, int color) {
		super(Label);
		
		/******************************LEFT CONTAINER******************************/
	    /*
		//left Container with the BoxLayout positioned on the west 
		Container leftContainer = new Container(new BoxLayout(BoxLayout.Y_AXIS));
		//start adding components at a location 50 pixels below the upper border of the container
		leftContainer.getAllStyles().setPadding(Component.TOP, 50);
		leftContainer.setScrollable(true);
		leftContainer.getAllStyles().setBgColor(ColorUtil.LTGRAY);
		leftContainer.getAllStyles().setBorder(Border.createLineBorder(4, ColorUtil.BLACK));
		add(BorderLayout.WEST,leftContainer);*/	
  		
		this.getAllStyles().setBgTransparency(0);
		this.getAllStyles().setPadding(Component.TOP, 50);
		this.getAllStyles().setBgColor(ColorUtil.LTGRAY);
		this.getAllStyles().setBorder(Border.createLineBorder(4, ColorUtil.BLACK));
  		this.getAllStyles().setPadding(TOP, 1);
  		this.getAllStyles().setPadding(BOTTOM, 1);
  		
		this.getUnselectedStyle().setBgColor(color);
		this.getUnselectedStyle().setFgColor(ColorUtil.BLUE);
		//this.getUnselectedStyle().setSize(new Dimension(160, 40));
		
		this.getSelectedStyle().setBgTransparency(255);
		this.getSelectedStyle().setBgColor(ColorUtil.GRAY);
		this.getSelectedStyle().setFgColor(ColorUtil.BLUE);
		
		this.getDisabledStyle().setBgTransparency(255);
		this.getDisabledStyle().setBgColor(ColorUtil.GRAY);
		this.getDisabledStyle().setFgColor(ColorUtil.BLACK);
		this.getDisabledStyle().setStrikeThru(true);
		
		this.setCommand(cmd);
	}
}
