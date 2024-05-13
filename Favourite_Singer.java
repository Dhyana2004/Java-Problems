import java.util.Arrays;
import java.util.Scanner;
public class Favourite_Singer {
/** Problem
Bob has a playlist of N songs, each song has a singer associated with it (denoted by an integer)
Favourite singer of Bob is the one whose songs are the most on the playlistCount the number of
Favourite Singers of Bob 
*/
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N;
        System.out.println("enter the number of songs in the bob playlist:");
        N=input.nextInt();
        int []song=new int[N];
        System.out.println("list the song in the bob playlist");
        for(int i=0;i<N;i++){
            song[i]=input.nextInt();
        }
        Arrays.sort(song);
        System.out.println("the songs in the bob playlist:");
        for(int i=0;i<N;i++){
           System.out.print("["+song[i]+"]");
        }
        int maxCount = 0;
        int count = 1;
        int popular = song[0];
        for(int i=0;i<N;i++){
            if(song[i]==song[i+1]){
                System.out.println(" the most song in the playlist is:"+song[i]);
                count++;
            }
            else {
                if (count > maxCount) {
                    maxCount = count;
                    popular = song[i - 1];
                }
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            popular = song[N - 1];
        }
        System.out.println("\nThe most played song in the playlist is: " + popular);
        System.out.println("Total count: " + maxCount);
    }   
}
