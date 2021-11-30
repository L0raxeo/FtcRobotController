package org.firstinspires.ftc.teamcode.veganfree;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.veganfree.devices.DeviceMap;

@TeleOp(name = "Vegan Free Operation mode", group = "TeleOp")
public class VeganFreeOpMode extends OpMode
{

    public DeviceMap map;

    @Override
    public void init()
    {
        map = new DeviceMap();
        map.init(hardwareMap);
    }

    @Override
    public void loop()
    {

    }

}
