package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name = "TeleOpTutorial", group = "Tutorial")
public class TeleOpTutorial extends OpMode {
    HardwareTutorial robot = new HardwareTutorial(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void init(){
        robot.init(hardwareMap);
        telemetry.addData("Initialization", "Complete");
    }

    @Override
    public void init_loop(){

    }

    @Override
    public void start(){

    }

    @Override
    public void loop(){
        robot.leftMotor.setPower(gamepad1.left_stick_y);
        //robot.rightMotor.setPower(gamepad1.right_stick_y);
        //robot.servo.setPosition(gamepad1.left_trigger);
    }
}
