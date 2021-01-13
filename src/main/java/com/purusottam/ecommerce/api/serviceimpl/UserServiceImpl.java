package com.purusottam.ecommerce.api.serviceimpl;

import com.purusottam.ecommerce.api.dto.UserRequestDto;
import com.purusottam.ecommerce.api.dto.UserResponseDto;
import com.purusottam.ecommerce.api.exception.BusinessException;
import com.purusottam.ecommerce.api.exception.ErrorCode;
import com.purusottam.ecommerce.api.model.User;
import com.purusottam.ecommerce.api.repository.UserRepository;
import com.purusottam.ecommerce.api.service.UserService;
import com.purusottam.ecommerce.api.util.CopyUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    @Transactional
    public UserResponseDto addUser(UserRequestDto userRequestDto) {
        User user = new User();
        CopyUtils.copySafe(userRequestDto, user);
        UserResponseDto userResponseDto = new UserResponseDto();
        CopyUtils.copySafe(userRepository.save(user), userResponseDto);
        return userResponseDto;
    }

    @Override
    public UserResponseDto getUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new BusinessException(ErrorCode.USER_IS_NOT_EXIST));
        UserResponseDto userResponseDto = new UserResponseDto();
        CopyUtils.copySafe(user, userResponseDto);
        return userResponseDto;
    }

    @Override
    @Transactional
    public UserResponseDto updateUser(Long userId, UserRequestDto userRequestDto) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new BusinessException(ErrorCode.USER_IS_NOT_EXIST));
        CopyUtils.copySafe(userRequestDto, user);
        UserResponseDto userResponseDto = new UserResponseDto();
        CopyUtils.copySafe(userRepository.save(user), userResponseDto);
        return userResponseDto;
    }

    @Override
    public List<UserResponseDto> getUserList() {
        List<UserResponseDto> list = new ArrayList<>();
        list = CopyUtils.copySafe(userRepository.findAll(), UserResponseDto.class);
        return list;
    }

    @Override
    @Transactional
    public UserResponseDto delUser(Long userId) {
        User user = userRepository.findById(userId).orElseThrow(
                () -> new BusinessException(ErrorCode.USER_IS_NOT_EXIST));
        UserResponseDto userResponseDto = new UserResponseDto();
        userRepository.deleteById(userId);
        CopyUtils.copySafe(user, userResponseDto);
        return userResponseDto;
    }
}
