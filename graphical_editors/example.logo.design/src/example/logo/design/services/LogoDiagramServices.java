package example.logo.design.services;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import example.logo.design.utils.ExpressionPrettyPrinterAspect;
import example.logo.model.logoASM.Back;
import example.logo.model.logoASM.Block;
import example.logo.model.logoASM.ControlStructure;
import example.logo.model.logoASM.Expression;
import example.logo.model.logoASM.Forward;
import example.logo.model.logoASM.Instruction;
import example.logo.model.logoASM.Left;
import example.logo.model.logoASM.LogoProgram;
import example.logo.model.logoASM.PenDown;
import example.logo.model.logoASM.PenUp;
import example.logo.model.logoASM.Primitive;
import example.logo.model.logoASM.ProcDeclaration;
import example.logo.model.logoASM.Right;

public class LogoDiagramServices {

	public Collection<EObject> getProgramMainInstructions(LogoProgram p) {
		ArrayList<EObject> children = new ArrayList<EObject>();
		for(Instruction i : p.getInstructions()){
//			if(! (i instanceof ProcDeclaration )){
				children.add(i);
//			}
		}
		return children;
	}
	public Collection<EObject> getProgramProcDeclarations(LogoProgram p) {
		ArrayList<EObject> children = new ArrayList<EObject>();
		
		for(Instruction i : p.getInstructions()){
			if(i instanceof ProcDeclaration ){
				children.add(i);
			}
		}
		return children;
	}
	
	public EObject getNextInstruction(Instruction sourceInstruction){
		if(sourceInstruction.eContainer()  instanceof LogoProgram){
			LogoProgram containerLogoProgram = (LogoProgram)sourceInstruction.eContainer();				
			int index = containerLogoProgram.getInstructions().indexOf(sourceInstruction);
			if(index+1 < containerLogoProgram.getInstructions().size()){
				return containerLogoProgram.getInstructions().get(index+1);
			}
		} else if(sourceInstruction.eContainer()  instanceof ProcDeclaration){
			ProcDeclaration containerDecl = (ProcDeclaration)sourceInstruction.eContainer();				
			int index = containerDecl.getInstructions().indexOf(sourceInstruction);
			if(index+1 < containerDecl.getInstructions().size()){
				return containerDecl.getInstructions().get(index+1);
			}
		} else if(sourceInstruction.eContainer()  instanceof Block){
			Block containerBlock = (Block)sourceInstruction.eContainer();				
			int index = containerBlock.getInstructions().indexOf(sourceInstruction);
			if(index+1 < containerBlock.getInstructions().size()){
				return containerBlock.getInstructions().get(index+1);
			}
		}
		return null;
	}
	
	public boolean isSimpleInstruction(Instruction i){
		return i instanceof Primitive;
	}
	
	public String getLabelForInstruction(Instruction i){
		if(i instanceof Back){
			return i.eClass().getName() +" " + ExpressionPrettyPrinterAspect.prettyPrint(((Back)i).getSteps());
		} else if(i instanceof Forward){
			return i.eClass().getName() +" " + ExpressionPrettyPrinterAspect.prettyPrint(((Forward)i).getSteps());			
		} else if(i instanceof Left){
			return i.eClass().getName() +" " + ExpressionPrettyPrinterAspect.prettyPrint(((Left)i).getAngle());
		} else if(i instanceof Right){
			return i.eClass().getName() +" " + ExpressionPrettyPrinterAspect.prettyPrint(((Right)i).getAngle());
		}
		
		return i.eClass().getName();
	}
	

	public String getLabelForControlStructure(ControlStructure c){
		return c.eClass().getName() + "("+ExpressionPrettyPrinterAspect.prettyPrint(c.getCondition())+")";
	}
	
	public String prettyPrintExpression(Expression e){
		return ExpressionPrettyPrinterAspect.prettyPrint(e);
	}
}
