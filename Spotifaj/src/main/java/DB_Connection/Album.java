package DB_Connection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Album 
{
	@Id
	@GeneratedValue
	int IdAlbum;
	@Column(nullable = false, length = 50)
	String albumName;
	@Column(nullable = false, length = 80)
	String urlOfSong;
	
	public int getIdAlbum() {
		return IdAlbum;
	}
	public void setIdAlbum(int id_Album) {
		IdAlbum = id_Album;
	}
	public String getAlbumName() {
		return albumName;
	}
	public void setAlbumName(String nameAlbum) {
		this.albumName = nameAlbum;
	}
	public String getUrlOfSong() {
		return urlOfSong;
	}
	public void setUrlOfSong(String urlOfSong) {
		this.urlOfSong = urlOfSong;
	}
	
}
