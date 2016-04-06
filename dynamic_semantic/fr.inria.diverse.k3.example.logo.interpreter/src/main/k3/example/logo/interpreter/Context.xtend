package example.logo.interpreter

import java.util.Hashtable
import java.util.ArrayList
import vmLogo.Turtle
import vmLogo.VmLogoFactory;

import static extension example.logo.interpreter.TurtleAspect.*

class Context {
	
		/*
		 * Store lists of (paramter name, value)
		 */
		var ArrayList<Hashtable<String,Integer>> stack
		
		/*
		 * Object in charge of printing/drawing
		 */
		public var Turtle turtle
		

		new() {
			stack = new ArrayList<Hashtable<String,Integer>>()
			turtle = VmLogoFactory.eINSTANCE.createTurtle.initialize
		}
		
		def void reset () {
			stack = new ArrayList<Hashtable<String,Integer>>()
		}
		
		def Hashtable<String,Integer> peek() {
			return stack.last()
		}
		
		def Hashtable<String,Integer> pop() {
			stack.remove(stack.size - 1)
			return stack.last()
		}
		
		def void push(Hashtable<String,Integer> elem) {
			stack.add(elem)
		}
}