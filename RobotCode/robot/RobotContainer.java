//alright, I really shoulda named the Joystick controls in the same way as the xbox controller's but it iiiiiz wat it iiiiiiz all iz well

package frc.robot;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.constants.Measurements;

//climber base and control
import frc.robot.climberz.ClimbersBase;
import frc.robot.climberz.commands.control.XboxControllerClimbersControl;
import frc.robot.climberz.commands.control.JoystickClimbersControl;
//drive base and control
import frc.robot.drivetrain.DrivetrainBase; 
import frc.robot.drivetrain.commands.control.XboxControllerDriveControl;
import frc.robot.drivetrain.commands.control.JoystickDriveControl;
//roller base and control
import frc.robot.roller.RollerBase;
import frc.robot.roller.commands.control.XboxControllerRollerControl;
import frc.robot.roller.commands.control.JoystickRollerControl;
//shooter base and control
import frc.robot.shooter.ShooterBase;
import frc.robot.shooter.commands.control.XboxControllerShooterControl;
import frc.robot.shooter.commands.control.JoystickShooterControl;
//wrist base and control
import frc.robot.wrist.WristBase;
import frc.robot.wrist.commands.control.XboxControllerWristControl;
import frc.robot.wrist.commands.control.JoystickWristControl;

//importing necessary stuff for the attack joystick + other things eg: limelight and xbox control
import org.talon540.control.AttackJoystick.TalonJoystick;
import org.talon540.control.XboxController.TalonXboxController;
import org.talon540.sensors.vision.VisionCameraMountConfig;
import org.talon540.sensors.vision.Limelight.LimelightVision;

public class RobotContainer{
    //Joystick control objects
    public TalonJoystick leftJoystick = new TalonJoystick(0);
    public TalonJoystick rightJoystick = new TalonJoystick(1);
    private TalonXboxController controller = new TalonXboxController(2);

    //limelight sensing vision stuff
    private LimelightVision limelight = new LimelightVision(new VisionCameraMountConfig(Measurements.Robot.LimelightHeightMeters, Measurements.Robot.LimelightAngleDegrees));
    //every other system like climberz, drivetrain, shooting, etc.
    private ClimbersBase climbersBase = new ClimbersBase();
    private DrivetrainBase drivetrainBase = new DrivetrainBase();
    private RollerBase rollerBase = new RollerBase();
    private ShooterBase shooterBase = new ShooterBase();
    private WristBase wristBase = new WristBase();
    
    public RobotContainer(){
        configureButtonBindings();
        DriverStation.silenceJoystickConnectionWarning(true);
    }
    
    private void configureButtonBindings(){
        // Add button to command mappings here.
        // See https://docs.wpilib.org/en/stable/docs/software/commandbased/binding-commands-to-triggers.html
        climbersBase.setDefaultCommand(new JoystickClimbersControl(climbersBase, leftJoystick, rightJoystick));
        drivetrainBase.setDefaultCommand(new JoystickDriveControl(drivetrainBase, leftJoystick, rightJoystick));
        rollerBase.setDefaultCommand(new JoystickRollerControl(rollerBase, leftJoystick, rightJoystick));
        shooterBase.setDefaultCommand(new JoystickShooterControl(shooterBase, leftJoystick, rightJoystick));
        wristBase.setDefaultCommand(new JoystickWristControl(wristBase, leftJoystick, rightJoystick));
    }
    
    public Command getAutonomousCommand()
    {
        return null;
    }
}