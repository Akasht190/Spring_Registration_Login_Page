package net.javaguides.spring_registration_login_1.service;

import net.javaguides.spring_registration_login_1.model.User;
import net.javaguides.spring_registration_login_1.web.dto.UserRegistrationdto;

public interface UserService {
    User save(UserRegistrationdto registrationdto);

}
