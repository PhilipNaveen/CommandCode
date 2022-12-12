package frc.robot.roller.commands.control;

import frc.robot.roller.RollerBase;
import org.talon540.control.XboxController.TalonXboxController;;

public class XboxControllerRollerControl extends RollerControl {
    private TalonXboxController controller;

    public XboxControllerRollerControl(RollerBase rollerBase, TalonXboxController controller) {
        super(rollerBase);
        this.controller = controller;
    }

    @Override
    public void execute() {
        this.percent = controller.buttons.Y.get()
            ? 0.5
            : controller.buttons.A.get()
            ? -1
            : 0;

        super.execute();
    }
}
