package com.example.boardbe.domain.user.presentation.dto;

import com.example.boardbe.domain.user.domain.Repository.UserRepository;
import com.example.boardbe.domain.user.presentation.dto.request.SignUpRequest;
import com.example.boardbe.domain.user.service.UserSignUpService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/user")
@RestController
public class UserController {
    private final UserSignUpService userSignUpService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/signup")
    public String processSignup(User user) {
        UserRepository.save(user);
        return "redirect:/login";
    }
}
