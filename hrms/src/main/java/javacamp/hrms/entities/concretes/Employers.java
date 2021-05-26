package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employers")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employers {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	int id;
	
	@Column(name = "company_name")
	String companyName;
	
	@Column(name = "web_address")
	String webAddress;
}
