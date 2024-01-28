package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class Loops extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {

        for(int i = 0; i < 10; i++){
            if(i == 3){
                continue;
            }

            i++;

        }
    }
}
