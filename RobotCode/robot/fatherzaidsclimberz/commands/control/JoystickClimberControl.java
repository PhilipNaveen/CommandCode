package frc.robot.climberz.commands.control;
//import import import from the frc overlordes
import org.talon540.control.AttackJoystick.TalonJoystick;
import frc.robot.climberz.ClimbersBase;

//extends the class, but yk what can't extend properly??? ask Zaid!!!1!1!!111!
public class JoystickClimbersControl extends ClimbersControl{
    private TalonJoystick rightJoystick;
    private TalonJoystick leftJoystick;

    public JoystickControllerClimbersControl(ClimbersBase subsystem, TalonJoystick leftJoystick, TalonJoystick rightJoystick){
        //suuuuuuuuuupeeeerrrrrrrrrr!0!!11!1!11!1!!1!!
        super(subsystem);
        //construct el constructorino
        this.rightJoystick = rightJoystick; this.leftJoystick = leftJoystick;
    }
  
    //Override inheritance 
    @Override
    public void execute(){
        this.percent = rightJoystick.buttons.RIGHT_BOTTOM.get() ? 1 : leftJoystick.buttons.LEFT_BOTTOM.get() ? -1 : 0;
        //reuse method from ClimbersControl
        super.execute();
    }
}