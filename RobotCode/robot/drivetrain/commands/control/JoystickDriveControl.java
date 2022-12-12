package frc.robot.drivetrain.commands.control;
//import and pray
import frc.robot.drivetrain.DrivetrainBase;
import org.talon540.control.AttackJoystick.TalonJoystick;

//AAAAAAAAA IM INHERITINGGGGGGGGGG
public class JoystickDriveControl extends DriveControl{
    private TalonJoystick leftJoystick; private TalonJoystick rightJoystick;
    
    public JoystickControllerDriveControl(DrivetrainBase subsystem, TalonJoystick leftJoystick, TalonJoystick rightJoystick){
        super(subsystem);
        this.leftJoystick = leftJoystick; this.rightJoystick = rightJoystick;
    }

    //Override the inherited method
    @Override
    public void execute(){
        //create el deadbanderinos
        this.leftPercent = this.leftJoystick.getDeadbandY();
        this.rightPercent = this.rightJoystick.getDeadbandY();
        super.execute();
    }
}