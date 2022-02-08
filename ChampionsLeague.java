import java.text.DecimalFormat;
import java.util.*;
public class ChampionsLeague {
  public static class Team{
		String name, country;
		int place;
		char group;
		double spi;

		public Team(){	
		}
		public Team(String name, String country, int place, char group, double spi){
			this.name=name;
			this.country=country;
			this.place=place;//first or second
			this.group=group;
			this.spi=spi;
		}
		public String toString(){
			return name;
		}
	}

private static Team[] eight;
private static Team[] four;
private static Team[] two;

	public static boolean isValid(Team team1, Team team2){
		boolean valid = true;
		if (team1.country.equals(team2.country)) valid = false;
		if (team1.place==team2.place) valid = false;
		if (team1.group==team2.group) valid = false;
		return valid;			
	}

	public static void willWin(Team team1, Team team2)
	{
		double percentage = (100 / (team1.spi + team2.spi)) * (2*(team1.spi - team2.spi)+team1.spi);
		double percentage1 = 100 - percentage;
		DecimalFormat df = new DecimalFormat("#.00");
		String per = df.format(percentage);
		String per1 = df.format(percentage1);
		String result = per + "%     " + per1 + "%";
		
		int[] win = new int[2];
		String winner = "";
		int count =0;
		while (count != 4)
		{
			Random r = new Random();        
    		int randomNumber = r.nextInt(100);
			count++;
			if (randomNumber<=percentage)
			{	
				win[0]++;	
			}
			else{
				win[1]++;
			}
		}
		if (win[0]>win[1])
		{
			winner = team1.name + " to the Quarter-final.";
			for (int i = 0; i<8;i++)
			{
				if (eight[i]==null)
				{
					eight[i] = team1;
					break;
				}
			}
		}
		else
		{
			winner = team2.name + " to the Quarter-final.";
			for (int i = 0; i<8;i++)
			{
				if (eight[i]==null)
				{
					eight[i] = team2;
					break;
				}
			}
		}
		System.out.println(result);	
		System.out.println(winner);
	}	

	public static void willWin1(Team team1, Team team2)
	{
		double percentage = (100 / (team1.spi + team2.spi)) * (2*(team1.spi - team2.spi)+team1.spi);
		double percentage1 = 100 - percentage;
		DecimalFormat df = new DecimalFormat("#.00");
		String per = df.format(percentage);
		String per1 = df.format(percentage1);
		String result = per + "%     " + per1 + "%";
		
		int[] win = new int[2];
		String winner = "";
		int count =0;
		while (count != 4)
		{
			Random r = new Random();        
    		int randomNumber = r.nextInt(100);
			count++;
			if (randomNumber<=percentage)
			{	
				win[0]++;	
			}
			else{
				win[1]++;
			}
		}
		if (win[0]>win[1])
		{
			winner = team1.name + " to the Semi-final.";
			for (int i = 0; i<4;i++)
			{
				if (four[i]==null)
				{
					four[i] = team1;
					break;
				}
			}
		}
		else
		{
			winner = team2.name + " to the Semi-final.";
			for (int i = 0; i<4;i++)
			{
				if (four[i]==null)
				{
					four[i] = team2;
					break;
				}
			}
		}
		System.out.println(result);	
		System.out.println(winner);
	}	

	public static void willWin2(Team team1, Team team2)
	{
		double percentage = (100 / (team1.spi + team2.spi)) * (2*(team1.spi - team2.spi)+team1.spi);
		double percentage1 = 100 - percentage;
		DecimalFormat df = new DecimalFormat("#.00");
		String per = df.format(percentage);
		String per1 = df.format(percentage1);
		String result = per + "%     " + per1 + "%";
		
		int[] win = new int[2];
		String winner = "";
		int count =0;
		while (count != 4)
		{
			Random r = new Random();        
    		int randomNumber = r.nextInt(100);
			count++;
			if (randomNumber<=percentage)
			{	
				win[0]++;	
			}
			else{
				win[1]++;
			}
		}
		if (win[0]>win[1])
		{
			winner = team1.name + " to the Final!";
			for (int i = 0; i<2;i++)
			{
				if (two[i]==null)
				{
					two[i] = team1;
					break;
				}
			}
		}
		else
		{
			winner = team2.name + " to the Final!";
			for (int i = 0; i<2;i++)
			{
				if (two[i]==null)
				{
					two[i] = team2;
					break;
				}
			}
		}
		System.out.println(result);	
		System.out.println(winner);
	}	

