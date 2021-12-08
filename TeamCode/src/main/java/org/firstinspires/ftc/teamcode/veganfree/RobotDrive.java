package org.firstinspires.ftc.teamcode.veganfree;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class RobotDrive
{

    public void updateControllerDrive(OpMode opMode)
    {

    }

    /**
     * Moves the robot according to the joysticks on the controller.
     *
     * @param left joystick controls left wheel
     * @param right joystick controls right wheel
     * @param map is used to reference the motors
     */
    public void move(DeviceMap map, double left, double right)
    {
        map.getLeftBack().setPower(left);
        map.getRightBack().setPower(right);
    }

}
