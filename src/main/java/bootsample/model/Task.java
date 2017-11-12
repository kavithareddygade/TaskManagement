package bootsample.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity(name="t_tasks")
public class Task implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@NotNull(message = "FirstName is mandatory")
	private String firstName;
	@NotNull(message = "LastName is mandatory")
	private String lastName;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	private boolean finished;
	
	public Task(){}
	
	public Task(String firstName,String lastName, String description, Date dateCreated, boolean finished) {
		super();
		this.firstName = firstName;
		this.lastName=lastName;
		this.description = description;
		this.dateCreated = dateCreated;
		this.finished = finished;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", firstName=" + firstName + ",lastName=" + lastName + ", description=" + description + ", dateCreated=" + dateCreated
				+ ", finished=" + finished + "]";
	}	
	
}
