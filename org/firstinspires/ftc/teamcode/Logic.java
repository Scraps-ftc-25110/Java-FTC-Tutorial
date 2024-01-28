package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class Logic extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        int num = 9;
        if(num > 10){
            telemetry.addData("info", "num is bigger than 10");
        } else if(!(num < 10 && num == 7 || num == 9)) {
            telemetry.addData("info", "num is 10");
        } else {
            telemetry.addData("info", "num is smaller than 10");
        }

        switch (num){
            case 8:
                telemetry.addData("info", "num is 8");
            default:
                telemetry.addData("info", "default case executed");
        }
    }
}
