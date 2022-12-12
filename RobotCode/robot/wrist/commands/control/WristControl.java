package frc.robot.wrist.commands.control;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.wrist.WristBase;

public class WristControl extends CommandBase {
    private WristBase wristBase;
    protected double percent;

    public WristControl(WristBase subsystem) {
        this.wristBase = subsystem;
        addRequirements(subsystem);
    }

    @Override
    public void execute() {
        wristBase.setPercent(percent);
    }
}
