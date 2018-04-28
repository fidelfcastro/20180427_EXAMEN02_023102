/**
 * Created by fidel on 4/27/2018.
 */
public class LargeRobot extends RobotFactory {
    public LargeRobot(TaskCommand taskCommand) {
        super(taskCommand);
        taskCommand.execute();
    }

    @Override
    public void robotType() {
        System.out.println("Large Robot");
    }
}
