package com.purusottam.ecommerce.api.controller;

import com.purusottam.ecommerce.api.dto.UserRequestDto;
import com.purusottam.ecommerce.api.dto.UserResponseDto;
import com.purusottam.ecommerce.api.exception.BusinessException;
import com.purusottam.ecommerce.api.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/api/v1/")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/addUser")
    public ResponseEntity<UserResponseDto> addUser(@RequestBody UserRequestDto userRequestDto) {
        try {
            return new ResponseEntity<UserResponseDto>(
                    userService.addUser(userRequestDto), HttpStatus.CREATED);
        } catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
    }

    @PutMapping("/updateUser/{userId}")
    public ResponseEntity<UserResponseDto> updateUser(@PathVariable Long userId, @RequestBody UserRequestDto userRequestDto) {
        try {
            return new ResponseEntity<UserResponseDto>(
                    userService.updateUser(userId, userRequestDto), HttpStatus.CREATED);
        } catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
    }

    @GetMapping("/getUser/{userId}")
    public ResponseEntity<UserResponseDto> getUser(@PathVariable Long userId) {
        try {
            return new ResponseEntity<UserResponseDto>(userService.getUser(userId), HttpStatus.OK);
        } catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
    }

    @DeleteMapping("/deleteUser/{userId}")
    public ResponseEntity<UserResponseDto> deleteUser(@PathVariable Long userId) {
        try {
            return new ResponseEntity<UserResponseDto>(userService.delUser(userId), HttpStatus.OK);
        } catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
    }

    @GetMapping("/getUsers")
    public ResponseEntity<List<UserResponseDto>> getUsers() {
        try {
            return new ResponseEntity<List<UserResponseDto>>(userService.getUserList(), HttpStatus.OK);
        } catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
    }

}
