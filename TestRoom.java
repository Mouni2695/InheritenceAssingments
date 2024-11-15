package inheritence;

public class TestRoom {

		public static void main(String[] args) {
	       Room r=new Room();
	       TV tv=new TV();
	       String color="lightgreen";    
	       String brand="SAMSUNG";
	       tv.getBrand();
	       tv.setBrand(brand);
	      
	       r.setTv(tv);
	       r.setColor(color);
	       System.out.println("Room wall color : "+color );
	      
	       System.out.println("TV Brand is : "+(r.getTv().getBrand()));
		}
}
