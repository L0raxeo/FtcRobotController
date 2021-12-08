package org.firstinspires.ftc.teamcode.veganfree;

public class RobotDrive
{

    /**
     * Method dedicated to moving the robot according to the controller input.
     *
     * @param opMode inherits the controller objects, used to receive input.
     * @param map of all the devices required by the move method.
     */
    public void updateControllerDrive(VeganFreeOpMode opMode, DeviceMap map)
    {
        double right = opMode.gamepad1.right_stick_y;
        double left = opMode.gamepad1.left_stick_y;

        move(map, left, right);
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
