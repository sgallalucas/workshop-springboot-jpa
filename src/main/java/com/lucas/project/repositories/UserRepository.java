package com.lucas.project.repositories;

import com.lucas.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // nesse caso o uso da annotation é opcional, pois a interface UserRepository herda da JpaRepository, que já é um componente registrado do spring
public interface UserRepository extends JpaRepository<User, Long> {
}
