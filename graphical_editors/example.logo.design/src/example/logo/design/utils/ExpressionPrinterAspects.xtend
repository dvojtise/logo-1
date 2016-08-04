package example.logo.design.utils

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import example.logo.model.logoASM.Expression
import example.logo.model.logoASM.BinaryExp
import example.logo.model.logoASM.Constant
import example.logo.model.logoASM.ParameterCall
import example.logo.model.logoASM.Plus
import example.logo.model.logoASM.Minus
import example.logo.model.logoASM.Mult
import example.logo.model.logoASM.Div
import example.logo.model.logoASM.Equals
import example.logo.model.logoASM.Greater
import example.logo.model.logoASM.Lower

import static extension example.logo.design.utils.ExpressionPrettyPrinterAspect.*
import static extension example.logo.design.utils.BinaryExpPrettyPrinterAspect.*
import static extension example.logo.design.utils.ConstantPrettyPrinterAspect.*
import static extension example.logo.design.utils.ParameterCallPrettyPrinterAspect.*
import static extension example.logo.design.utils.PlusPrettyPrinterAspect.*
import static extension example.logo.design.utils.MinusPrettyPrinterAspect.*
import static extension example.logo.design.utils.MultPrettyPrinterAspect.*
import static extension example.logo.design.utils.DivPrettyPrinterAspect.*
import static extension example.logo.design.utils.EqualsPrettyPrinterAspect.*
import static extension example.logo.design.utils.GreaterPrettyPrinterAspect.*
import static extension example.logo.design.utils.LowerPrettyPrinterAspect.*
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

@Aspect(className=Expression)
abstract class ExpressionPrettyPrinterAspect  {
	def abstract String prettyPrint();
}

@Aspect(className=BinaryExp)
abstract class BinaryExpPrettyPrinterAspect extends ExpressionPrettyPrinterAspect {
	@OverrideAspectMethod
	def abstract String prettyPrint();
}

@Aspect(className=Constant)
class ConstantPrettyPrinterAspect extends ExpressionPrettyPrinterAspect {
	@OverrideAspectMethod
	def String prettyPrint(){
		return ""+_self.integerValue
	}
}

@Aspect(className=ParameterCall)
class ParameterCallPrettyPrinterAspect extends ExpressionPrettyPrinterAspect {

	@OverrideAspectMethod
	def String prettyPrint(){
		return _self.parameter.name
	}
}

@Aspect(className=Plus)
class PlusPrettyPrinterAspect extends BinaryExpPrettyPrinterAspect {
	@OverrideAspectMethod
	def String prettyPrint(){
		return _self.lhs.prettyPrint + " + " + _self.rhs.prettyPrint
	}
}

@Aspect(className=Minus)
class MinusPrettyPrinterAspect extends BinaryExpPrettyPrinterAspect {
	@OverrideAspectMethod
	def String prettyPrint(){
		return _self.lhs.prettyPrint + " - " + _self.rhs.prettyPrint
	}
}

@Aspect(className=Mult)
class MultPrettyPrinterAspect extends BinaryExpPrettyPrinterAspect {
	@OverrideAspectMethod
	def String prettyPrint(){
		return _self.lhs.prettyPrint + " * " + _self.rhs.prettyPrint
	}
}

@Aspect(className=Div)
class DivPrettyPrinterAspect extends BinaryExpPrettyPrinterAspect {
	@OverrideAspectMethod
	def String prettyPrint(){
		return _self.lhs.prettyPrint + " / " + _self.rhs.prettyPrint
	}
}

@Aspect(className=Equals)
class EqualsPrettyPrinterAspect extends BinaryExpPrettyPrinterAspect {
	@OverrideAspectMethod
	def String prettyPrint(){
		return _self.lhs.prettyPrint + " = " + _self.rhs.prettyPrint
	}
}

@Aspect(className=Greater)
class GreaterPrettyPrinterAspect extends BinaryExpPrettyPrinterAspect {
	@OverrideAspectMethod
	def String prettyPrint(){
		return _self.lhs.prettyPrint + " > " + _self.rhs.prettyPrint
	}
}

@Aspect(className=Lower)
class LowerPrettyPrinterAspect extends BinaryExpPrettyPrinterAspect {
	@OverrideAspectMethod
	def String prettyPrint(){
		return _self.lhs.prettyPrint + " < " + _self.rhs.prettyPrint
	}
}




