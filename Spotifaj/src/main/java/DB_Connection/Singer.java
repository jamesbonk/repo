package DB_Connection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Singer 
{
	@Id
	@GeneratedValue
	int IdSinger;
	@Column(nullable = false, length = 40)
	String singerName;
	
	public int getIdSinger() {
		return IdSinger;
	}
	public void setIdSinger(int id_Singer) {
		IdSinger = id_Singer;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
}
