package frc.robot.shooter.commands.control;
//i i i import the joystick stuf f f f and shooter base
import org.talon540.control.AttackJoystick.TalonJoystick;
import frc.robot.shooter.ShooterBase;

//inwhoritance right here from ShooterControl files
public class JoystickControllerShooterControl extends ShooterControl{
    private TalonJoystick rightJoystick;

    public JoystickControllerShooterControl(ShooterBase subsystem, TalonJoystick leftJoystick, TalonJoystick rightJoystick){
        //super the properties from the shooterbase subsystem
        super(subsystem);
        //idk if the left one really matters here since it's just a shooter but here it is anyways
        this.leftJoystick = leftJoystick; this.rightJoystick = rightJoystick;
    }
    //override the execute method as usual
    @Override
    public void execute(){
        super.percent = rightJoystick.buttons.TRIGGER.get() ? 1 : 0;
        super.execute();
    }
}