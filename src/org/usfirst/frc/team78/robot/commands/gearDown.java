package org.usfirst.frc.team78.robot.commands;

import org.usfirst.frc.team78.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class gearDown extends Command {

	
    public gearDown() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.gear.downGear();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	Robot.gear.downGear();
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false; //false for teleop possibly
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.gear.upGear();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    }
}
