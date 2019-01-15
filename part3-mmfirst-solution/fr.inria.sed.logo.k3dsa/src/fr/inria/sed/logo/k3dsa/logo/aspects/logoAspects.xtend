package fr.inria.sed.logo.k3dsa.logo.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.sed.logo.LogoProgram
import fr.inria.sed.logo.Instruction
import fr.inria.sed.logo.Backward
import fr.inria.sed.logo.Forward
import fr.inria.sed.logo.Left
import fr.inria.sed.logo.Right
import fr.inria.sed.logo.PenDown
import fr.inria.sed.logo.PenUp
import fr.inria.sed.logo.Clear
import fr.inria.sed.logo.Constant
import fr.inria.sed.logo.ProcCall
import fr.inria.sed.logo.ProcDeclaration
import fr.inria.sed.logo.Parameter
import fr.inria.sed.logo.Block
import fr.inria.sed.logo.If
import fr.inria.sed.logo.Repeat
import fr.inria.sed.logo.While
import fr.inria.sed.logo.ParameterCall
import fr.inria.sed.logo.Expression
import fr.inria.sed.logo.Equals
import fr.inria.sed.logo.Greater
import fr.inria.sed.logo.Lower
import fr.inria.sed.logo.Plus
import fr.inria.sed.logo.Minus
import fr.inria.sed.logo.Mult
import fr.inria.sed.logo.Div
import fr.inria.sed.logo.PrimitiveInstruction
import fr.inria.sed.logo.ControlStructureInstruction

import static extension fr.inria.sed.logo.k3dsa.logo.aspects.LogoProgramAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.InstructionAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.BackwardAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.ForwardAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.LeftAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.RightAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.PenDownAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.PenUpAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.ClearAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.ConstantAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.ProcCallAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.ProcDeclarationAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.ParameterAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.BlockAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.IfAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.RepeatAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.WhileAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.ParameterCallAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.ExpressionAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.EqualsAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.GreaterAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.LowerAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.PlusAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.MinusAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.MultAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.DivAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.PrimitiveInstructionAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.aspects.ControlStructureInstructionAspect.*

import static extension fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspect.*
import static extension fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspect.*

import org.eclipse.emf.common.util.EList
import fr.inria.sed.logo.vm.model.vm.VmFactory
import fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext
import java.util.HashMap

@Aspect(className=LogoProgram)
class LogoProgramAspect {
	
	
	@Step 												
	@InitializeModel									
	def void initializeModel(EList<String> args){
		val context = VmFactory.eINSTANCE.createInterpreterRuntimeContext
		context.turtle = VmFactory.eINSTANCE.createTurtle
		val point = VmFactory.eINSTANCE.createPoint
		point.x = 0
		point.y = 0
		context.turtle.reachedPoints.add(point)
		context.turtle.position = point
		_self.runtimeContext = context
	}
	
	@Main
	def void run(){
		val context = _self.runtimeContext as InterpreterRuntimeContext
 		context.logger.debug("Hello world on "+_self.eResource.URI, "Logo")
		
		_self.instructions.forEach[i | i.run(_self.runtimeContext as InterpreterRuntimeContext)]
	}
}

@Aspect(className=Instruction)
class InstructionAspect {
	@Step
	def void run(InterpreterRuntimeContext context){
		context.logger.error("run of " +_self +" should never occur, please write method run for this class", "Logo")
	}
}

@Aspect(className=Backward)
class BackwardAspect extends PrimitiveInstructionAspect {
	@Step
	def void run(InterpreterRuntimeContext context){
		context.turtle.forward(- _self.steps.eval(context))
	}

}

@Aspect(className=Forward)
class ForwardAspect extends PrimitiveInstructionAspect {
	@Step
	def void run(InterpreterRuntimeContext context){
		context.turtle.forward(_self.steps.eval(context))
	}
}

@Aspect(className=Left)
class LeftAspect extends PrimitiveInstructionAspect {
	@Step
	def void run(InterpreterRuntimeContext context){
		context.turtle.rotate(- _self.angle.eval(context))
	}
}

@Aspect(className=Right)
class RightAspect extends PrimitiveInstructionAspect {
	@Step
	def void run(InterpreterRuntimeContext context){
		context.turtle.rotate(_self.angle.eval(context))
	}
}

@Aspect(className=PenDown)
class PenDownAspect extends PrimitiveInstructionAspect {
	@Step
	def void run(InterpreterRuntimeContext context){
		context.turtle.penUp = false
	}
}

@Aspect(className=PenUp)
class PenUpAspect extends PrimitiveInstructionAspect {
	@Step
	def void run(InterpreterRuntimeContext context){
		context.turtle.penUp = true
	}
}

