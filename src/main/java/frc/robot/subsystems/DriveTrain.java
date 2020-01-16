/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.Subsystems.DriveTrain;

import edu.wpi.first.wpilibj.SpeedControllerGroup;

import com.revrobotics.*;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;



public class DriveTrain{
CANSparkMax m_frontLeft = new CANSparkMax(1, MotorType.kBrushless);
CANSparkMax m_rearLeft = new CANSparkMax(2, MotorType.kBrushless);
SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

CANSparkMax m_frontRight = new CANSparkMax(3, MotorType.kBrushless);
CANSparkMax m_rearRight = new CANSparkMax(4, MotorType.kBrushless);
SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);

/*Ask Corbin what tf this is for
protected void initDefaultCommand(){
    m_frontLeft.follow(m_left);
    m_rearLeft.follow(m_left);
    m_frontRight.follow(m_right);
    m_rearRight.follow(m_right);
}*/
}
