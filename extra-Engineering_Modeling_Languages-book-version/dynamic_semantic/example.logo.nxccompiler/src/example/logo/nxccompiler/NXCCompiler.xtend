package example.logo.nxccompiler

import static extension example.logo.nxccompiler.logoASM.aspects.LogoProgramAspect.*

class NXCCompiler {
	

	def String compile(String uri,  String api){
		val context = new NXCCompilerContext
		context.depth = 0
		// TODO load root
		var String nxc = context.root.compileToNXC(context)
		// We shoudl read API from the file but right now it is hard codded
		val String result = injectFrameworkAPI(context, nxc)
//		result := NXCCodeGenerator.new.generate(subs, nxc)
//io.writeTextFile(out, result)
		return result
	}

	def String injectFrameworkAPI(NXCCompilerContext context, String nxc){
		return '''
/**
 * This is the implementation of a LOGO Turtle for NXT
 * Author : Franck FLEUREY
 * License : GPL
 *
 * The robot is suposed to have two wheels controled 
 * by two separate motors. The distance between the two
 * wheels is D and the diameter of the wheel is d.
 * For this implementation to work D/d must be an integer.
 * A third motor controls a pen up and down. The Pen should
 * touch the paper right in the middle of the two wheels.
 *
 */

#include "NXCDefs.h"

// Correponds to D/d
#define ANGLE_FACTOR 8

// The Motors connections
#define PEN_MOTOR OUT_A
#define RIGHT_MOTOR OUT_B
#define LEFT_MOTOR OUT_C
#define MOVE_MOTORS OUT_BC

// define step lenght in wheel rotation (degree)
#define STEP 50

// define the angle of which the pen motor has to move
#define PEN_ANGLE 45

// The motor spped to use (not two fast to avoid drifting)
#define SPEED 50

/**
 * The Robot will move straight forward for d steps
 */
sub forward(int d)
{
// int angle = d * STEP;
   int angle = d * STEP;
  OnFwd(LEFT_MOTOR, SPEED);
  OnFwd(RIGHT_MOTOR, SPEED);
  Wait(angle);
 //ResetTachoCount(MOVE_MOTORS)
 // RotateMotorEx(ports, pwr, angle, turnpct, bSync, bStop)
// RotateMotorEx(MOVE_MOTORS, SPEED, angle, 0, true, false);
 Off(MOVE_MOTORS);
}

/**
 * The Robot will turn by n degree around the pen (hopefuly)
 */
sub turn(int n)
{
 //RotateMotorEx(MOVE_MOTORS, SPEED, n * ANGLE_FACTOR, -100, false, false);
 
 
 if (n>0) {
  OnRev(LEFT_MOTOR, SPEED);
  OnFwd(RIGHT_MOTOR, SPEED);
  Wait(n*ANGLE_FACTOR);
  Off(MOVE_MOTORS);
 }
 else {
  OnRev(RIGHT_MOTOR, SPEED);
  OnFwd(LEFT_MOTOR, SPEED);
  Wait((-n)*ANGLE_FACTOR);
  Off(MOVE_MOTORS);
 }
}

/**
 * The Pen goes up
 */
sub penUp()
{
 RotateMotor(PEN_MOTOR, SPEED, -PEN_ANGLE);
 // SetSensorType(IN_1, IN_TYPE_LIGHT_INACTIVE);
}

/**
 * The Pen goes down
 */
sub penDown()
{
 RotateMotor(PEN_MOTOR, SPEED, PEN_ANGLE);
 // SetSensorType(IN_1, IN_TYPE_LIGHT_ACTIVE);
}
/************************************************************/
/*  END OF THE API, THE COMPILED CODE GOES BELOW THIS LINE  */
/************************************************************/
«FOR sub : context.subs»«sub»«ENDFOR»

task main()
{
«nxc»
}'''
	}

}
