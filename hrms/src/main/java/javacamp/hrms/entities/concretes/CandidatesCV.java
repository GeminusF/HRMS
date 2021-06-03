package javacamp.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

	@JsonIgnore()
	@OneToMany(mappedBy = "candidatesCV", cascade = CascadeType.ALL)
	private List<CandidatesCVForeignLanguage> cvForeignLanguage;

	@JsonIgnore()
	@OneToMany(mappedBy = "candidatesCV", cascade = CascadeType.ALL)
	private List<CandidatesCVJobExperience> cvJobExperience;

	@JsonIgnore()
	@OneToMany(mappedBy = "candidatesCV", cascade = CascadeType.ALL)
	private List<CandidatesCVTechTool> cvTechTool;

	@JsonIgnore()
	@OneToMany(mappedBy = "candidatesCV", cascade = CascadeType.ALL)
	private List<CandidatesCVUniversity> cvUniversity;

}
