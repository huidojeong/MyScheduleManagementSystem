package drama;

import java.util.Scanner;

public class RomansDramaSchedule extends DramaSchedule implements DramaScheduleInput{
	
	 public RomansDramaSchedule(DramaKind kind) {
	      super(kind);
	      }
	
	public void getUserInput( Scanner input) {
	      System.out.print("drama name:");
	         String dramaname = input.next();
	         this.setDramaname(dramaname);

	         System.out.print("drama channel name");
	         String dramachannel = input.next();
	         this.setDramachannel(dramachannel);

	         System.out.print("drama running time(Minutes)");
	         int runningtime = input.nextInt();
	         this.setRunningtime(runningtime);

	         System.out.print("The number of episodes in a drama");
	         int episodes = input.nextInt();
	         this.setEpisodes(episodes);
	   }

}
