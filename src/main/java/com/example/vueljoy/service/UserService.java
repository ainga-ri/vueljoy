package com.example.vueljoy.service;

import com.example.vueljoy.controller.dto.PlayerDTO;
import com.example.vueljoy.controller.dto.UserDTO;
import com.example.vueljoy.model.User;
import com.example.vueljoy.model.send.Register;
import com.example.vueljoy.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public String registerUser(UserDTO userDTO) {
        User user =  new User(userDTO.getName(), userDTO.getSeat());
        userRepository.save(user);
        return (String.format("""
                Hello %s seating in %s
                """, user.getName(), user.getSeat()));
    }

    public String welcomeUser(UserDTO userDTO) {
        return (String.format("""
                Hi bro, you are %s and you are seated in %s, but is a secret
                """, userDTO.getName(), userDTO.getSeat()));
    }

    public String submitAnswer(PlayerDTO playerDTO) {

    }
}
