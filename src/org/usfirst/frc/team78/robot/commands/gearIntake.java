package org.usfirst.frc.team78.robot.commands;

import org.usfirst.frc.team78.robot.Robot;
import org.usfirst.frc.team78.robot.subsystems.Gear;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class gearIntake extends Command {
	
	String direction;
	double speed;
	double speedx;
	int i;

    public gearIntake(String Direction, double Speed) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.gear);
    	direction = Direction;
    	speedx = Speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	i = 0;
    	speed = speedx;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.gear.getCurrent() >= 8 && i > 20){
    		speed = 0;
    		Robot.gear.currentDraw = true;
    	}else{
    		speed = speed;
    	}
    	Robot.gear.setIntake(direction, speed);  
    	
    	i++;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(speed == 0){
    		return true;
    	}else{
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.gear.upGear();
    	Robot.gear.stopIntakeMotor();
    	Robot.oi.gearIntakeBool = false;
    	Robot.gear.currentDraw = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	
    }
}
