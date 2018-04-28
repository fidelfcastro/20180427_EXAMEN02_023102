import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fidel on 4/27/2018.
 */
public class Invoker {
    RobotFactory smallBot;
    RobotFactory mediumBot;
    RobotFactory largeBot;
    int tasksCompleted = 0;
    List<TaskCommand> taskList = new ArrayList<>();

    public void setTask(TaskCommand task){
        taskList.add(task);
    }

    public void executeTask(){
        for(TaskCommand task : taskList){
            if(task.difficulty() == 1){
                //The robot executes task
                smallBot = new SmallRobot(task);
                smallBot.robotType();
                tasksCompleted++;
                log();
            }
            else if(task.difficulty() == 2){
                //The robot executes task
                mediumBot = new MediumRobot(task);
                mediumBot.robotType();
                tasksCompleted++;
                log();
            }
            else if(task.difficulty() == 3){
                //The robot executes task
                largeBot = new LargeRobot(task);
                largeBot.robotType();
                tasksCompleted++;
                log();
            }
        }
    }

    public void log(){
        System.out.println("Task number " + tasksCompleted + "\n");
    }
}