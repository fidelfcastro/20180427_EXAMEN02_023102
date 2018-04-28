/**
 * Created by fidel on 4/27/2018.
 */
public class TaskC implements TaskCommand {
    @Override
    public void execute() {
        System.out.println("TaskC: High Dificulty");
    }

    @Override
    public int difficulty() {
        return 3;
    }
}
