/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.main.RobotMap;
import com.revrobotics.*;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class DriveTrain extends Subsystem {
  /* Create CANSparkMax motor controller objects. White space to differ between master objects and slave objects */
  CANSparkMax //Master motor controller objects
    drive_right_M = new CANSparkMax(RobotMap.drive_right_M, MotorType.kBrushless),
    drive_left_M = new CANSparkMax(RobotMap.drive_left_M, MotorType.kBrushless);
  CANSparkMax //Slave motor controller objects
    drive_left_S = new CANSparkMax(RobotMap.drive_left_S, MotorType.kBrushless),
    drive_right_S = new CANSparkMax(RobotMap.drive_right_S, MotorType.kBrushless);
  @Override
  protected void initDefaultCommand() {
    /* Set masters and followers */
    drive_left_S.follow(drive_left_M);
    drive_right_S.follow(drive_right_M);

    /* Close motor controllers to save resources after the motor controller object is created */
    drive_left_S.close();
    drive_right_S.close();
  }
  public void teleop (double LYAxis, double RYAxis) {
    drive_left_M.set(LYAxis);
    drive_right_M.set(RYAxis);
  }
}
