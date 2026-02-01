package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class constants {
  private final DcMotor frontLeftMotor, frontRightMotor, backLeftMotor, backRightMotor;
  public DriveTrain(LinearOpMode linearOpMode) {
        frontLeftMotor = linearOpMode.hardwareMap.dcMotor.get("frontLeftMotor");
        frontRightMotor = linearOpMode.hardwareMap.dcMotor.get("frontRightMotor");
        backLeftMotor = linearOpMode.hardwareMap.dcMotor.get("backLeftMotor");
        backRightMotor = linearOpMode.hardwareMap.dcMotor.get("backRightMotor");
  }

  public void configureMotorModes() {
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        frontLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        frontRightMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        backLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        backRightMotor.setDirection(DcMotorSimple.Direction.FORWARD);

        frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
  }
}
