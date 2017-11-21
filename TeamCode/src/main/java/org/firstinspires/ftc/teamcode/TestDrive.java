package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
 
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "TestDrive")
public class TestDrive extends OpMode {

    final static double MOTOR_POWER = 0.15;
     DcMotor motorLeft;
    DcMotor motorRight;
    //Servo arm;

 
    public TestDrive(){

    }

    @Override
    public void init() {

        motorRight = hardwareMap.dcMotor.get(KeysI.RIGHT_MOTOR);
        motorLeft = hardwareMap.dcMotor.get(KeysI.LEFT_MOTOR);
 
        //arm = hardwareMap.servo.get("centerArm");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorRight.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override
    public void loop() {
 

        float leftY = gamepad1.left_stick_y;
         /*float leftY = gamepad1.left_stick_y;
         motorRight.setPower(leftY);
        //motorRight.setPower(rightY);
        //arm.setPosition(rightY);
         motorRight.setPower(leftY);*/

        DeviceUtils.startDriving(motorLeft, motorRight, gamepad1);
        //DeviceUtils.startArmMotor(DcMotor armMotor, Gamepad gamepad1);
    }


    public void goForward(){

    }



 
}