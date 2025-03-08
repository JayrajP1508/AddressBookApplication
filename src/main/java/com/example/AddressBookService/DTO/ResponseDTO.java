package com.example.AddressBookService.DTO;

public class ResponseDTO {
    private String message;
    private String status;

    // Default constructor
    public ResponseDTO() {}

    // Constructor with parameters
    public ResponseDTO(String message, String status) {
        this.message = message;
        this.status = status;
    }

    // Getters
    public String getMessage() {
        return message;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
