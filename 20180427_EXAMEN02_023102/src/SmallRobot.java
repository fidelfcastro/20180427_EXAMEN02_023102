/**
 * Created by fidel on 4/27/2018.
 */
public class SmallRobot extends RobotFactory {
    public SmallRobot(TaskCommand taskCommand) {
        super(taskCommand);
        taskCommand.execute();
    }

    @Override
    public void robotType() {
        System.out.println("Small Robot");
    }
}
