package list.todolist;

import lombok.Data;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Data
public class TaskController {
    List<Task> taskList = new ArrayList<>();

    @GetMapping("/task")
    public String getTasks(Model model){
        model.addAttribute("task", taskList);
        return "task";
    }

    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("task", new Task());
        return "add";
    }

    @PostMapping("/add")
    public String addTask(@ModelAttribute Task task){
        taskList.add(task);
        return "redirect:/task";
    }

}
