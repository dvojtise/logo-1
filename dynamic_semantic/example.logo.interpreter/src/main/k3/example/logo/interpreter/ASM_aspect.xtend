package example.logo.interpreter

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable
import example.logo.model.logoASM.Back
import example.logo.model.logoASM.Block
import example.logo.model.logoASM.Clear
import example.logo.model.logoASM.Constant
import example.logo.model.logoASM.Div
import example.logo.model.logoASM.Equals
import example.logo.model.logoASM.Expression
import example.logo.model.logoASM.Forward
import example.logo.model.logoASM.Greater
import example.logo.model.logoASM.If
import example.logo.model.logoASM.Instruction
import example.logo.model.logoASM.Left
import example.logo.model.logoASM.LogoProgram
import example.logo.model.logoASM.Lower
import example.logo.model.logoASM.Minus
import example.logo.model.logoASM.Mult
import example.logo.model.logoASM.Parameter
import example.logo.model.logoASM.ParameterCall
import example.logo.model.logoASM.PenDown
import example.logo.model.logoASM.PenUp
import example.logo.model.logoASM.Plus
import example.logo.model.logoASM.Primitive
import example.logo.model.logoASM.ProcCall
import example.logo.model.logoASM.ProcDeclaration
import example.logo.model.logoASM.Repeat
import example.logo.model.logoASM.Right
import example.logo.model.logoASM.While
import example.logo.model.logoASM.ControlStructure
import example.logo.model.logoASM.BinaryExp

import vmLogo.Segment
import vmLogo.Turtle

import static extension example.logo.interpreter.InstructionAspect.*
import static extension example.logo.interpreter.BackAspect.*
import static extension example.logo.interpreter.BlockAspect.*
import static extension example.logo.interpreter.ClearAspect.*
import static extension example.logo.interpreter.ConstantAspect.*
import static extension example.logo.interpreter.DivAspect.*
import static extension example.logo.interpreter.EqualsAspect.*
import static extension example.logo.interpreter.ExpressionAspect.*
import static extension example.logo.interpreter.ForwardAspect.*
import static extension example.logo.interpreter.GreaterAspect.*
import static extension example.logo.interpreter.IfAspect.*
import static extension example.logo.interpreter.InstructionAspect.*
import static extension example.logo.interpreter.LeftAspect.*
import static extension example.logo.interpreter.LogoProgramAspect.*
import static extension example.logo.interpreter.LowerAspect.*
import static extension example.logo.interpreter.MinusAspect.*
import static extension example.logo.interpreter.MultAspect.*
import static extension example.logo.interpreter.ParameterAspect.*
import static extension example.logo.interpreter.ParameterCallAspect.*
import static extension example.logo.interpreter.PenDownAspect.*
import static extension example.logo.interpreter.PenUpAspect.*
import static extension example.logo.interpreter.PlusAspect.*
import static extension example.logo.interpreter.PrimitiveAspect.*
import static extension example.logo.interpreter.ProcCallAspect.*
import static extension example.logo.interpreter.ProcDeclarationAspect.*
import static extension example.logo.interpreter.RepeatAspect.*
import static extension example.logo.interpreter.RightAspect.*
import static extension example.logo.interpreter.WhileAspect.*
import  static extension example.logo.interpreter.ControlStructureAspect.*
import  static extension example.logo.interpreter.BinaryExpAspect.*


import static extension example.logo.interpreter.PointAspect.*
import static extension example.logo.interpreter.SegmentAspect.*
import static extension example.logo.interpreter.TurtleAspect.*

@Aspect(className=typeof(Instruction)) 
abstract class InstructionAspect {

	 public def abstract int eval (Context context )  

}

@Aspect(className=typeof(Primitive)) 
public class PrimitiveAspect extends InstructionAspect{  

	@OverrideAspectMethod
	def int eval (Context context) {
		return 0
	}

} 

@Aspect(className=typeof(Back))
public class BackAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = -1*  _self.steps.eval(context)
		println("BACK "+ param)
		context.turtle.forward(param)
		return 0
	}

}

@Aspect(className=typeof(Forward))
public class ForwardAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = _self.steps.eval(context)
		println("FORWARD " + param)
		context.turtle.forward(param)
		return 0
	}

}
 
@Aspect(className=typeof(Left))
public class LeftAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = (-1)  *_self.angle.eval(context)
		println("LEFT " + param)
		context.turtle.rotate(param)
		return 0
	}

}

@Aspect(className=typeof(Right))
public class RightAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int param = _self.angle.eval(context)
		println("RIGHT " + param)
		context.turtle.rotate(param)
		return 0
	}

}

@Aspect(className=typeof(PenDown))
public class PenDownAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		println("PENDOWN")
		context.turtle.setPenUp(false)
		return 0
	}

}

