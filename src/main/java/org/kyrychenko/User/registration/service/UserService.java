package org.kyrychenko.User.registration.service;

import org.kyrychenko.User.registration.model.User;
import org.kyrychenko.User.registration.web.dto.UserRegistrationDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDTO userRegistrationDTO);
}
