package frc.robot.drivetrain;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.CANDeviceIDS;
import org.talon540.drive.differential.TalonFX_DifferentialMotorGroup;

public class DrivetrainBase extends SubsystemBase {
    private TalonFX_DifferentialMotorGroup leftSide;
    private TalonFX_DifferentialMotorGroup rightSide;

    public DifferentialDrive differentialDrive;

    public DrivetrainBase() {
        WPI_TalonFX rightLeader = new WPI_TalonFX(CANDeviceIDS.DRIVETRAIN_FRONTRIGHT);
        WPI_TalonFX rightFollower = new WPI_TalonFX(CANDeviceIDS.DRIVETRAIN_BACKRIGHT);
        WPI_TalonFX leftLeader = new WPI_TalonFX(CANDeviceIDS.DRIVETRAIN_FRONTLEFT);
        WPI_TalonFX leftFollower = new WPI_TalonFX(CANDeviceIDS.DRIVETRAIN_BACKLEFT);

        this.leftSide = new TalonFX_DifferentialMotorGroup(leftLeader, leftFollower);
        this.rightSide = new TalonFX_DifferentialMotorGroup(rightLeader, rightFollower);

        this.differentialDrive = new DifferentialDrive(leftSide, rightSide);
        this.differentialDrive.setSafetyEnabled(false);

        this.leftSide.setInverted(true);
    }

    public void rawTankDrive(double leftPercent, double rightPercent) {
        this.leftSide.set(leftPercent);
        this.rightSide.set(rightPercent);
    }

    public void stopDrive() {
        this.leftSide.stopMotor();
        this.rightSide.stopMotor();
    }
}
