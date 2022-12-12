package frc.robot.climberz;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.CANDeviceIDS;

public class ClimbersBase extends SubsystemBase {
    private WPI_TalonFX climbMotor = new WPI_TalonFX(CANDeviceIDS.CLIMBEXTENSION);

    public void setPercent(double percent) {
        climbMotor.set(ControlMode.PercentOutput, percent);
    }

    public void stopMotor() {
        climbMotor.stopMotor();
    }
}
