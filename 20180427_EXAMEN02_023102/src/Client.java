import java.util.ArrayList;
import java.util.List;

/**
 * Created by fidel on 4/27/2018.
 */
public class Client {
    public static void main(String [] args) {

        Invoker invoker = new Invoker();
        List<TaskCommand> taskList = new ArrayList<>();

        TaskA taskA = new TaskA();
        TaskB taskB = new TaskB();
        TaskC taskC = new TaskC();
        TaskD taskD = new TaskD();

        invoker.setTask(taskA);
        invoker.setTask(taskA);
        invoker.setTask(taskB);
        invoker.setTask(taskA);
        invoker.setTask(taskC);
        invoker.setTask(taskD);

        invoker.executeTask();

    }
}
