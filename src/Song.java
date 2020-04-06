
public class Song {

	public String songName; 
	public String artist; 
	public float speed = 1; // Default playback speed  
	
	public Song(String songName, String artist ){ 
		
		this.songName = songName; 
		this.artist = artist; 
		
	}  
	
	public void play() { 
		
		System.out.println ("The song name is " + this.songName ); 
		System.out.println ("The song artist is " + this.artist ); 
		System.out.println ("The speed is " + this.speed); 
		
	}  
	
	public void setPlaybackSpeed(float speed) { 
		
		this.speed = speed; 
		
	}  
	
	public String getName() {
		
		return this.songName; 
		
	}  
	
	public String getArtist() { 
		
		return this.artist; 
		
	}
	
}
