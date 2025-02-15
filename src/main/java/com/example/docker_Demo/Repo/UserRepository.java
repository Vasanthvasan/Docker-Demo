package com.example.docker_Demo.Repo;

import com.example.docker_Demo.Model.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<users,Integer> {
}
