package org.usfirst.frc.team78.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AUTO_redLoadingStationGear extends CommandGroup {

    public AUTO_redLoadingStationGear() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm, 
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    	
    	addSequential(new driveStraight(-3));
    	addSequential(new turn(39));
    	addSequential(new driveStraight(-6.0));
    	addSequential(new autoGearDown());
    	addSequential(new driveStraight(0.3), 0.05);
    	addSequential(new driveStraight(3));
    	addSequential(new gearOuttake("out", 0.5), 0.5);
    	addSequential(new gearOuttake("out", 0), 0.5);
    	addSequential(new driveStraight(2));
    	addSequential(new gearUp(), 0.5);
    	addSequential(new turn(-0.5));
    	addSequential(new driveStraightFast(-25));
    }
}
