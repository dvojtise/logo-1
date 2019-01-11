package fr.inria.sed.logo.k3dsa.logo.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.Main
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
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager

@Aspect(className=LogoProgram)
class LogoProgramAspect {
	
	@Main
	def void run(){
		// println('hello world')
		val MessagingSystemManager msManager = new MessagingSystemManager
		val ms = msManager.createBestPlatformMessagingSystem("Logo","Simple Logo interpreter")
 		
		ms.debug("Hello world on "+_self.eResource.URI, "Logo")
	}
}

@Aspect(className=Instruction)
class InstructionAspect {

}

@Aspect(className=Backward)
class BackwardAspect extends PrimitiveInstructionAspect {

}

@Aspect(className=Forward)
class ForwardAspect extends PrimitiveInstructionAspect {

}

@Aspect(className=Left)
class LeftAspect extends PrimitiveInstructionAspect {

}

@Aspect(className=Right)
class RightAspect extends PrimitiveInstructionAspect {

}

@Aspect(className=PenDown)
class PenDownAspect extends PrimitiveInstructionAspect {

}

@Aspect(className=PenUp)
class PenUpAspect extends PrimitiveInstructionAspect {

}

@Aspect(className=Clear)
class ClearAspect extends PrimitiveInstructionAspect {

}

@Aspect(className=Constant)
class ConstantAspect extends ExpressionAspect {

}

@Aspect(className=ProcCall)
class ProcCallAspect extends PrimitiveInstructionAspect {

}

@Aspect(className=ProcDeclaration)
class ProcDeclarationAspect extends InstructionAspect {

}

@Aspect(className=Parameter)
class ParameterAspect {

}

@Aspect(className=Block)
class BlockAspect extends InstructionAspect {

}

@Aspect(className=If)
class IfAspect extends ControlStructureInstructionAspect {

}

@Aspect(className=Repeat)
class RepeatAspect extends ControlStructureInstructionAspect {

}

@Aspect(className=While)
class WhileAspect extends ControlStructureInstructionAspect {

}

@Aspect(className=ParameterCall)
class ParameterCallAspect extends ExpressionAspect {
	/*
	* BE CAREFUL :
	*
	* This class has more than one superclass
	* please specify which parent you want with the 'super' expected calling
	*
	*/


}

@Aspect(className=Expression)
class ExpressionAspect {

}

@Aspect(className=Equals)
class EqualsAspect extends ExpressionAspect {

}

@Aspect(className=Greater)
class GreaterAspect extends ExpressionAspect {

}

@Aspect(className=Lower)
class LowerAspect extends ExpressionAspect {

}

@Aspect(className=Plus)
class PlusAspect extends ExpressionAspect {

}

@Aspect(className=Minus)
class MinusAspect extends ExpressionAspect {

}

@Aspect(className=Mult)
class MultAspect extends ExpressionAspect {

}

@Aspect(className=Div)
class DivAspect extends ExpressionAspect {

}

@Aspect(className=PrimitiveInstruction)
abstract class PrimitiveInstructionAspect extends InstructionAspect {

}

@Aspect(className=ControlStructureInstruction)
abstract class ControlStructureInstructionAspect extends InstructionAspect {

}



