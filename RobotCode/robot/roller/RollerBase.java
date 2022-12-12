package frc.robot.roller;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.CANDeviceIDS;

public class RollerBase extends SubsystemBase {
    private WPI_TalonSRX rollerMotor = new WPI_TalonSRX(CANDeviceIDS.INTAKE_ROLLERS);

    public void setPercent(double percent) {
        rollerMotor.set(ControlMode.PercentOutput, percent);
    }

    public void stopMotor() {
        rollerMotor.stopMotor();
    }
}
