 class Cars{
	 private  String color;
	 private String name;
	 private int  fuel;
	 private String mode="automatic";
	 private int price;
	 private String airbag;
	 
	 Cars()
	 {
		System.out.println("I am a constructor"); 
	 }
	 
	 Cars(int price, String airbag)
	 {
		 System.out.println(price);
		 System.out.println(airbag);
	 }
	 
	/* public void price()
	 {
		 System.out.println(price);
	 }*/
	 
	 public void printColor(String color)
	 {
		 System.out.println(color);
	 }

	 public void  printname(String name)
	 {
		 System.out.println("name of car "+name);
	 }
	 public void printFuel(int fuel )
	 {
		 System.out.println("fuel used "+fuel);
	 }
}

public class CarsTest {

	public static void main(String[] args) {
		Cars car1=new Cars();
		Cars car2=new Cars();
		Cars car3=new Cars(200000,"4");
		Cars car4=new Cars(300000,"5");
		car1.printColor("yellow");
		car1.printFuel(6);
		car1.printname("swiftdesire");
		car2.printColor("blue");
		car2.printFuel(8);
		car2.printname("innova");
	/*	car3.printColor("white");
		car3.printname("creta");
		car3.printFuel(7);*/
	    System.out.println("I am making changes");
	    System.out.println("changes needed");
		
		
	
		
	}

}
