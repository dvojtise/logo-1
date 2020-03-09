package fr.inria.sed.logo.xdsml.ui.turtleboard;

import java.awt.DisplayMode;

import org.eclipse.gemoc.trace.gemoc.api.ITraceViewListener;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.swt.widgets.Display;
import fr.inria.sed.logo.LogoProgram;
import fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext;
import fr.inria.sed.logo.vm.model.vm.Turtle;

public class TraceBasedUpdater implements ITraceViewListener{

	IExecutionEngine<?> engine = null;
	
	ITurtleGUI turtleGUI = null;
	
	
	public TraceBasedUpdater(IExecutionEngine<?> engine, ITurtleGUI turtleGUI) {
		super();
		this.engine = engine;
		this.turtleGUI = turtleGUI;
	}



	@Override
	public void update() {
		LogoProgram prog = (LogoProgram) engine.getExecutionContext().getResourceModel().getContents().get(0);
		InterpreterRuntimeContext context = (InterpreterRuntimeContext) prog.getRuntimeContext();
		if(context != null) {
			Turtle turtle = context.getTurtle();
			if(turtle != null) {
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						//turtleGUI.clearDrawing();
						turtleGUI.drawTurtle((int)turtle.getPosition().getX(), 
								(int)turtle.getPosition().getY(), 
								turtle.getHeading(), 
								turtle.isPenUp());
						// drawing segment is time consuming, avoid to do it all the time
						/*turtle.getSegments().stream().forEachOrdered(s -> {
							turtleGUI.drawLine((int)s.getOrigin().getX(), 
									(int)s.getOrigin().getY(), 
									(int)s.getDestination().getX(), 
									(int)s.getDestination().getY());
						});*/
					}
				});
				
			}
		}
	}

}
