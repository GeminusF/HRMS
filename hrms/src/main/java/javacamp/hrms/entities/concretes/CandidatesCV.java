package javacamp.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidates_cv")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidatesCV {
	
	@Id
	@Column(name = "id")
	int id;
	
	@Column(name = "github_address")
	String githubAddress;
	
	@Column(name = "linkedin_address")
	String linkedinAddress;
	
	@Column(name = "cover_letter")
	String coverLetter; 
	
	@OneToMany(mappedBy = "candidatesCV")
	private List<CandidatesCVForeignLanguage> cvForeignLanguage;
	
	@OneToMany(mappedBy = "candidatesCV")
	private List<CandidatesCVJobExperience> cvJobExperience;
	
	@OneToMany(mappedBy = "candidatesCV")
	private List<CandidatesCVTechTool> cvTechTool;
	
	@OneToMany(mappedBy = "candidatesCV")
	private List<CandidatesCVUniversity> cvUniversity;
	
}
