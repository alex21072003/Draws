package com.example.DrawLoterya.service;

import com.example.DrawLoterya.dto.UserDto;
import com.example.DrawLoterya.model.User;
import com.example.DrawLoterya.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class CurrentUserCRUDService implements UserService<UserDto> {


    private final UserRepository userRepository;

    public CurrentUserCRUDService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void create(UserDto userDto) {
        User user = mapToEntity(userDto);
        userRepository.save(user);
    }





    @Override
    public void update(UserDto userDto) {


    }

    @Override
    public String get(String key) {
        return null;
    }

    public static UserDto mapToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setBirthdayUser(user.getBirthdayUser());
        userDto.setPhoto(user.getPhoto());
        userDto.setPhoneNumberUser(user.getPhoneNumberUser());
        userDto.setFullName(user.getFullName());
        userDto.setTelegram(user.getTelegram());
        userDto.setVk(user.getVk());
        userDto.setTicket(
                user.getTicket()
                        .stream()
                        .map(TicketCrudService::mapToDto)
                        .toList());
        return userDto;
    }

    public static User mapToEntity(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setBirthdayUser(userDto.getBirthdayUser());
        user.setPhoto(userDto.getPhoto());
        user.setPhoneNumberUser(userDto.getPhoneNumberUser());
        user.setFullName(userDto.getFullName());
        user.setTelegram(userDto.getTelegram());
        user.setVk(userDto.getVk());
        user.setTicket(
                userDto.getTicket()
                        .stream()
                        .map(TicketCrudService::mapToEntity)
                        .toList());
        return user;
    }

}
