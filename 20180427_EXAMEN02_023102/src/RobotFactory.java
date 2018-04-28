/**
 * Created by fidel on 4/27/2018.
 */
public abstract class RobotFactory {
    TaskCommand taskCommand;
    public RobotFactory(TaskCommand taskCommand){
        this.taskCommand=taskCommand;
    }
    public abstract void robotType();
}
