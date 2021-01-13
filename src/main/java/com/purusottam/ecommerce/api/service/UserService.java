package com.purusottam.ecommerce.api.service;

import com.purusottam.ecommerce.api.dto.UserRequestDto;
import com.purusottam.ecommerce.api.dto.UserResponseDto;

import java.util.List;

public interface UserService {

    //FIXME add the service for sineUp and sineIn for user

    UserResponseDto addUser(UserRequestDto userRequestDto);

    UserResponseDto getUser(Long userId);

    UserResponseDto updateUser(Long userId, UserRequestDto userRequestDto);

    // FIXME add pagination to the List Users service
    List<UserResponseDto> getUserList();

    UserResponseDto delUser(Long userId);

}
