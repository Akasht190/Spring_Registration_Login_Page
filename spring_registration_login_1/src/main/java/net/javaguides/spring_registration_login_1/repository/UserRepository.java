package net.javaguides.spring_registration_login_1.repository;

import net.javaguides.spring_registration_login_1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Long> {


}
