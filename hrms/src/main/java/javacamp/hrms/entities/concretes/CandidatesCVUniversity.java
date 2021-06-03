package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidates_cv_universities")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidatesCVUniversity {
	
	@Id
	@Column(name = "id")
	int id;
	
	@Column(name = "universty_name")
	String universtyName;
	
	@Column(name = "universty_faculty")
	String universtyFaculty;
	
	@Column(name = "application_year")
	String applicationYear;
	
	@Column(name = "graduation_year")
	String graduationYear;
	
	@ManyToOne
	@JoinColumn(name = "candidates_cv_id")
	private CandidatesCV candidatesCV;
}
