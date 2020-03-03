package fr.inria.sed.logo.k3dsa.logo.vm.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspectTurtleAspectProperties;
import fr.inria.sed.logo.vm.model.vm.Point;
import fr.inria.sed.logo.vm.model.vm.Segment;
import fr.inria.sed.logo.vm.model.vm.Turtle;
import fr.inria.sed.logo.vm.model.vm.VmFactory;

@Aspect(className = Turtle.class)
@SuppressWarnings("all")
public class TurtleAspect {
  public static void rotate(final Turtle _self, final Integer angle) {
    final fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspectTurtleAspectProperties _self_ = fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspectTurtleAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void rotate(Integer)
    if (_self instanceof fr.inria.sed.logo.vm.model.vm.Turtle){
    	fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspect._privk3_rotate(_self_, (fr.inria.sed.logo.vm.model.vm.Turtle)_self,angle);
    };
  }
  
  public static void move(final Turtle _self, final double dx, final double dy) {
    final fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspectTurtleAspectProperties _self_ = fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspectTurtleAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void move(double,double)
    if (_self instanceof fr.inria.sed.logo.vm.model.vm.Turtle){
    	fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspect._privk3_move(_self_, (fr.inria.sed.logo.vm.model.vm.Turtle)_self,dx,dy);
    };
  }
  
  public static void forward(final Turtle _self, final Integer steps) {
    final fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspectTurtleAspectProperties _self_ = fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspectTurtleAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void forward(Integer)
    if (_self instanceof fr.inria.sed.logo.vm.model.vm.Turtle){
    	fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspect._privk3_forward(_self_, (fr.inria.sed.logo.vm.model.vm.Turtle)_self,steps);
    };
  }
  
  /**
   * scale the "steps" expressed using integer by a factor
   */
  public static double scale(final Turtle _self, final Integer steps, final Double factor) {
    final fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspectTurtleAspectProperties _self_ = fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspectTurtleAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# double scale(Integer,Double)
    if (_self instanceof fr.inria.sed.logo.vm.model.vm.Turtle){
    	result = fr.inria.sed.logo.k3dsa.logo.vm.aspects.TurtleAspect._privk3_scale(_self_, (fr.inria.sed.logo.vm.model.vm.Turtle)_self,steps,factor);
    };
    return (double)result;
  }
  
  protected static void _privk3_rotate(final TurtleAspectTurtleAspectProperties _self_, final Turtle _self, final Integer angle) {
    double _heading = _self.getHeading();
    double _plus = (_heading + (angle).intValue());
    double _modulo = (_plus % 360);
    _self.setHeading(_modulo);
  }
  
  protected static void _privk3_move(final TurtleAspectTurtleAspectProperties _self_, final Turtle _self, final double dx, final double dy) {
    final Point point = VmFactory.eINSTANCE.createPoint();
    double _x = _self.getPosition().getX();
    double _plus = (_x + dx);
    point.setX(_plus);
    double _y = _self.getPosition().getY();
    double _minus = (_y - dy);
    point.setY(_minus);
    _self.getReachedPoints().add(point);
    boolean _isPenUp = _self.isPenUp();
    boolean _not = (!_isPenUp);
    if (_not) {
      final Segment drawnSegment = VmFactory.eINSTANCE.createSegment();
      drawnSegment.setOrigin(_self.getPosition());
      drawnSegment.setDestination(point);
      _self.getSegments().add(drawnSegment);
    }
    _self.setPosition(point);
  }
  
  protected static void _privk3_forward(final TurtleAspectTurtleAspectProperties _self_, final Turtle _self, final Integer steps) {
    final double headingAsRadian = Math.toRadians(_self.getHeading());
    TurtleAspect.move(_self, TurtleAspect.scale(_self, steps, Double.valueOf(Math.sin(headingAsRadian))), TurtleAspect.scale(_self, steps, Double.valueOf(Math.cos(headingAsRadian))));
  }
  
  protected static double _privk3_scale(final TurtleAspectTurtleAspectProperties _self_, final Turtle _self, final Integer steps, final Double factor) {
    double _doubleValue = steps.doubleValue();
    double _multiply = (_doubleValue * (factor).doubleValue());
    return (((Double) Double.valueOf(_multiply))).doubleValue();
  }
}
