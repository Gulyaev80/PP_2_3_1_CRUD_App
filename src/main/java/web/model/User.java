package web.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	@NotEmpty(message = "Name should not be empty")
	@Size(min = 3, max = 30, message = "Name should be between 2 and 30 chars")
	private String name;

	@Column(name = "surname")
	@NotEmpty(message = "Name should not be empty")
	@Size(min = 3, max = 30, message = "Name should be between 2 and 30 chars")
	private String surname;

	@Column(name = "email")
	@Email(message = "Email should be valid")
	@NotEmpty(message = "Name should not be empty")
	private String email;

	@Column(name = "age")
	@Min(value = 0, message = "Age should be greater than 0")
	private int age;

	public User() {
	}

	public User(int id, String name, String surname, String email, int age) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.age = age;
	}

	public int getId() {
		return (int) id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		User user = (User) o;
		return id == user.id && age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, surname, email, age);
	}
}
