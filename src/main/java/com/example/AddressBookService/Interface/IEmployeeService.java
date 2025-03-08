package com.example.AddressBookService.Interface;

import java.util.List;
import com.example.AddressBookService.DTO.EmployeeDTO;
import com.example.AddressBookService.DTO.ResponseDTO;
import com.example.AddressBookService.Entity.EmployeeEntity;
import org.springframework.stereotype.Service;

@Service
public interface IEmployeeService {

    public EmployeeDTO get(Long id);
    public EmployeeDTO create(EmployeeDTO user);
    public String clear();
    public List<EmployeeDTO> getAll();
    public EmployeeDTO edit(EmployeeDTO user, Long id);
    public String delete(Long id);
    public ResponseDTO response(String message, String status);
}
