package com.todc.openwack.repository;


import com.todc.openwack.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author Tim O'Donnell (tim@timodonnell.com)
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
