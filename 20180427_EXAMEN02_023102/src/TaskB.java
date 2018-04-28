/**
 * Created by fidel on 4/27/2018.
 */
public class TaskB implements TaskCommand {
    @Override
    public void execute() {
        System.out.println("TaskB: Medium difficulty");
    }

    @Override
    public int difficulty() {
        return 2;
    }
}
