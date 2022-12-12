package frc.robot.wrist;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.CANDeviceIDS;

public class WristBase extends SubsystemBase {
    private WPI_TalonFX wristMotor = new WPI_TalonFX(CANDeviceIDS.INTAKE_WRIST);

    public void setPercent(double percent) {
        wristMotor.set(ControlMode.PercentOutput, percent);
    }

    public void stopMotor() {
        wristMotor.stopMotor();
    }
}
