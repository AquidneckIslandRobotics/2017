package org.usfirst.frc.team78.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
	
	//Motors
		//Left Drive 
		public static final int LEFT_FRONT = 3;  
		public static final int LEFT_REAR = 1;
		public static final int LEFT_TOP = 2;
		//Right Drive
		public static final int RIGHT_FRONT = 4;
		public static final int RIGHT_REAR = 6;
		public static final int RIGHT_TOP = 5;
		
		//Shooter
		public static final int SHOOTER_LEFT = 8;
		public static final int SHOOTER_RIGHT = 9;
		
		//Intake
		public static final int INTAKE_MOTOR = 7;
		public static final int INTAKE_SOLENOID1 = 1;
		public static final int INTAKE_SOLENOID2 = 2;
		
		//Gears
		public static final int GEAR_INTAKE_MOTOR = 100;  //NEED REAL VALUE HERE PLS
		public static final int GEAR_SOLENOID1 = 3;
		public static final int GEAR_SOLENOID2 = 4;
		
	//Sensors
		//Shooter
		public static final int SHOOTER_ENCA = 0;
		public static final int SHOOTER_ENCB = 1;
		 
		//Chassis
		public static final int LEFT_DRIVE_ENCA = 2;
		public static final int LEFT_DRIVE_ENCB = 3;
		public static final int RIGHT_DRIVE_ENCA = 4;
		public static final int RIGHT_DRIVE_ENCB = 5;
		
		//Intake
		public static final int INTAKE_ENCA = 6;
		public static final int INTAKE_ENCB = 7;
		
}
