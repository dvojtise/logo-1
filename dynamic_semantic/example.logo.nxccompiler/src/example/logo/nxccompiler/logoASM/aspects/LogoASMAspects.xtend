package example.logo.nxccompiler.logoASM.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import example.logo.model.logoASM.Instruction
import example.logo.model.logoASM.Primitive
import example.logo.model.logoASM.Back
import example.logo.model.logoASM.Forward
import example.logo.model.logoASM.Left
import example.logo.model.logoASM.Right
import example.logo.model.logoASM.PenDown
import example.logo.model.logoASM.PenUp
import example.logo.model.logoASM.Clear
import example.logo.model.logoASM.Expression
import example.logo.model.logoASM.BinaryExp
import example.logo.model.logoASM.Constant
import example.logo.model.logoASM.ProcCall
import example.logo.model.logoASM.ProcDeclaration
import example.logo.model.logoASM.Block
import example.logo.model.logoASM.If
import example.logo.model.logoASM.ControlStructure
import example.logo.model.logoASM.Repeat
import example.logo.model.logoASM.While
import example.logo.model.logoASM.Parameter
import example.logo.model.logoASM.ParameterCall
import example.logo.model.logoASM.Plus
import example.logo.model.logoASM.Minus
import example.logo.model.logoASM.Mult
import example.logo.model.logoASM.Div
import example.logo.model.logoASM.Equals
import example.logo.model.logoASM.Greater
import example.logo.model.logoASM.Lower
import example.logo.model.logoASM.LogoProgram

import static extension example.logo.nxccompiler.logoASM.aspects.InstructionAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.PrimitiveAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.BackAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.ForwardAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.LeftAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.RightAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.PenDownAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.PenUpAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.ClearAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.ExpressionAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.BinaryExpAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.ConstantAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.ProcCallAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.ProcDeclarationAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.BlockAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.IfAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.ControlStructureAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.RepeatAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.WhileAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.ParameterAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.ParameterCallAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.PlusAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.MinusAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.MultAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.DivAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.EqualsAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.GreaterAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.LowerAspect.*
import static extension example.logo.nxccompiler.logoASM.aspects.LogoProgramAspect.*
import example.logo.nxccompiler.NXCCompiler
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import example.logo.nxccompiler.NXCCompilerContext

@Aspect(className=Instruction)
abstract class InstructionAspect {
	def abstract String compileToNXC(NXCCompilerContext context);
}

@Aspect(className=Primitive)
abstract class PrimitiveAspect extends InstructionAspect {
	@OverrideAspectMethod
	def abstract String compileToNXC(NXCCompilerContext context);
}

@Aspect(className=Back)
class BackAspect extends PrimitiveAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return "forward(-(" + _self.steps.compileToNXC(context) + "));"
	}
}

@Aspect(className=Forward)
class ForwardAspect extends PrimitiveAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return "forward(" + _self.steps.compileToNXC(context) + ");"
	}
}

@Aspect(className=Left)
class LeftAspect extends PrimitiveAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return "turn(" + _self.angle.compileToNXC(context) + ");"
	}
}

@Aspect(className=Right)
class RightAspect extends PrimitiveAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return "turn(-(" + _self.angle.compileToNXC(context) + "));"
	}
}

@Aspect(className=PenDown)
class PenDownAspect extends PrimitiveAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return "penDown();"
	}
}

@Aspect(className=PenUp)
class PenUpAspect extends PrimitiveAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return "penUp();"
	}
}

@Aspect(className=Clear)
class ClearAspect extends PrimitiveAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return "// RESET NOT POSSIBLE ON REAL ROBOT"
	}
}

@Aspect(className=Expression)
abstract class ExpressionAspect extends InstructionAspect {

}

@Aspect(className=BinaryExp)
abstract class BinaryExpAspect extends ExpressionAspect {

}

@Aspect(className=Constant)
class ConstantAspect extends ExpressionAspect {

}

@Aspect(className=ProcCall)
class ProcCallAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return '''«_self.declaration.name»(«FOR arg : _self.actualArgs SEPARATOR ', '»
			«arg.compileToNXC(context)»
«ENDFOR»);'''
	}
}

