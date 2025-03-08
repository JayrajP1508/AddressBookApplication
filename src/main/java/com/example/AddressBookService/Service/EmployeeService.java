package com.example.AddressBookService.Service;

import com.example.AddressBookService.DTO.EmployeeDTO;
import com.example.AddressBookService.DTO.ResponseDTO;
import com.example.AddressBookService.Entity.EmployeeEntity;
import com.example.AddressBookService.Interface.IEmployeeService;
import com.example.AddressBookService.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public ResponseDTO response(String message, String status) {
        return new ResponseDTO(message, status);
    }

    @Override
    public EmployeeDTO get(Long id) {
        EmployeeEntity foundEmp = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cannot find employee with given id"));
        return new EmployeeDTO(foundEmp.getId(), foundEmp.getName(), foundEmp.getEmail());
    }

    @Override
    public EmployeeDTO create(EmployeeDTO user) {
        EmployeeEntity newUser = new EmployeeEntity(user.getName(), user.getEmail());
        employeeRepository.save(newUser);
        return new EmployeeDTO(newUser.getId(), newUser.getName(), newUser.getEmail());
    }

    @Override
    public List<EmployeeDTO> getAll() {
        return employeeRepository.findAll().stream()
                .map(entity -> new EmployeeDTO(entity.getId(), entity.getName(), entity.getEmail()))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO edit(EmployeeDTO user, Long id) {
        EmployeeEntity foundEmp = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cannot find employee with given id"));

        foundEmp.setName(user.getName());
        foundEmp.setEmail(user.getEmail());
        employeeRepository.save(foundEmp);

        return new EmployeeDTO(foundEmp.getId(), foundEmp.getName(), foundEmp.getEmail());
    }

    @Override
    public String delete(Long id) {
        EmployeeEntity foundUser = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cannot find user with given id"));

        employeeRepository.delete(foundUser);
        return "Employee deleted";
    }

    @Override
    public String clear() {
        employeeRepository.deleteAll();
        return "Database cleared";
    }
}
