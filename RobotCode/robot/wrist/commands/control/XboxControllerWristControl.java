package frc.robot.wrist.commands.control;

import org.talon540.control.XboxController.TalonXboxController;
import frc.robot.wrist.WristBase;

public class XboxControllerWristControl extends WristControl{
    private TalonXboxController controller;

    public XboxControllerWristControl(WristBase subsystem, TalonXboxController controller) {
        super(subsystem);
        this.controller = controller;
    }

    @Override
    public void execute() {
        this.percent = controller.buttons.X.get()
            ? -0.3
            : controller.buttons.B.get()
            ? 0.3
            : 0;

        super.execute();
    }
}
