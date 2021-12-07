package org.firstinspires.ftc.teamcode.veganfree;

public class RobotDrive
{

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
