package br.com.luizveronez.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository  extends JpaRepository<userModel, UUID>{

    Object findbyUsername(String username);
    
}
