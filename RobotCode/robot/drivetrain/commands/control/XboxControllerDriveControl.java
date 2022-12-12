package frc.robot.drivetrain.commands.control;

import frc.robot.drivetrain.DrivetrainBase;
import org.talon540.control.XboxController.TalonXboxController;

public class XboxControllerDriveControl extends DriveControl{
    private TalonXboxController controller;

    public XboxControllerDriveControl(DrivetrainBase drivetrainBase, TalonXboxController controller) {
        super(drivetrainBase);
        this.controller = controller;
    }

    @Override
    public void execute() {
        this.leftPercent = this.controller.getLeftDeadbandY();
        this.rightPercent = this.controller.getRightDeadbandY();

        super.execute();
    }
}
