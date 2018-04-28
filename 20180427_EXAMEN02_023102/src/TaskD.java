/**
 * Created by fidel on 4/27/2018.
 */
public class TaskD implements TaskCommand {
    @Override
    public void execute() {
        System.out.println("TaskD: High Dificulty");
    }

    @Override
    public int difficulty() {
        return 3;
    }
}
