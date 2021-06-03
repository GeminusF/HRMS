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
@Table(name = "candidates_cv_tech_tools")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidatesCVTechTool {
	
	@Id
	@Column(name = "id")
	int id;
	
	@Column(name = "name")
	String name;
	
	@ManyToOne()
	@JoinColumn(name = "candidates_cv_id")
	private CandidatesCV candidatesCV;

}
