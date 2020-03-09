/* $Id: TurtleSimpleAWTGUI.java,v 1.8 2008-08-27 15:12:13 dvojtise Exp $
 * Project    : org.kermeta.kmLogo
 * File       : TurtleSimpleAWTGUI.java
 * License    : EPL
 * Copyright  : IRISA / INRIA / Universite de Rennes 1
 * -------------------------------------------------------------------
 * Creation date : 
 * Authors : 
 *        dvojtise <dvojtise@irisa.fr>
 * Description : 
 */
package fr.inria.sed.logo.xdsml.ui.turtleboard;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.lang.Math;

import javax.swing.JFrame;





@SuppressWarnings("serial")
public class TurtleSimpleAWTGUI extends JFrame  implements ITurtleGUI {

    private Image drawingImage;
    private Image finalImage;
    private int size;
    private Canvas turtleCanvas;
    
	
	public TurtleSimpleAWTGUI (String name, int size) {
		super("Turtle GUI : " + name);
		this.drawingImage = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		this.finalImage = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		this.size = size;
		setDefaultCloseOperation (JFrame.DISPOSE_ON_CLOSE ) ;
        setSize (size,size) ;
        turtleCanvas = new TurtleCanvas();
        getContentPane().add(turtleCanvas);
        setVisible(true);
        //turtleCanvas.createBufferStrategy(2);
        
 
        
	}
	

	// implementation on the interface required by the conroler
	
	public void clearDrawing() {
		drawingImage = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		finalImage = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
		repaint();
	}

	public void drawLine(int x1, int y1, int x2, int y2) {
		drawingImage.getGraphics().setColor(Color.WHITE);
		drawingImage.getGraphics().drawLine(size/2+x1, size/2+y1, size/2+x2, size/2+y2);
		
	}

	public void drawTurtle(int x, int y, double angle, boolean isPenUp) {
		angle = angle * Math.PI / 180 - Math.PI/2;
		int nPoints = 4;
		int xPoints[] = new int[nPoints];
		int yPoints[] = new int[nPoints];
		xPoints[0]= (int)(size/2+x + (20*Math.cos(angle)));
		yPoints[0]= (int)(size/2+y + (20*Math.sin(angle)));

		xPoints[1]= (int)(size/2+x + (10*Math.cos(angle + Math.PI/1.5)));
		yPoints[1]= (int)(size/2+y + (10*Math.sin(angle + Math.PI/1.5)));
		
		xPoints[2]= (int)(size/2+x);
		yPoints[2]= (int)(size/2+y);
		
		xPoints[3]= (int)(size/2+x + (10*Math.cos(angle - Math.PI/1.5)));
		yPoints[3]= (int)(size/2+y + (10*Math.sin(angle - Math.PI/1.5)));

		finalImage = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);		
		Graphics finalG =finalImage.getGraphics();
		finalG.drawImage(drawingImage, 0, 0, size, size, null);
		finalG.setColor(new Color(0,255,0));
		finalG.getColor();
		finalG.drawPolygon(xPoints, yPoints, nPoints);
		
		if(!isPenUp)
			finalG.fillPolygon(xPoints, yPoints, nPoints);
		else
			finalG.drawPolygon(xPoints, yPoints, nPoints);
		Graphics g = this.turtleCanvas.getGraphics();
		g.drawImage(finalImage, 0, 0, size, size, null);
		this.repaint();
		
		/*
		Graphics g = turtleCanvas.getBufferStrategy().getDrawGraphics();
		g.drawImage(finalImage, 0, 0, size, size, null);
		g.dispose();
		turtleCanvas.getBufferStrategy().show();
*/
		//repaint();
	}


	


	//private class
	/**
	 * the canvas is responsible for drawing the image
	 */
	class TurtleCanvas extends Canvas {
	    TurtleCanvas(){
	    }

	    public void paint(Graphics g) {
	    	//super.paint(g);
	    	g.drawImage(finalImage, 0, 0, size, size, null);
	    }

	    /**
	     * Overridden in order to remove an unnecessary clear
	     */
	    public void update(Graphics g) {
			paint(g);
		}
	    
	}

}
