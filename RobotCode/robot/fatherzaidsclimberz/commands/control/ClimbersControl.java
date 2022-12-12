package frc.robot.climberz.commands.control;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.climberz.ClimbersBase;

public class ClimbersControl extends CommandBase {
    private ClimbersBase climbersBase;
    protected double percent;

    public ClimbersControl(ClimbersBase subsystem) {
        this.climbersBase = subsystem;
        addRequirements(subsystem);
    }

    @Override
    public void execute() {
        climbersBase.setPercent(percent);
    }
}