	public static void willWin3(Team team1, Team team2)
	{
		double percentage = (100 / (team1.spi + team2.spi)) * (2*(team1.spi - team2.spi)+team1.spi);
		double percentage1 = 100 - percentage;
		DecimalFormat df = new DecimalFormat("#.00");
		String per = df.format(percentage);
		String per1 = df.format(percentage1);
		String result = per + "%     " + per1 + "%";
		
		int[] win = new int[2];
		String winner = "";
		int count =0;
		while (count != 4)
		{
			Random r = new Random();        
    		int randomNumber = r.nextInt(100);
			count++;
			if (randomNumber<=percentage)
			{	
				win[0]++;	
			}
			else{
				win[1]++;
			}
		}
		if (win[0]>win[1])
		{
			winner = team1.name + " to the Glory!";
		}
		else
		{
			winner = team2.name + " to the Glory!";
		}
		System.out.println(result);	
		System.out.println(winner);
	}	

	public static void newLine(){
		System.out.println();
	}

	
	public static void result(){
		Team[] round16 = new Team[16];
		round16[0] = new Team("Man City", "England", 1, 'A', 93.2);
		round16[1] = new Team("Liverpool", "England", 2, 'A', 92.7);
		round16[2] = new Team("PSG", "France", 1, 'B', 83.8);
		round16[3] = new Team("A.Madrid", "Spain", 2, 'B', 83.0);
		round16[4] = new Team("Ajax", "Holland", 1, 'C', 87.5);
		round16[5] = new Team("Sporting", "Portugal", 2, 'C', 73.4);
		round16[6] = new Team("R.Madrid", "Spain", 1, 'D', 86.0);
		round16[7] = new Team("Inter", "Italy", 2, 'D', 85.5);
		round16[8] = new Team("Bayern", "Germany", 1, 'E', 93.7);
		round16[9] = new Team("Benfica", "Portugal", 2, 'E', 73.9);
		round16[10] = new Team("Man United", "England", 1, 'F', 80.4);
		round16[11] = new Team("Villarreal", "Spain", 2, 'F', 74.9);
		round16[12] = new Team("Lille", "France", 1, 'G', 72.0);
		round16[13] = new Team("RB Salzburg", "Austria", 2, 'G', 73.1);
		round16[14] = new Team("Juventus", "Italy", 1, 'H', 79.5);
		round16[15] = new Team("Chelsea", "England", 2, 'H', 89.4);

		String res = "";
		Team[] first = new Team[8];
		Team[] second = new Team[8];
		for (int i=0; i<16; i++){
			if (i%2==0) first[i/2]=round16[i];
			else second[i/2]=round16[i];
		}

		eight = new Team[8];
		int count = 0;
		while (count!=8)
		{
			Random r=new Random();        
      		int randomNumber=r.nextInt(first.length);
			Random r1=new Random();        
      		int randomNumber1=r1.nextInt(second.length);
			if(first[randomNumber] != null && second[randomNumber1] != null)
			{
				if (isValid(first[randomNumber],second[randomNumber1]))
				{
				res = first[randomNumber] + " VS " + second[randomNumber1];
					System.out.println(res);
					willWin(first[randomNumber], second[randomNumber1]);
					newLine();
					count++;
					first[randomNumber] = null;
					second[randomNumber1] = null;
				}
			}
		}	
	}

	public static void quaterFinal(){
		Team[] round8 = new Team[8];
		round8[0] = eight[0];
		round8[1] = eight[1];
		round8[2] = eight[2];
		round8[3] = eight[3];
		round8[4] = eight[4];
		round8[5] = eight[5];
		round8[6] = eight[6];
		round8[7] = eight[7];

		String res = "";
		four = new Team[4];
		int count = 0;
		while (count!=4)
		{
			Random r=new Random();        
      		int randomNumber=r.nextInt(round8.length);
			Random r1=new Random();        
      		int randomNumber1=r1.nextInt(round8.length);
			if(randomNumber != randomNumber1)
			{
				if (round8[randomNumber] != null && round8[randomNumber1] != null)
				{
					res = round8[randomNumber] + " VS " + round8[randomNumber1];
					System.out.println(res);
					willWin1(round8[randomNumber], round8[randomNumber1]);
					newLine();
					count++;
					round8[randomNumber] = null;
					round8[randomNumber1] = null;
				}
			}
		}	
	}

	public static void semiFinal(){
		String res = "";
		int count = 0;
		two = new Team[2];
		while (count!=2)
		{
			for (int i = 0; i<3; i+=2)
			{
				res =  four[i] + " VS " + four[i+1];
				System.out.println(res);
				willWin2(four[i], four[i+1]);
				newLine();
				count++;
			}
		}

	}

	public static void finale(){
		String res = "";
		res =  two[0] + " VS " + two[1];
		System.out.println(res);
		willWin3(two[0], two[1]);
		newLine();
	}

	public static void main(String args[]){
		System.out.println("---------Round of 16---------");
		result();
		newLine();
		System.out.println("---------Quarterfinals---------");
		quaterFinal();
		newLine();
		System.out.println("---------Semifinals---------");
		semiFinal();
		newLine();
		System.out.println("-------Final at Gazprom Arena-------");
		finale();		
	}
}