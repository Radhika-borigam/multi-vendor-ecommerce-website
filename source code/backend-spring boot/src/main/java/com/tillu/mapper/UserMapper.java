package com.tillu.mapper;

import com.tillu.dto.OrderDto;
import com.tillu.dto.OrderItemDto;
import com.tillu.dto.UserDto;
import com.tillu.model.Order;
import com.tillu.model.OrderItem;
import com.tillu.model.User;

public class UserMapper {

    public static UserDto toUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFullName(user.getFullName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

}
