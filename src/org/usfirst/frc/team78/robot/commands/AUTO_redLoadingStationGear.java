package org.usfirst.frc.team78.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AUTO_redLoadingStationGear extends CommandGroup {

    public AUTO_redLoadingStationGear() {
  
    	
    	addSequential(new driveStraight(-3.1)); //Initial Drive (ID)
    	addSequential(new turn(45));  //39, Turn Angle (<)
    	addSequential(new driveStraight(-7), 4); //Drive After Turn (DAT)
    	addSequential(new autoGearDown());
    	
    	//Wait 1.5 seconds for gear deploy (wait() uses setTimeout(), which takes seconds rather than milliseconds)
    	addSequential(new wait(1.5));
    	
    	addSequential(new driveStraight(0.3), 0.05);
    	addSequential(new driveStraight(3));
    	addSequential(new gearOuttake("out", 0.5), 0.5);
    	addSequential(new gearOuttake("out", 0), 0.5);
    	addSequential(new driveStraight(2));
    	addSequential(new gearUp(), 0.5);
    	addSequential(new turn(-0));
    	addSequential(new driveStraightFast(-21));
    }
}
