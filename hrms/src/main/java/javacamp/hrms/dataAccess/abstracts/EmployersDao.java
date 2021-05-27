package javacamp.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javacamp.hrms.entities.concretes.Employers;

@Repository
public interface EmployersDao extends JpaRepository<Employers, Integer>{

}
