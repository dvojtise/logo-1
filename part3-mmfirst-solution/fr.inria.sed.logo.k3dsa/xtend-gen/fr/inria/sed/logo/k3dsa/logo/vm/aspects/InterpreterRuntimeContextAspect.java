package fr.inria.sed.logo.k3dsa.logo.vm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties;
import fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem;
import org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystemManager;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Aspect(className = InterpreterRuntimeContext.class)
@SuppressWarnings("all")
public class InterpreterRuntimeContextAspect {
  public static MessagingSystem logger(final InterpreterRuntimeContext _self) {
    final fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties _self_ = fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# MessagingSystem logger()
    if (_self instanceof fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext){
    	result = fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspect._privk3_logger(_self_, (fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext)_self);
    };
    return (org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem)result;
  }
  
  /**
   * paramMap helpers
   */
  public static void pushParamMap(final InterpreterRuntimeContext _self, final HashMap<String, Integer> paramMap) {
    final fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties _self_ = fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void pushParamMap(HashMap<String, Integer>)
    if (_self instanceof fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext){
    	fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspect._privk3_pushParamMap(_self_, (fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext)_self,paramMap);
    };
  }
  
  public static HashMap<String, Integer> peekParamMap(final InterpreterRuntimeContext _self) {
    final fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties _self_ = fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# HashMap<String, Integer> peekParamMap()
    if (_self instanceof fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext){
    	result = fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspect._privk3_peekParamMap(_self_, (fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext)_self);
    };
    return (java.util.HashMap<java.lang.String, java.lang.Integer>)result;
  }
  
  public static HashMap<String, Integer> popParamMap(final InterpreterRuntimeContext _self) {
    final fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties _self_ = fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# HashMap<String, Integer> popParamMap()
    if (_self instanceof fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext){
    	result = fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspect._privk3_popParamMap(_self_, (fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext)_self);
    };
    return (java.util.HashMap<java.lang.String, java.lang.Integer>)result;
  }
  
  private static MessagingSystem internalLogger(final InterpreterRuntimeContext _self) {
    final fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties _self_ = fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# MessagingSystem internalLogger()
    if (_self instanceof fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext){
    	result = fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspect._privk3_internalLogger(_self_, (fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext)_self);
    };
    return (org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem)result;
  }
  
  private static void internalLogger(final InterpreterRuntimeContext _self, final MessagingSystem internalLogger) {
    final fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties _self_ = fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void internalLogger(MessagingSystem)
    if (_self instanceof fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext){
    	fr.inria.sed.logo.k3dsa.logo.vm.aspects.InterpreterRuntimeContextAspect._privk3_internalLogger(_self_, (fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext)_self,internalLogger);
    };
  }
  
  protected static MessagingSystem _privk3_logger(final InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties _self_, final InterpreterRuntimeContext _self) {
    MessagingSystem _internalLogger = InterpreterRuntimeContextAspect.internalLogger(_self);
    boolean _tripleEquals = (_internalLogger == null);
    if (_tripleEquals) {
      final MessagingSystemManager msManager = new MessagingSystemManager();
      InterpreterRuntimeContextAspect.internalLogger(_self, msManager.createBestPlatformMessagingSystem("Logo", "Simple Logo interpreter"));
    }
    return InterpreterRuntimeContextAspect.internalLogger(_self);
  }
  
  protected static void _privk3_pushParamMap(final InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties _self_, final InterpreterRuntimeContext _self, final HashMap<String, Integer> paramMap) {
    _self.getStack().add(paramMap);
  }
  
  protected static HashMap<String, Integer> _privk3_peekParamMap(final InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties _self_, final InterpreterRuntimeContext _self) {
    return IterableExtensions.<HashMap<String, Integer>>last(_self.getStack());
  }
  
  protected static HashMap<String, Integer> _privk3_popParamMap(final InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties _self_, final InterpreterRuntimeContext _self) {
    HashMap<String, Integer> _xblockexpression = null;
    {
      IterableExtensions.<HashMap<String, Integer>>last(_self.getStack());
      EList<HashMap<String, Integer>> _stack = _self.getStack();
      int _size = _self.getStack().size();
      int _minus = (_size - 1);
      _xblockexpression = _stack.remove(_minus);
    }
    return _xblockexpression;
  }
  
  protected static MessagingSystem _privk3_internalLogger(final InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties _self_, final InterpreterRuntimeContext _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getInternalLogger") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.gemoc.commons.eclipse.messagingsystem.api.MessagingSystem) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.internalLogger;
  }
  
  protected static void _privk3_internalLogger(final InterpreterRuntimeContextAspectInterpreterRuntimeContextAspectProperties _self_, final InterpreterRuntimeContext _self, final MessagingSystem internalLogger) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setInternalLogger")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, internalLogger);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.internalLogger = internalLogger;
    }
  }
}
