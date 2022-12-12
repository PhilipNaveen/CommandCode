package frc.robot.wrist.commands.control;
//import WristBase for extending
import org.talon540.control.AttackJoystick.TalonJoystick;
import frc.robot.wrist.WristBase;

public class JoystickWristControl extends WristControl{
    private TalonJoystick leftJoystick; private TalonJoystick rightJoystick;

    public JoystickControllerWristControl(WristBase subsystem, TalonJoystick leftJoystick, TalonJoystick rightJoystick){
        //inherit all subsystem stuff from
        super(subsystem);
        this.leftJoystick = leftJoystick; this.rightJoystick = rightJoystick;
    }

    @Override
    public void execute(){
        this.percent = rightJoystick.buttons.RIGHT_TOP.get() ? -0.3 : leftJoystick.buttons.LEFT_TOP.get() ? 0.3 : 0;
        //call method from WristControl
        super.execute();
    }
}