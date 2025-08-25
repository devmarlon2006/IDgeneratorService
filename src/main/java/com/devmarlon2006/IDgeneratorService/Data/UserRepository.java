package com.devmarlon2006.IDgeneratorService.Data;

import com.devmarlon2006.IDgeneratorService.Services.model.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