@Aspect(className=typeof(PenUp))
public class PenUpAspect extends PrimitiveAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		println("PENUP")
		context.turtle.setPenUp(true)
		return 0
	}

}

@Aspect(className=typeof(Clear))
public class ClearAspect extends PrimitiveAspect{
	
	@OverrideAspectMethod
	def int eval (Context context) {
		println("CLEAR")
		context.turtle.reset
		return 0
	}

}

@Aspect(className=typeof(Expression))
public class ExpressionAspect extends InstructionAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return 0 
	}

}

@Aspect(className=typeof(Constant))
public class ConstantAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.integerValue
	}

}

@Aspect(className=typeof(ProcCall))
public class ProcCallAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		println("Calling of : " + _self.declaration.name)
		var Hashtable<String,Integer> params = new Hashtable<String,Integer>()
		
		var int i = 0
		for (Expression exp : _self.actualArgs){
			var int currentArg = exp.eval(context)
			params.put(_self.declaration.args.get(i).name,currentArg)
			i= i+1
		}
		
		context.push(params)
		
		 _self.res = 0
		_self.declaration.instructions.forEach[instr | _self.res = instr.eval(context)]
		
		context.pop
		return _self.res
	}

	 int res = 0
}

@Aspect(className=ProcDeclaration)
public class ProcDeclarationAspect extends InstructionAspect{
	@OverrideAspectMethod
	def int eval (Context context) {
		return 0
	}
}

@Aspect(className=Block)
public class BlockAspect extends InstructionAspect{

	int res = 0
	@OverrideAspectMethod
	def int eval (Context context) {
		_self.instructions.forEach[instruction | _self.res = instruction.eval(context)]
		return _self.res
	}
	
}

@Aspect(className=typeof(ControlStructure))
public class ControlStructureAspect extends InstructionAspect{
	@OverrideAspectMethod
	def int eval (Context context) {
		return 0
	}
}

@Aspect(className=typeof(If))
public class IfAspect extends ControlStructureAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		if (_self.condition.eval(context) != 0) {
			return _self.thenPart.eval(context)
		}
		else{
			return _self.elsePart.eval(context)
		}
	}

}

@Aspect(className=typeof(Repeat))
public class RepeatAspect extends ControlStructureAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		var int time =  _self.condition.eval(context)
		while( time > 0){
			_self.block.eval(context)
			time = time - 1
		}
		return 0
	}

}

@Aspect(className=typeof(While))
public class WhileAspect extends ControlStructureAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		while(_self.condition.eval(context) > 0){
			_self.block.eval(context)
		}
		return 0
	}

}

@Aspect(className=typeof(Parameter))
public class ParameterAspect {

	def int eval (Context context) {
		return context.peek.get(_self.name)
	}

}

@Aspect(className=typeof(ParameterCall))
public class ParameterCallAspect extends ExpressionAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.parameter.eval(context)
	}

}

@Aspect(className=typeof(BinaryExp))
public class BinaryExpAspect extends ExpressionAspect{
	def int eval (Context context) {
		return 0
	}
}

@Aspect(className=typeof(Plus))
public class PlusAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.lhs.eval(context) + _self.rhs.eval(context)
	}

}

@Aspect(className=typeof(Minus))
public class MinusAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.lhs.eval(context) - _self.rhs.eval(context)
	}

}

@Aspect(className=typeof(Mult))
public class MultAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		return _self.lhs.eval(context) * _self.rhs.eval(context)
	}

}

@Aspect(className=typeof(Div))
public class DivAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		if(_self.rhs.eval(context) != 0) {
			return _self.lhs.eval(context) / _self.rhs.eval(context)
		}
		else{
			return 0
		}
	}

}

@Aspect(className=typeof(Equals))
public class EqualsAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		if(_self.lhs.eval(context) == _self.rhs.eval(context)) {
			return 1
			}
		else{
			return 0
		}
	}

}

@Aspect(className=typeof(Greater))
public class GreaterAspect extends BinaryExpAspect{

	@OverrideAspectMethod
	def int eval (Context context) {
		if(_self.lhs.eval(context) > _self.rhs.eval(context)) {
			return 1
		}
		else{
			return 0
		}
	}

}

@Aspect(className=typeof(Lower))
public class LowerAspect extends BinaryExpAspect{

	def int eval (Context context) {
		if(_self.lhs.eval(context) < _self.rhs.eval(context)) {
			return 1
			}
		else{
			return 0
		}
	}

}

@Aspect(className=typeof(LogoProgram))
public class LogoProgramAspect {

	def int eval (Context context) {
		println("LogoProgram eval !")
		_self.instructions.forEach[instr  | instr.eval(context)]
		return 0
	}

}

