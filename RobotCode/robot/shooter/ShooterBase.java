package frc.robot.shooter;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.constants.CANDeviceIDS;
import frc.robot.constants.Measurements;

import org.talon540.math.conversions;

public class ShooterBase extends SubsystemBase {
    private WPI_TalonFX shooterMotor = new WPI_TalonFX(CANDeviceIDS.SHOOTER_FLY);

    public void setPercent(double percent) {
        shooterMotor.set(ControlMode.PercentOutput, percent);
    }

    public void setSpeed(double speedMetersPerSecond) {
        shooterMotor.set(
                ControlMode.Velocity,
                conversions.LinearVelocityToFalcon500Velocity(
                        speedMetersPerSecond,
                        Measurements.Robot.flywheelRadiusMeters,
                        Measurements.Robot.GearRatios.shooter
                )
        );
    }

    public void stopFlywheel() {
        shooterMotor.stopMotor();
    }
}
