// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix6.hardware.TalonFX;

import frc.robot.Constants;

public class IntakeSubsystem extends SubsystemBase {
  private final TalonFX intakeMotor;

  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem() {
    intakeMotor = new TalonFX(Constants.IntakeConstants.kIntakeMotorPort); // Replace with the actual CAN ID
  }

  public void runIntake() {
    intakeMotor.set(Constants.IntakeConstants.IntakeSpeed);
  }

  public void runShooter() {
    intakeMotor.set(Constants.IntakeConstants.ShooterSpeed);
  }

  public void stop() {
    intakeMotor.stopMotor();
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
