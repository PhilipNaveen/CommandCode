package frc.robot.climberz.commands.control;

import org.talon540.control.XboxController.TalonXboxController;
import frc.robot.climberz.ClimbersBase;

public class XboxControllerClimbersControl extends ClimbersControl{
    private TalonXboxController controller;

    public XboxControllerClimbersControl(ClimbersBase subsystem, TalonXboxController controller) {
        super(subsystem);
        this.controller = controller;
    }

    @Override
    public void execute() {
        this.percent = controller.buttons.DPAD_NORTH.get()
            ? 1
            : controller.buttons.DPAD_SOUTH.get()
            ? -1
            : 0;

        super.execute();
    }
}
