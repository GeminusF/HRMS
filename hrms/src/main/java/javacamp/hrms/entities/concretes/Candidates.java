package javacamp.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "candidates")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Candidates {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	int id;
	
	@Column(name = "first_name")
	String firstName;
	
	@Column(name = "last_name")
	String lastName;
	
	@Column(name = "identification_number")
	String identificationNumber;
	
	@Column(name = "birth_date")
	Date birthDate;
	
}
