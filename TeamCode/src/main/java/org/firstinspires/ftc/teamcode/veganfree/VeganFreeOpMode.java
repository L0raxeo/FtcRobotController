package org.firstinspires.ftc.teamcode.veganfree;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

/**
 * The OpMode class is the main base of operations.
 * FYI: Op is short for operation.
 *
 * The Operation Mode class holds all of the main
 * methods that are used to actually run the robot.
 * It's the origin (original place of where all of
 * the code you have written throughout the project
 * is invoked (called).
 *
 * {@link OpMode} is an abstract class that is inherited
 * by this class. This means that OpMode is an abstract
 * class. In simpler terms, extending to {@link OpMode}
 * is defining this class as a version of {@link OpMode}.
 *
 * Those @Override lines before each method (init, loop...)
 * are called tags, and are a result of this class extending
 * to {@link OpMode}. Those methods with the @Override tags
 * are automatically called by the {@link OpMode} abstract
 * class, and therefore you don't have to worry about them.
 */
@TeleOp(name = "Vegan Free Operation Mode", group = "TeleOp")
public class VeganFreeOpMode extends OpMode
{

    public DeviceMap map;

    /**
     * The Initialization method of the Operation Mode
     * class is used to initialize all other objects
     * and/or processes within your code.
     *
     * This method is automatically handled by the {@link OpMode}
     * class.
     */
    @Override
    public void init()
    {
        map = new DeviceMap();
        map.init(hardwareMap);
    }

    /**
     * This method is continuously invoked, which allows
     * for real-time changes to happen to the robot.
     *
     * This method is used to gather real-time information
     * about the input being received by the controller.
     * In other words: it is usually used to get input
     * LIVE.
     *
     * This method is automatically handled by the {@link OpMode}
     * class.
     */
    @Override
    public void loop()
    {

    }

    /**
     * The start method is invoked after the initialization (init())
     * method, and can be used to do whatever you would like when the
     * robot is first fully booted up.
     *
     * This method is automatically handled by the {@link OpMode}
     * class.
     */
    @Override
    public void start()
    {

    }

    /**
     * The stop method is invoked right before the robot program in the
     * robot is terminated (stopped, turned off, exited...), and can
     * be used for whatever you would like.
     *
     * This method is automatically handled by the {@link OpMode}
     * class.
     */
    @Override
    public void stop()
    {

    }

}