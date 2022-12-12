package frc.robot.shooter.commands.control;

import frc.robot.shooter.ShooterBase;
import org.talon540.control.XboxController.TalonXboxController;

public class XboxControllerShooterControl extends ShooterControl {
    private TalonXboxController controller;

    public XboxControllerShooterControl(ShooterBase shooterBase, TalonXboxController controller) {
        super(shooterBase);

        this.controller = controller;
    }

    @Override
    public void execute() {
        super.percent = controller.buttons.RIGHT_TRIGGER.get() ? 1 : 0;

        super.execute();
    }
}
