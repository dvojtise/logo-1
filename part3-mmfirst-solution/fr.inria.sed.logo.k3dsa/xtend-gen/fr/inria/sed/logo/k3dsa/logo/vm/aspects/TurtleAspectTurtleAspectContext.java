package fr.inria.sed.logo.k3dsa.logo.vm.aspects;

import fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspectTurtleAspectProperties;
import fr.inria.sed.logo.vm.model.vm.Turtle;
import java.util.Map;

@SuppressWarnings("all")
public class TurtleAspectTurtleAspectContext {
  public final static TurtleAspectTurtleAspectContext INSTANCE = new TurtleAspectTurtleAspectContext();
  
  public static TurtleAspectTurtleAspectProperties getSelf(final Turtle _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspectTurtleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Turtle, TurtleAspectTurtleAspectProperties> map = new java.util.WeakHashMap<fr.inria.sed.logo.vm.model.vm.Turtle, fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspectTurtleAspectProperties>();
  
  public Map<Turtle, TurtleAspectTurtleAspectProperties> getMap() {
    return map;
  }
}
