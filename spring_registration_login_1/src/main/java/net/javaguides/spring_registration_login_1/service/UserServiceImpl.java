package net.javaguides.spring_registration_login_1.service;

import net.javaguides.spring_registration_login_1.model.Role;
import net.javaguides.spring_registration_login_1.model.User;
import net.javaguides.spring_registration_login_1.repository.UserRepository;
import net.javaguides.spring_registration_login_1.web.dto.UserRegistrationdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl  implements  UserService{

//    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }



    @Override
    public User save(UserRegistrationdto registrationdto) {
        User user= new User(registrationdto.getFirstName(),registrationdto.getLastName(),registrationdto.getEmail(),
                registrationdto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
       return  userRepository.save(user);
    }
}
