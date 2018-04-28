/**
 * Created by fidel on 4/27/2018.
 */
public class TaskA implements TaskCommand {

    @Override
    public void execute() {
        System.out.println("TaskA: Low difficulty");
    }

    @Override
    public int difficulty() {
        return 1;
    }
}
