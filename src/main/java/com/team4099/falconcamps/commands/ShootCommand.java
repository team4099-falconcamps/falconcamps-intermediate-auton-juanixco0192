package com.team4099.falconcamps.commands;

import com.team4099.falconcamps.subsystems.Shooter;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class ShootCommand extends CommandBase {
    private Shooter shooter;

    public ShootCommand(int i) {
        this.shooter = i;
    }

    @Override
    public void initialize() {
        shooter.setSetpoint(5000);
    }
}
