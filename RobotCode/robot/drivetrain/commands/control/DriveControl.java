package frc.robot.drivetrain.commands.control;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.drivetrain.DrivetrainBase;

public class DriveControl extends CommandBase {
    private DrivetrainBase drivetrainBase;

    protected double leftPercent = 0;
    protected double rightPercent = 0;

    public DriveControl(DrivetrainBase drivetrainBase) {
        this.drivetrainBase = drivetrainBase;
        addRequirements(drivetrainBase);
    }

    @Override
    public void execute() {
        this.drivetrainBase.differentialDrive.tankDrive(leftPercent, rightPercent);
    }
}
