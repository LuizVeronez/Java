package br.com.luizveronez.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
@Entity(name = "tb_task")

public class taskModel {

    @id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String  description;
    
    @Column(length = 50)
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;
    private UUID idUser;
    
    
}
