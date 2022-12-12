package frc.robot.roller.commands.control;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.roller.RollerBase;;

public class RollerControl extends CommandBase {
    private RollerBase rollerBase;
    protected double percent;

    public RollerControl(RollerBase rollerBase) {
        this.rollerBase = rollerBase;
        addRequirements(rollerBase);
    }

    @Override
    public void execute() {
        rollerBase.setPercent(percent);
    }
}
