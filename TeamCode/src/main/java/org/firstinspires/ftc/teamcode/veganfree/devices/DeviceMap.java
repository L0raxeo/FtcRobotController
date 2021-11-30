package org.firstinspires.ftc.teamcode.veganfree.devices;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class DeviceMap
{

    // All drive motors
    private DcMotor[] driveMotors;

    // Driving motors
    // Name (left, right) POV of non-drive wheels
    private DcMotor leftDrive;
    private DcMotor rightDrive;

    public DeviceMap() {}

    public void init(HardwareMap map)
    {
        setupDriveMotors(map);
    }

    private void setupDriveMotors(HardwareMap map)
    {
        // Instantiate
        leftDrive = map.get(DcMotor.class, "leftDrive");
        rightDrive = map.get(DcMotor.class, "rightDrive");

        // set direction

        this.driveMotors = new DcMotor[] {leftDrive, rightDrive};

        for (DcMotor m : this.driveMotors)
        {
            m.setDirection(DcMotorSimple.Direction.FORWARD);
            m.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            m.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            m.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
            m.setPower(0);
        }
    }

    // Getters

    public DcMotor getLeftDrive()
    {
        return leftDrive;
    }

    public DcMotor getRightDrive()
    {
        return rightDrive;
    }

    public DcMotor[] getAllDcDriveMotors()
    {
        return driveMotors;
    }

}
