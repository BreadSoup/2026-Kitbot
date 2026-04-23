// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.SparkMax;


public class feederSubsystem extends SubsystemBase {

  private final SparkMax feederMotor;
  /** Creates a new feederSubsystem. */
  public feederSubsystem() {
    feederMotor = new SparkMax(Constants.feederConstants.kFeederMotorPort, MotorType.kBrushless); // Replace with the actual CAN ID and motor type
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
