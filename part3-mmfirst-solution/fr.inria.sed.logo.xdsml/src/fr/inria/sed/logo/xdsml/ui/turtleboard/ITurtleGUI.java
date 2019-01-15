/* $Id: ITurtleGUI.java,v 1.1 2007-05-31 16:10:49 dvojtise Exp $
 * Project    : org.kermeta.kmLogo
 * File       : ITurtleGUI.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 */
package fr.inria.sed.logo.xdsml.ui.turtleboard;

/**
 * interface required from the wrapper about a TurtleGUI
 *
 */
public interface ITurtleGUI {
	public void drawLine(int x1, int y1, int x2, int y2);
	public void drawTurtle(int x, int y, double angle, boolean isPenUp);
	public void clearDrawing(); 
	public void dispose(); 
}
