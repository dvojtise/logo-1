package fr.inria.sed.logo.k3dsa.logo.vm.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import fr.inria.sed.logo.vm.model.vm.Turtle
import fr.inria.sed.logo.vm.model.vm.VmFactory

@Aspect(className=Turtle)
class TurtleAspect {
	
	def void rotate(Integer angle) {
		_self.heading = (_self.heading + angle) % 360
	}
			
	def void move(double dx, double dy){
		// create new Point for destination
		val point = VmFactory.eINSTANCE.createPoint
		point.x = _self.position.x + dx
		point.y = _self.position.y - dy
		_self.reachedPoints.add(point)
		
		if(!_self.penUp){
			val drawnSegment = VmFactory.eINSTANCE.createSegment
			drawnSegment.origin = _self.position
			drawnSegment.destination = point
			_self.segments.add(drawnSegment)
		}
		_self.position = point
	}
	
	def void forward(Integer steps){
		val headingAsRadian = Math.toRadians(_self.heading)
		_self.move(_self.scale(steps, Math.sin(headingAsRadian)), _self.scale(steps, Math.cos(headingAsRadian)))
	}
	
	/**
	 * scale the "steps" expressed using integer by a factor
	 */
	def double scale(Integer steps, Double factor){
		return (steps.doubleValue * factor) as Double
	}		
}