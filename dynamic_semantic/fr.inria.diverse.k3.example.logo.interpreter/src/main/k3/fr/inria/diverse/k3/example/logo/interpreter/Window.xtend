package fr.inria.diverse.k3.example.logo.interpreter

import javax.swing.JFrame
import java.awt.Color
import java.awt.Graphics
import javax.swing.RepaintManager.PaintManager
import javax.swing.JPanel
import java.awt.Paint


import vmLogo.Segment
import vmLogo.Turtle

//import static extension fr.inria.diverse.k3.example.logo.interpreter.SegmentAspect.*
//import static extension fr.inria.diverse.k3.example.logo.interpreter.TurtleAspect.*

class Window {
	JFrame frame;
	
	new(Turtle t){
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Logo example");
		frame.setVisible(true)
		frame.add(new Board(t, 250, 250))
	}
	
//	def static void main(String[] args) {
//		var Window w = new Window();
//	}
	
}

class Board extends JPanel{
	
	Turtle turtle;
	int x_offset = 0;
	int y_offset = 0;
	
	
	new(Turtle t, int x_offset, int y_offset){
		turtle = t
		this.x_offset = x_offset
		this.y_offset = y_offset
	}
	
	override paint(Graphics g){
		for(Segment seg : turtle.drawings){
			g.drawLine(	(seg.origin.x+x_offset) as int,(seg.origin.y+y_offset) as int,
						(seg.destination.x+x_offset) as int,(seg.destination.y+y_offset) as int
			)
		}		
	}
	
}