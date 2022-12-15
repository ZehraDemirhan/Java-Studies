import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student implements Comparable<Student> {
	 private int id;
	 private String name;
	 private String surname;
	 public Student(int id, String name, String surname) {
	 this.id = id;
	 this.name = name;
	 this.surname = surname;
	 }
	 public String toString() {
	 return "ID: " + id + "\nName=" + name + "\nSurname=" + surname + "\n";
	 }
	@Override
	public int hashCode() {
		 final int prime = 31;
		 int result = 1;
		 result = prime * result + id;
		 result = prime * result + ((name == null) ? 0 : name.hashCode());
		 result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		 return result;

	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}
	 
	public int compareTo(Student s) {
		return id - s.id;
		
	}
	public int getId() {
		return id;
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
	 
	 
	}
	
