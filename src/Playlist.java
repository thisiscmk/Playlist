import java.util.ArrayList;

/*
    Playlist.java
    This class creates the best possible playlist of music using a Java ArrayList and it manipulates songs in the playlist
    Author: CMK

 */
class Playlist {

    public static void main(String[] args) {
        // Declare the array
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        //Initialize the array
        desertIslandPlaylist.add("For your glory");
        desertIslandPlaylist.add("You know my name");
        desertIslandPlaylist.add("O merite");
        desertIslandPlaylist.add("Dove's eyes");
        desertIslandPlaylist.add("Gracefully broken");
        desertIslandPlaylist.add("Cache toi");
        desertIslandPlaylist.add("Susceptible");

        // Print the arraylist
        System.out.println(desertIslandPlaylist);

        // Print the size of the arraylist
        System.out.println("Array size: " + desertIslandPlaylist.size());

        // Remove a song from the arraylist
        desertIslandPlaylist.remove(4);

        // Print the new arraylist
        System.out.println(desertIslandPlaylist);

        // Print the size of the arraylist again
        System.out.println("New Array size: " + desertIslandPlaylist.size());

        //create temporary variable
        String a = desertIslandPlaylist.get(3);
        String b = desertIslandPlaylist.get(4);

        //swap songs in the playlist arraylist
        desertIslandPlaylist.set(3, "Cache toi");
        desertIslandPlaylist.set(4, a);

        //Get indices of songs
        int indA = desertIslandPlaylist.indexOf("Cache toi");
        int indB = desertIslandPlaylist.indexOf("Dove's eyes");

        //Print the indices of swapped songs
        System.out.println(desertIslandPlaylist);
        System.out.println("Index of Cache toi: " + indA);

        System.out.println("Index of Dove's eyes: " + indB);

        //Create String variable tempA and initialize it with the value of song a
        String tempA = "Cache toi";

        desertIslandPlaylist.set(indA, "Dove's eyes");
        System.out.println(desertIslandPlaylist);

        //switch songs again and print arraylist
        desertIslandPlaylist.set(4, tempA);
        System.out.println(desertIslandPlaylist);
    }

}
