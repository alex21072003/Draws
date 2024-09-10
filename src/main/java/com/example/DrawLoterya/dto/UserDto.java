package com.example.DrawLoterya.dto;

import com.example.DrawLoterya.model.Ticket;
import org.springframework.cglib.core.Block;

import java.util.Arrays;
import java.util.List;

public class UserDto {
    private Integer id;
    private String email;
    private byte[] photo;
    private String password;
    private String fullName;
    private String birthdayUser;
    private String phoneNumberUser;
    private String Telegram;
    private String vk;
    private List<TicketDto> ticket;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthdayUser() {
        return birthdayUser;
    }

    public void setBirthdayUser(String birthdayUser) {
        this.birthdayUser = birthdayUser;
    }

    public String getPhoneNumberUser() {
        return phoneNumberUser;
    }

    public void setPhoneNumberUser(String phoneNumberUser) {
        this.phoneNumberUser = phoneNumberUser;
    }

    public String getTelegram() {
        return Telegram;
    }

    public void setTelegram(String telegram) {
        Telegram = telegram;
    }

    public String getVk() {
        return vk;
    }

    public void setVk(String vk) {
        this.vk = vk;
    }

    public List<TicketDto> getTicket() {
        return ticket;
    }

    public void setTicket(List<TicketDto> ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", photo=" + Arrays.toString(photo) +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthdayUser='" + birthdayUser + '\'' +
                ", phoneNumberUser='" + phoneNumberUser + '\'' +
                ", Telegram='" + Telegram + '\'' +
                ", vk='" + vk + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}