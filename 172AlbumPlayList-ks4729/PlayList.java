import java.util.Arrays;

public class PlayList
{
	/** Song[] array list instance variable*/
	private Song[] list;
	
	/** default constructor used to set the instance variables to default values*/
	public PlayList()
	{
		// I would recommend setting the length to 1
		list = new Song[1];
		// Then make sure you add 1 song to the list in index 0
    Song temp = new Song();
		list[0] = temp;
	}
	
	/** initialization constructor used to set the instance variables
		* @param x the length of the playlist */
	public PlayList(int x)
	{
		// this should set the length of the playlist
		list = new Song[x];
	}
	
	/** modifier method to set the instance variable list
		* @param x the length of the playlist*/
	public void setList(int x)
	{
		// this should set the length of the playlist
		Song[] temp = new Song[x];
    list = temp;
	}
	
	/** accessor method to get the entire playlist
		* @return return the entire playslist as a Song[] array*/
	public Song[] getList()
	{
		return list;
	}
	
	/** method to add a song to the playlist
		* @param x the position in the playlist to add the song
		* @param s the song to add to the playlist*/
	public void addSong(int x, Song s)
	{
		/* you need to check to make sure the array is big enough to add the song
		   if it is not big enough you will need to create a large enough array
			   and then transfer the songs to the new array before assigning the new
			   array back to the list array*/
    if(list[list.length-1] == null){
      if(list.length == 1){
        list[x] = s;
      }
      else if(list.length > 1){
        for(int i = list.length-2; i >= x; i--){
          if(!(list[i] == null)){
            list[i+1] = list[i];
          }
        }
        list[x] = s;
      }
    }
    else{
      Song[] temp1 = new Song[(list.length+1)];
        for(int i = 0; i < x; i++){
          temp1[i] = list[i];
        }
        for(int i = x+1; i < list.length +1; i++){
          temp1[i] = list[i-1];
        }
        int fix = list.length+1;
        setList(fix);
        list = temp1;
        list[x] = s;
    }
  }
	
	/** method to get a song from the playlist
		* @param x the position in the playlist to get the song from
		* @return return the song in the position specified*/
	public Song getSong(int x)
	{
		return list[x];
	}
	
	/** method to get the number of songs in the playlist
		* @return return the number of songs in the playlist*/
	public int numSongs()
	{
    int count = 0;
		for(int i = 0; i < list.length; i++){
      if(list[i].toString() != "//(0)"){
        count++;
      }
    }
    return count;
	}
	
	/** method to get the total length of the playlist specified in seconds
		* @return return the length of the playlist in seconds*/
	public int totalLength()
	{
		/* before accessing the length of an individual song you should ensure that the 
				song reference is not null*/
    int total = 0;
    for(int i = 0; i < list.length; i++){ 
      if(list[i].toString() != "//(0)"){
        total += list[i].getLength();
      }
    }
    return total;
	}
	
	/** method to remove any songs from the specified artist
		* @param ar the artist of the songs to remove from the playlist*/
	public void removeArtist(String ar)
	{
		/* to remove the songs with the specified artist you will first need to count the
				occurances of that artist. 
				Then you will need to create a new smaller array
				Then you can copy the songs to the new array excluding the ones from the artist*/
		int numberOfSongsWithArtist = 0;
    for(int i = 0; i < list.length; i++){
      if(list[i].getArtist().equals(ar)){
        numberOfSongsWithArtist++;
      }
    }
    Song[] temp = list;
    setList(list.length - numberOfSongsWithArtist);
    int count = 0;
    for(int i = 0; i < temp.length; i++){
      if(!(temp[i].getArtist().equals(ar))){
        list[count] = temp[i];
        count++;
      }
    }
	}
	
	/** method to remove any songs longer than the length specified
		* @param length length of songs to removed given in seconds*/
	public void removeLength(int length)
	{
		// same as method above with creating a smaller array
    int numberOfSongsWithlength = 0;
    for(int i = 0; i < list.length; i++){
      if(list[i].getLength() < length){
        numberOfSongsWithlength++;
      }
    }
    Song[] temp = list;
    setList(list.length - numberOfSongsWithlength);
    int count = 0;
    for(int i = 0; i < temp.length; i++){
      if(temp[i].getLength() < length){
        list[count] = temp[i];
        count++;
      }
    }
	}
	
	/** method to shuffle the order of the playlist - use the card shuffling example from the arrays presentation to help*/
	public void shuffle()
	{
		// use the card shuffling example from the arrays presentation to help you with this
	}
	
	/** equals method to determine if two playlists are equal
	 * The base class for all classes instantiated into objects in Java is "Object"
		* @param obj the object to be compared
		* @return return true or false if the playlists are equal*/
	public boolean equals(Object obj)
	{
		PlayList pl = (PlayList)obj;
		if(!Arrays.equals(list, pl.getList()))
			return false;
		return true;
	}
	
	/** toString() method to get the instance variables
		* @return return a String containing the instance variablees*/
	public String toString()
	{
		return Arrays.toString(list);
	}
}