package DB_Connection;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TrackId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int idAlbum;
	int IdTrack;
	    
	public int getIdAlbum() {
		return idAlbum;
	}
	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}
	public int getIdTrack() {
		return IdTrack;
	}
	public void setIdTrack(int idTrack) {
		this.IdTrack = idTrack;
	}
	
}
