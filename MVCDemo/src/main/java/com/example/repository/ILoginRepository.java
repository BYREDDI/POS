
package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Login;

@Repository
public interface ILoginRepository extends JpaRepository<Login, Integer> {
	
	Login findByEmail(String email);

}
