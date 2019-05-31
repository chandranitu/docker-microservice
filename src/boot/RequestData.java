package boot;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

@Entity

@Table(name = "contact")

public class RequestData {

	@Id

	@GeneratedValue(strategy = GenerationType.TABLE)

	@Column(name = "contact_id")

	private String id;

	@Column(name = "name")

	private String images;

	@Column(name = "email")

	private String Contents;

	public String getImages() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getContents() {
		// TODO Auto-generated method stub
		return null;
	}

	// getter-setters

	}

