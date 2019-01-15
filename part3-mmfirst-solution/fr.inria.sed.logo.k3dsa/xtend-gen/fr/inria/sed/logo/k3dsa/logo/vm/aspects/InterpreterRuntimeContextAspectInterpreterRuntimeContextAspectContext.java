package fr.inria.sed.logo.k3dsa.logo.vm.aspects;

import fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties;
import fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext;
import java.util.Map;

@SuppressWarnings("all")
public class InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectContext {
  public final static InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectContext INSTANCE = new InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectContext();
  
  public static InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties getSelf(final InterpreterRuntimeContext _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InterpreterRuntimeContext, InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties> map = new java.util.WeakHashMap<fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext, fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties>();
  
  public Map<InterpreterRuntimeContext, InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties> getMap() {
    return map;
  }
}
