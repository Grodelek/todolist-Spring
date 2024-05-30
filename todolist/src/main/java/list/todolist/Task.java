package list.todolist;

import lombok.Data;


@Data
public class Task {
    private String name;
    private String description;
//    private String date;

    public Task() {
    }
}

