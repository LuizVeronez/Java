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
    @Column(length = 50)
    public String title;
    public LocalDateTime startAt;
    public LocalDateTime endAt;
    public String priority;
    public UUID idUser;
    
    
}
