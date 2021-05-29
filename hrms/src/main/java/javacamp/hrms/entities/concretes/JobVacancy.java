package javacamp.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_vacancy")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class JobVacancy {

	@Id
	@Column(name = "id")
	int id;

	@Column(name = "job_position")
	String jobPosition;

	@Column(name = "job_description")
	String jobDescription;

	@Column(name = "city_info")
	String cityInfo;

	@Column(name = "salary_min")
	int salaryMin;

	@Column(name = "salary_max")
	int salaryMax;

	@Column(name = "open_position_number")
	int openPositionNumber;

	@Column(name = "release_date")
	Date releaseDate;

	@Column(name = "application_deadline")
	Date applicationDeadline;

	@Column(name = "is_active")
	boolean isActive;

	@Column(name = "company_name")
	String companyName;

}
