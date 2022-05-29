package com.pesuio.smssenderdemo.Repository;

import com.pesuio.smssenderdemo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
