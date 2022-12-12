package frc.robot.roller.commands.control;
//import AttackJoystick controls
import org.talon540.control.AttackJoystick.TalonJoystick;
import frc.robot.roller.RollerBase;

public class JoystickRollerControl extends RollerControl{
    private TalonJoystick leftJoystick; private TalonJoystick rightJoystick;

    public JoystickControllerRollerControl(RollerBase subsystem, TalonJoystick leftJoystick, TalonJoystick rightJoystick){
      //inherit all the rollerBase properties from RollerControl  
      super(subsystem);
        this.leftJoystick = leftJoystick; this.rightJoystick = rightJoystick;
    }

    @Override
    public void execute(){
        this.percent = leftJoystick.buttons.TOP_MIDDLE.get() ? 0.5 :rightJoystick.buttons.TOP_MIDDLE.get() ? -1 : 0;
        //call from super
        super.execute();
    }
}