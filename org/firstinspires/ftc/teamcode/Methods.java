package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class Methods extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        helloFun("mark");
    }

    public String helloFun(String name){
        return "hello " + name;
    }
}
