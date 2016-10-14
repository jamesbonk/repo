package DB_Connection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Genre 
{
	@Id
	@GeneratedValue
	int IdGenre;
	@Column(nullable = false, length = 35)
	String genreName;
	
	public int getIdGenre() {
		return IdGenre;
	}
	public void setIdGenre(int id_Genre) {
		IdGenre = id_Genre;
	}
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String nameGenre) {
		this.genreName = nameGenre;
	}
}
