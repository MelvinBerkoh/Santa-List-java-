import java.util.ArrayList;
import java.util.List;

public class SantaList
{
public static void main(String[] args) 
{
	// create 6 nice person objects
	 List<NicePerson> santaNiceList = new ArrayList<NicePerson>();
	 List<Name> children = new ArrayList<Name>();
	 List<String> potentialGifts = new ArrayList<String>();
	 
	 //List of gifts
	 potentialGifts.add("Playstation 5");
	 potentialGifts.add("$1000");
	 potentialGifts.add("Round trip to Dubai");
	 potentialGifts.add("Ugly Sweater");
	 potentialGifts.add("IPhone 13 64GBs");
	 potentialGifts.add("Chai Tea");
	 
	 //Block of code for making and putting one person on nice list
	 children.add(new Name("John", "Kurt"));
	 NicePerson p1 = new NicePerson();
	 p1.setName(children.get(0));
	 p1.setPresent(potentialGifts.get(0));
	 p1.setPresent(potentialGifts.get(3));
	 santaNiceList.add(p1);
	 	// create person
		 children.add( new Name("Jude" ,"Griffin"));
		 NicePerson p2 = new NicePerson();
		 p2.setName(children.get(1));
		 p2.setPresent(potentialGifts.get(1));
		 p2.setPresent(potentialGifts.get(4));
		 santaNiceList.add(p2);
		 // create person 
		 children.add( new Name("Lexi" ,"Burger"));
		 NicePerson p3 = new NicePerson();
		 p3.setName(children.get(2));
		 p3.setPresent(potentialGifts.get(2));
		 p3.setPresent(potentialGifts.get(3));
		 santaNiceList.add(p3);
		 // Create person
		 children.add( new Name("Alex", "Robinson"));
		 NicePerson p4 = new NicePerson();
		 p4.setName(children.get(3));
		 p4.setPresent(potentialGifts.get(4));
		 p4.setPresent(potentialGifts.get(2));
		 santaNiceList.add(p4);
		 // create Person 
		 children.add( new Name("Steph", "Meyer"));
		 NicePerson p5 = new NicePerson();
		 p5.setName(children.get(4));
		 p5.setPresent(potentialGifts.get(5));
		 p5.setPresent(potentialGifts.get(0));
		 santaNiceList.add(p5);
		 // create Person 
		 children.add(new Name("Micheal","Smith"));
		 NicePerson p6 = new NicePerson();
		 p6.setName(children.get(5));
		 p6.setPresent(potentialGifts.get(5));
		 p6.setPresent(potentialGifts.get(2));
		 santaNiceList.add(p6);
	 // display outcome
	 System.out.println(santaNiceList.get(0).toString()  + "\n\n");
	 System.out.println(santaNiceList.get(1).toString() + "\n\n");
	 System.out.println(santaNiceList.get(2).toString() + "\n\n");
	 System.out.println(santaNiceList.get(3).toString() + "\n\n");
	 System.out.println(santaNiceList.get(4).toString() + "\n\n");
	 System.out.println(santaNiceList.get(5).toString() + "\n\n");
	 
}
}
