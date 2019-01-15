package fr.inria.sed.logo.k3dsa.logo.vm.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem
import java.util.HashMap

@Aspect(className=InterpreterRuntimeContext)
class InterpreterRuntimeContextAspect {
	var MessagingSystem internalLogger  
	def MessagingSystem logger(){
		if (_self.internalLogger === null) { 
			val MessagingSystemManager msManager = new MessagingSystemManager
			_self.internalLogger = msManager.createBestPlatformMessagingSystem("Logo","Simple Logo interpreter")
			
		} 
		return _self.internalLogger
	}
	
	/* paramMap helpers */
	def void pushParamMap(HashMap<String, Integer> paramMap) {
		_self.stack.add(paramMap)
	}
	def HashMap<String, Integer> peekParamMap(){
		_self.stack.last
	}
	def  HashMap<String, Integer> popParamMap(){
		_self.stack.last
		_self.stack.remove(_self.stack.size -1)
	}
	
}