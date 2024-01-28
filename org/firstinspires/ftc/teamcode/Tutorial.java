package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import java.util.Arrays;

class Tutorial extends OpMode {
    @Override
    public void init() {

    }

    @Override
    public void loop() {
        telemetry.addData("caption", "jkdfjekfddfk");

        byte smallNumber = 44;
        short smallerNumber = -1079;
        int number = 1_000_000;
        long bigNumber = 100_000_000_000L;

        float decimal = -1.0007f;
        double decimalP = 1.324350045535;

        boolean yes = true;
        char character = 'D';

        String text = new  String("complete");

        final int constNumber = 88;
        final float pi = 3.14f;

        int[] list = new int[6];
        list[4] = 7656;
        list[0] = 56;
        list[1] = 7;
        list[2] = 6;
        list[3] = 756;
        list[5] = 8;

        telemetry.addData("list", Arrays.toString(list));










    }
}
