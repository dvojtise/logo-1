package fr.inria.sed.logo.xdsml.ui.turtleboard;

import java.util.HashMap;

import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.gemoc.api.IMultiDimensionalTraceAddon;
import org.eclipse.gemoc.xdsmlframework.api.core.IExecutionEngine;
import org.eclipse.gemoc.xdsmlframework.api.engine_addon.IEngineAddon;

import fr.inria.sed.logo.LogoProgram;
import fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext;
import fr.inria.sed.logo.vm.model.vm.Turtle;

public class TurtleBoardEngineAddon implements IEngineAddon {

	
	static HashMap<String, ITurtleGUI> turtleGUIs =  new HashMap<String, ITurtleGUI>();
	
	@Override
	public void engineStarted(IExecutionEngine<?> executionEngine) {		
		IEngineAddon.super.engineStarted(executionEngine);
		
		String name = executionEngine.getName();
		// workaround https://github.com/eclipse/gemoc-studio-modeldebugging/issues/80
		// 			this method is called 2 times instead of one...
		ITurtleGUI turtleGUI = turtleGUIs.get(name);
		if(turtleGUI != null) {
			
			turtleGUI.dispose();
		}
		// end of workaround
		
		// create new gui
		turtleGUI = new TurtleSimpleAWTGUI(
				executionEngine.getExecutionContext().getResourceModel().getURI().lastSegment(), 
				600);
		turtleGUIs.put(name,turtleGUI);
		
		
		// get notification from trace addon to refresh the view
		IMultiDimensionalTraceAddon traceCandidate = null;
		for (IEngineAddon addon : executionEngine.getExecutionContext().getExecutionPlatform().getEngineAddons()) {
			if(addon instanceof IMultiDimensionalTraceAddon) {
				traceCandidate = (IMultiDimensionalTraceAddon) addon;
			}
		}
		if(traceCandidate != null) {
			TraceBasedUpdater viewUpdater = new TraceBasedUpdater(executionEngine, turtleGUI);
			traceCandidate.getTraceExplorer().registerCommand(viewUpdater, () -> viewUpdater.update());
		}
	}

	@Override
	public void engineAboutToDispose(IExecutionEngine<?> engine) {
		IEngineAddon.super.engineAboutToDispose(engine);
		try {
			ITurtleGUI turtleGUI = turtleGUIs.get(engine.getName());
			turtleGUI.dispose();
		} catch (Exception e) {
			// TODO report error, but an addon must not crash the execution
		}
	}
	
	@Override
	public void stepExecuted(IExecutionEngine<?> engine, Step<?> stepExecuted) {
		IEngineAddon.super.stepExecuted(engine, stepExecuted);
		try {
			ITurtleGUI turtleGUI = turtleGUIs.get(engine.getName());
			
			LogoProgram prog = (LogoProgram) engine.getExecutionContext().getResourceModel().getContents().get(0);
			InterpreterRuntimeContext context = (InterpreterRuntimeContext) prog.getRuntimeContext();
			Turtle turtle = context.getTurtle();
			
			turtleGUI.drawTurtle((int)turtle.getPosition().getX(), 
					(int)turtle.getPosition().getY(), 
					turtle.getHeading(), 
					turtle.isPenUp());
			
			turtle.getSegments().stream().forEachOrdered(s -> {
				turtleGUI.drawLine((int)s.getOrigin().getX(), 
						(int)s.getOrigin().getY(), 
						(int)s.getDestination().getX(), 
						(int)s.getDestination().getY());
			});
		} catch (Exception e) {
			// TODO report error, but an addon must not crash the execution
		}
	}


	
}
