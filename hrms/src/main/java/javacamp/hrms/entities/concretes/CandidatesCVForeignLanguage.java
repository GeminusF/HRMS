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
@Table(name = "candidates_cv_foreign_languages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidatesCVForeignLanguage {
	
	@Id
	@Column(name = "id" )
	int id;
	
	@Column(name = "name")
	String name ; 
	
	@Column(name = "level")
	String level;
	
	@ManyToOne()
	@JoinColumn(name = "candidates_cv_id")
	private CandidatesCV candidatesCV;
}
