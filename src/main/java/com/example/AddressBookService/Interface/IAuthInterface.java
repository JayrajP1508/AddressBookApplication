package com.example.AddressBookService.Interface;



import com.example.AddressBookService.DTO.AuthUserDTO;
import com.example.AddressBookService.DTO.LoginDTO;
import com.example.AddressBookService.DTO.PassDTO;
import org.springframework.stereotype.Service;

@Service
public interface IAuthInterface {

    public String register (AuthUserDTO user) throws Exception;


    public String login(LoginDTO user);

    public AuthUserDTO forgotPassword(PassDTO pass, String email) throws Exception;

    public String resetPassword(String email, String currentPass, String newPass) throws Exception;
}
