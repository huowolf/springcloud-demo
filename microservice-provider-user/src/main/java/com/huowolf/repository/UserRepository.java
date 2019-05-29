package com.huowolf.repository;

import com.huowolf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author huowolf
 * @date 2019/5/28
 * @description
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
