package DB_Connection;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Track
{
	@EmbeddedId
    TrackId trackId;
	
	@ManyToOne
    @JoinColumn(name = "IdAlbum", referencedColumnName = "idAlbum")
	Album IdAlbum;
	
	@ManyToOne
	@JoinColumn(nullable = false, name = "IdSinger")
	Singer IdSinger;
	@ManyToOne
	@JoinColumn(nullable = false, name = "IdGenre")
	Genre IdGenre;
	@Column(nullable = false, length = 40)
	String trackName;
	
	public Singer getIdSinger() {
		return IdSinger;
	}
	public void setIdSinger(Singer idSinger) {
		IdSinger = idSinger;
	}
	public Genre getIdGenre() {
		return IdGenre;
	}
	public void setIdGenre(Genre idGenre) {
		IdGenre = idGenre;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
}
