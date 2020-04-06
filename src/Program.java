
public class Program {

	public static void main(String[] args) {
		
		// New playlist 
		Playlist testPlaylist = new Playlist("Funk");		
		// Make "Experimental" playlist and add 3 songs to it, 
		// then set playback speed of the playlist to 0.5x
		
		Song groovySong1 = new Song("Boogie Wonderland", "Earth wind and fire" );
		Song groovySong2 = new Song("Regulate", "Warren G");
		testPlaylist.add(groovySong1);
		testPlaylist.add(groovySong2);
		float slowSpeed = 0.5f;
		testPlaylist.setPlaybackSpeed(slowSpeed);
		String name = groovySong1.getName(); 
		String artist = groovySong1.getArtist();
		System.out.println ("The song name is " + name );
		System.out.println ("The song artist is " + artist );
		
		
		// Play "Study" playlist.
		testPlaylist.play(); 

		// Get the playlist name of studyPlaylist → "Study"
		System.out.println ("The Playlist's name is " + testPlaylist.getName() );
		}
}

