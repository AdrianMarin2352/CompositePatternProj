import java.util.ArrayList;

public class Playlist implements IComponent  {

	public String playlistName; 
	
	public ArrayList<Song> playlist = new ArrayList();  
	
	public Playlist(String playlistName) { 
		
		this.playlistName = playlistName; 
		
	}  
	
	public void play() {
		
		for(Song song : playlist) {
			song.play();
			} 
		} 
	
	public void setPlaybackSpeed(float speed) { 
		
		for(Song song : this.playlist){
			song.setPlaybackSpeed(speed); 
		} 
	}
	
	public String getName() { 
		
		return this.playlistName; 
		
		}  
	
	public void add(Song song) { 
		
		playlist.add(song); 
		
	}  
	
	public void remove(Song song) { 
		
		playlist.remove(song); 
		
	}
}
