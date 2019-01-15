package fr.inria.sed.logo.k3dsa.logo.vm.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
	
import fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem
import java.util.HashMap
import fr.inria.sed.logo.vm.model.vm.ParamMap

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
	def void pushParamMap(ParamMap paramMap) {
		_self.stack.add(paramMap)
	}
	def ParamMap peekParamMap(){
		_self.stack.last
	}
	def  ParamMap popParamMap(){
		_self.stack.last
		_self.stack.remove(_self.stack.size -1)
	}
	
}