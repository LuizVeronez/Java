package br.com.luizveronez.todolist.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.br.com.luizveronez.todolist.task.ItaskRepository;

@RestController
@RequestMapping("/tasks")
public class taskController {

    @Autowired
    private ItaskRepository taskRepository;
    @RequestMapping("/")
    public TaskModel create(@RequestBody TaskModel taskModel){

        var task = this.taskRepository.save(taskModel);
        return task;
    }
}
