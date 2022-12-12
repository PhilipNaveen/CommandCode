package frc.robot.shooter.commands.control;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.shooter.ShooterBase;

public class ShooterControl extends CommandBase {
    private ShooterBase shooterBase;
    protected double percent;

    public ShooterControl(ShooterBase shooterBase) {
        this.shooterBase = shooterBase;
        addRequirements(shooterBase);
    }

    @Override
    public void execute() {
        shooterBase.setPercent(percent);
    }
}
