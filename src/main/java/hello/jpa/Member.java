package hello.jpa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "Member")
@SequenceGenerator(name = "member_seq_generator", sequenceName = "member_seq")
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "member_seq_generator")
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
//	private Integer age;
//	
//	@Enumerated(EnumType.STRING)
//	private RoleType roleType;
//	
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date createdDate;
//	
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date lastModifiedDate;
//	
//	private LocalDate testLocalDate;
//	private LocalDateTime testLocalDateTime;
//	
//	@Lob
//	private String description;
//	
//	@Transient
//	private int temp;

	public Member() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

	
		
}
