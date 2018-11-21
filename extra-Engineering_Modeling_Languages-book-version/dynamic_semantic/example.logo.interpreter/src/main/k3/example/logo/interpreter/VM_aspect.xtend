// MDE_BOOK_START
package example.logo.interpreter

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import vmLogo.Point
import vmLogo.Segment
import vmLogo.Turtle

import static extension example.logo.interpreter.PointAspect.*
import static extension example.logo.interpreter.SegmentAspect.*
import static extension example.logo.interpreter.TurtleAspect.*
//MDE_BOOK_END
@Aspect(className=typeof(Point)) 
class PointAspect
{ 
	def Point initialize(double a, double b){
		_self.x = a
		_self.y = b
		return _self
	}
	def Point getDelta(double dx, double dy) {		
		var Point res = vmLogo.VmLogoFactory.eINSTANCE.createPoint()
		res.x = _self.x + dx
		res.y = _self.y + dy	
		return res		
	}
	
	def String asString() {
		return "[" + _self.x as int + "," + _self.y as int + "]"
	} 
}

@Aspect(className=typeof(Segment)) 		
class SegmentAspect
{
	def Segment initialize(Point orig , Point dest ) {
		_self.origin = orig
		_self.destination = dest
		return _self
	}
}
//MDE_BOOK_START
@Aspect(className=typeof(Turtle)) 
class TurtleAspect {
	
	
	def Turtle initialize(){
		_self.reset()
		return _self
	}
	
	def void reset() {
		_self.position = vmLogo.VmLogoFactory.eINSTANCE.createPoint().initialize(0,0)
		_self.heading = 0
		_self.penUp = true
		_self.drawings.clear
	
	}
			
	def void setPenUp(boolean b) {
		_self.penUp = b
	}
	
	def void rotate(int angle) {
		_self.heading = (_self.heading + angle) % 360
	}

	def void move(double dx, double  dy) {
		var Point newPos = _self.position.getDelta(dx,dy)
		if(_self.penUp) {
			println("Turtle move to "+ newPos.asString)	
		}
		else {
			println("Turtle trace to "+ newPos.asString)
			_self.drawings.add(vmLogo.VmLogoFactory.eINSTANCE.createSegment.initialize(_self.position,newPos))
		}
		_self.position = newPos
	}
		
	def void forward(int steps) {
	    var double radian = Math.toRadians(_self.heading)
	    _self.move(_self.scale(steps,Math.sin(radian)), _self.scale(steps,Math.cos(radian)))
	}
   
   /**
	* scale the "steps" by factor
	*/
	def double scale(int steps, double factor) {
		return steps * factor
	}
}
//MDE_BOOK_END