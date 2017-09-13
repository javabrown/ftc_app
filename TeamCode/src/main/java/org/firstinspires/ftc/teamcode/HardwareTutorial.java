package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class HardwareTutorial {
    public DcMotor leftMotor = null;
    //public DcMotor rightMotor = null;
    //public Servo servo = null;

    private DcMotor.RunMode initialMode = null;

    HardwareMap map = null;

    public HardwareTutorial(DcMotor.RunMode enteredMode){
        initialMode = enteredMode;
    }

    public void init(HardwareMap aMap){
        map = aMap;
        leftMotor = map.dcMotor.get("left_motor");
        //rightMotor = map.dcMotor.get("right_motor");
        //servo = map.servo.get("servo");

        //ENCODER
        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        //rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        //ALL
        leftMotor.setMode(initialMode);
        //rightMotor.setMode(initialMode);

        leftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        //rightMotor.setDirection(DcMotorSimple.Direction.FORWARD);

        //servo.setPosition(0);
        stopRobot();
    }

    public void stopRobot(){
        leftMotor.setPower(0);
        //rightMotor.setPower(0);
    }

}
