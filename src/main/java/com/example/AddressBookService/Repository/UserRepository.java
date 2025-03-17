package com.example.AddressBookService.Repository;



import com.example.AddressBookService.Entity.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<AuthUser, Long> {

    AuthUser findByEmail(String email);

}