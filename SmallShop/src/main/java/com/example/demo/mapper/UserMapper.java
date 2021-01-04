package com.example.demo.mapper;

import com.example.demo.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import javax.xml.transform.Source;

@Mapper(componentModel = "spring")
public interface UserMapper {
   //@Mapping(source = "user.role",target = "use.role='user'")
    public UserDTO mapToDTO(User user);

    public User mapToEntity(UserDTO userDTO);
}
