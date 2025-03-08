package com.example.AddressBookService.DTO;




import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseDTO {

    String message;
    String status;


    public ResponseDTO(String status, String message) {
        this.status = status;
        this.message = message;
    }
}
