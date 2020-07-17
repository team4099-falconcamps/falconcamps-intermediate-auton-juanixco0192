package com.team4099.falconcamps.commands;

import com.team4099.falconcamps.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class DriveDistanceCommand extends CommandBase {
    private final double distanceMeters;
    private final Drivetrain drivetrain;

    private final PIDController controllerLeft = new PIDController(0, 0, 0);

    private final PIDController controllerRight = new PIDController(0, 0, 0);

    @Override
public void execute() {
     double calculatePowerLeft = controllerLeft.calculate(drivetrain.measurementInMetersLeft(),distanceMeters);
     double calculatePowerRight = controllerRight.calculate(drivetrain.measurementInMetersRight(),distanceMeters);
}

    public DriveDistanceCommand(final double distanceMeters, final Drivetrain drivetrain) {
        this.distanceMeters = distanceMeters;
        this.drivetrain = drivetrain;
    }
}
