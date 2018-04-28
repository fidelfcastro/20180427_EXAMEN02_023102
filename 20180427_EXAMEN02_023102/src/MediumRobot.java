/**
 * Created by fidel on 4/27/2018.
 */
public class MediumRobot extends RobotFactory {
    public MediumRobot(TaskCommand taskCommand) {
        super(taskCommand);
        taskCommand.execute();
    }

    @Override
    public void robotType() {
        System.out.println("Medium Robot");
    }
}