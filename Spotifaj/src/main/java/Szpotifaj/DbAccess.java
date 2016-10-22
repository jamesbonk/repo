package Szpotifaj;

import java.util.Iterator;
import java.util.List;
import javax.persistence.Query;
import DB_Connection.Test;
import DB_Connection.Track;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class DbAccess extends Thread
{
	String in_genre;
	
	DbAccess(String type)
	{
		in_genre = type;
	}
	
	DbAccess()
	{
		
	}
	
	List<Object> selectMusicByGenre()
	{
		String sqlStatement = "select t.trackName, s.singerName, a.albumName, a.urlOfSong from Track t, Singer s, Album a, Genre g where t.IdSinger = s.IdSinger and t.IdAlbum = a.IdAlbum and t.IdGenre = g.IdGenre and g.genreName = " + "\'" + in_genre + "\'";
		
		Test.entityManager.getTransaction().begin();
		
		Query query = Test.entityManager.createQuery(sqlStatement);
		
		List<Object> result = query.getResultList();
		
		Test.entityManager.getTransaction().commit();
		Test.entityManager.close();
		Test.entityManagerFactory.close();
		
		return result;
	}
	
	List<Object> selectAllMusic()
	{
		String sqlStatement = "select t.trackName, s.singerName, a.albumName from Track t, Singer s, Album a, where t.IdSinger = s.IdSinger and t.IdAlbum = a.IdAlbum ";
		
		Test.entityManager.getTransaction().begin();
		
		Query query = Test.entityManager.createQuery(sqlStatement);
		
		List<Object> result = query.getResultList();
		
		Test.entityManager.getTransaction().commit();
		Test.entityManager.close();
		Test.entityManagerFactory.close();
		
		return result;
	}
	
	void selectGenre(String genreName)
	{}

	@Override
	public void run() {
		ListsMusic.itemsByGenre = selectMusicByGenre();
		ListsMusic.flaga = true;
	};
}