@Aspect(className=Clear)
class ClearAspect extends PrimitiveInstructionAspect {

}

@Aspect(className=Constant)
class ConstantAspect extends ExpressionAspect {
	def Integer eval(InterpreterRuntimeContext context){
		context.logger.debug("eval of " +_self, "Logo")
		return _self.integerValue
	}
}

@Aspect(className=ProcCall)
class ProcCallAspect extends PrimitiveInstructionAspect {
	@Step
	def void run(InterpreterRuntimeContext context){
		context.logger.debug("run of " +_self, "Logo")
		val HashMap<String, Integer> params = newHashMap;
		(0..(_self.actualArgs.size-1)).forEach[i | 
			val currentArg = _self.actualArgs.get(i).eval(context)
			params.put(_self.declaration.args.get(i).name,currentArg)
		]
		context.pushParamMap(params)
		_self.declaration.instructions.forEach[instruction | instruction.run(context)]
		context.popParamMap()
	}
}

@Aspect(className=ProcDeclaration)
class ProcDeclarationAspect extends InstructionAspect {
	@Step
	def void run(InterpreterRuntimeContext context){
		// nothing to do
	}
}

@Aspect(className=Parameter)
class ParameterAspect {

}

@Aspect(className=Block)
class BlockAspect extends InstructionAspect {
	@Step
	def void run(InterpreterRuntimeContext context){
		context.logger.debug("run of " +_self, "Logo")
		_self.instructions.forEach[i | i.run(context)]
	}
}

@Aspect(className=If)
class IfAspect extends ControlStructureInstructionAspect {
	@Step
	def void run(InterpreterRuntimeContext context){
		context.logger.debug("run of " +_self, "Logo")
		if(_self.condition.eval(context) == 1) {
			_self.thenPart.run(context)
		} else {
			_self.elsePart.run(context)
		}
	}
}

@Aspect(className=Repeat)
class RepeatAspect extends ControlStructureInstructionAspect {
	@Step
	def void run(InterpreterRuntimeContext context){
		context.logger.debug("run of " +_self, "Logo")
		for(i: 1 .. _self.condition.eval(context)) {
    		_self.block.run(context)
		}
	}
}

@Aspect(className=While)
class WhileAspect extends ControlStructureInstructionAspect {

}

@Aspect(className=ParameterCall, with=#[InstructionAspect] )
class ParameterCallAspect extends ExpressionAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/
	
	def Integer eval(InterpreterRuntimeContext context){
		context.logger.debug("eval of " +_self, "Logo")
		return context.peekParamMap.get(_self.parameter.name);
	}

}

@Aspect(className=Expression)
class ExpressionAspect {
	def Integer eval(InterpreterRuntimeContext context){
		context.logger.error("eval of " +_self +" should never occur, please write method eval for this class", 
			"Logo")
		return 0;
	}
}

@Aspect(className=Equals)
class EqualsAspect extends ExpressionAspect {

	def Integer eval(InterpreterRuntimeContext context){
		if( _self.lhs.eval(context) ==  _self.rhs.eval(context)) return 1
		else return 0
	}
}

@Aspect(className=Greater)
class GreaterAspect extends ExpressionAspect {
	def Integer eval(InterpreterRuntimeContext context){
		if( _self.lhs.eval(context) >  _self.rhs.eval(context)) return 1
		else return 0
	}
}

@Aspect(className=Lower)
class LowerAspect extends ExpressionAspect {
	def Integer eval(InterpreterRuntimeContext context){
		if( _self.lhs.eval(context) <  _self.rhs.eval(context)) return 1
		else return 0
	}
}

@Aspect(className=Plus)
class PlusAspect extends ExpressionAspect {
	def Integer eval(InterpreterRuntimeContext context){
		return _self.lhs.eval(context) + _self.rhs.eval(context)
	}
}

@Aspect(className=Minus)
class MinusAspect extends ExpressionAspect {
	def Integer eval(InterpreterRuntimeContext context){
		return _self.lhs.eval(context) - _self.rhs.eval(context)
	}
}

@Aspect(className=Mult)
class MultAspect extends ExpressionAspect {
	def Integer eval(InterpreterRuntimeContext context){
		return _self.lhs.eval(context) * _self.rhs.eval(context)
	}
}

@Aspect(className=Div)
class DivAspect extends ExpressionAspect {
	def Integer eval(InterpreterRuntimeContext context){
		return _self.lhs.eval(context) / _self.rhs.eval(context)
	}
}

@Aspect(className=PrimitiveInstruction)
abstract class PrimitiveInstructionAspect extends InstructionAspect {

}

@Aspect(className=ControlStructureInstruction)
abstract class ControlStructureInstructionAspect extends InstructionAspect {

}



