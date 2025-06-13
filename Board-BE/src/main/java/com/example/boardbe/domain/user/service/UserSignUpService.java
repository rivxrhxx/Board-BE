package com.example.boardbe.domain.user.service;

import com.example.boardbe.domain.user.domain.Repository.User;
import com.example.boardbe.domain.user.domain.Repository.UserRepository;
import com.example.boardbe.domain.user.presentation.dto.request.SignUpRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserSignUpService {
    private final UserRepository userRepository;

    @Transactional
    public void execute(SignUpRequest request){

        User user = User.builder()
                .accountId(request.getAccountId())
                .name(request.getName())
                .password(request.getPassword())
                .phoneNumber(request.getPhoneNumber())
                .build();

        userRepository.save(user);
    }
}