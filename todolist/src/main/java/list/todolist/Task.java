package list.todolist;

import lombok.Data;


@Data
public class Task {
    private String task;
    private String date;

    public Task() {
    }
}
