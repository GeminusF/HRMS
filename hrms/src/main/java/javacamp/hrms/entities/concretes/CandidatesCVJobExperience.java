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
@Table(name = "candidates_cv_job_experiences")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidatesCVJobExperience {
	
	@Id
	@Column(name = "id")
	int id;
	
	@Column(name = "job_location_name")
	String jobLocationName;
	
	@Column(name = "job_position")
	String jobPosition;
	
	@Column(name = "year_of_employment")
	String yearOfEmployment;
	
	@Column(name = "year_off")
	String yearOff;
	
	@ManyToOne()
	@JoinColumn(name = "candidates_cv_id")
	private CandidatesCV candidatesCV;
}
