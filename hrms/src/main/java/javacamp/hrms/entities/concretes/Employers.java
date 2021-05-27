package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employers")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employers extends Users {

	@Column(name = "company_name")
	String companyName;

	@Column(name = "web_address")
	String webAddress;
}
