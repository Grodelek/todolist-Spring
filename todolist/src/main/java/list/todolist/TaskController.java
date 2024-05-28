package list.todolist;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
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