@Aspect(className=ProcDeclaration)
class ProcDeclarationAspect extends InstructionAspect {

	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		val StringBuilder result = new StringBuilder
		result.append("// Declaration of " + _self.name + " function")
		
		val StringBuilder proc = new StringBuilder
		proc.append("sub " + _self.name + "(")
		proc.append('''«FOR arg : _self.args SEPARATOR ', '»int «arg.name»«ENDFOR»''')
		proc.append(")\n")
		proc.append("{\n")
		var depth = context.depth
		context.depth = 0
		_self.instructions.forEach[i | 
			proc.append(i.compileToNXC(context))]
		
		context.subs.add(proc.toString)
		context.depth = depth
		return result.toString
	}
}

@Aspect(className=Block)
class BlockAspect extends InstructionAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		val StringBuilder result = new StringBuilder
		result.append(context.prefix + "{\n")
		context.incDepth
		_self.instructions.forEach[instruction|
			result.append(context.prefix + instruction.compileToNXC(context) + "\n")
		]
		context.decDepth
		result.append(context.prefix + "}")
		return result.toString
	}
}

@Aspect(className=If)
class IfAspect extends ControlStructureAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){	
		val ifThenPartString = '''if («_self.condition.compileToNXC(context)»")
«_self.thenPart.compileToNXC(context)»'''
		var elsePartString = "";
		if(_self.elsePart != null){
			elsePartString = '''
«context.prefix»else«_self.elsePart.compileToNXC(context)»'''
		}
		return ifThenPartString+elsePartString
	}
}

@Aspect(className=ControlStructure)
class ControlStructureAspect extends InstructionAspect {

}

@Aspect(className=Repeat)
class RepeatAspect extends ControlStructureAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){	
		return '''«context.prefix»while («_self.condition.compileToNXC(context)»)\n"«_self.block.compileToNXC(context)»'''
	}
}

@Aspect(className=While)
class WhileAspect extends ControlStructureAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){	
		return '''repeat («_self.condition.compileToNXC(context)»)\n«_self.block.compileToNXC(context)»'''
	}
}

@Aspect(className=Parameter)
class ParameterAspect {

}

@Aspect(className=ParameterCall)
class ParameterCallAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return _self.parameter.name
	}
}

@Aspect(className=Plus)
class PlusAspect extends BinaryExpAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return '''«_self.lhs.compileToNXC(context)» + «_self.rhs.compileToNXC(context)»'''
	}
}

@Aspect(className=Minus)
class MinusAspect extends BinaryExpAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return '''«_self.lhs.compileToNXC(context)» - «_self.rhs.compileToNXC(context)»'''
	}
}

@Aspect(className=Mult)
class MultAspect extends BinaryExpAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return '''«_self.lhs.compileToNXC(context)» * «_self.rhs.compileToNXC(context)»'''
	}
}

@Aspect(className=Div)
class DivAspect extends BinaryExpAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return '''«_self.lhs.compileToNXC(context)» / «_self.rhs.compileToNXC(context)»'''
	}
}

@Aspect(className=Equals)
class EqualsAspect extends BinaryExpAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return '''«_self.lhs.compileToNXC(context)» == «_self.rhs.compileToNXC(context)»'''
	}
}

@Aspect(className=Greater)
class GreaterAspect extends BinaryExpAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return '''«_self.lhs.compileToNXC(context)» > «_self.rhs.compileToNXC(context)»'''
	}
}

@Aspect(className=Lower)
class LowerAspect extends BinaryExpAspect {
	@OverrideAspectMethod
	def String compileToNXC(NXCCompilerContext context){
		return '''«_self.lhs.compileToNXC(context)» < «_self.rhs.compileToNXC(context)»'''
	}
}

@Aspect(className=LogoProgram)
class LogoProgramAspect {
	def String compileToNXC(NXCCompilerContext context){
		val StringBuilder result = new StringBuilder 
		result.append(context.prefix)
		context.incDepth
		_self.instructions.forEach[instruction| 
			result.append('''«context.prefix»«instruction.compileToNXC(context)»\n''' )
		]
		context.decDepth
		result.append(context.prefix)
		return result.toString
	}
}



