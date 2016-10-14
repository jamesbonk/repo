package DB_Connection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Track 
{
	@Id
	int IdTrack;
	@Id
	int IdAlbum;
	@ManyToOne
	@PrimaryKeyJoinColumn(name="IdAlbum", referencedColumnName="IdAlbum")
	Album IdAlbumFK;
	@ManyToOne
	@JoinColumn(name = "IdSinger")
	Singer IdSinger;
	@ManyToOne
	@JoinColumn(name = "IdGenre")
	Genre IdGenre;
	@Column(nullable = false, length = 40)
	String trackName;
	
	public int getIdTrack() {
		return IdTrack;
	}
	public void setIdTrack(int idTrack) {
		IdTrack = idTrack;
	}
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
	public Album getIdAlbumFK() {
		return IdAlbumFK;
	}
	public void setIdAlbumFK(Album idAlbum) {
		IdAlbumFK = idAlbum;
	}
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
}
