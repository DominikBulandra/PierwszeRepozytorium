import java.util.*;
public class zad1
{
public static void main(String[] args) {
	
	Scanner klawiatura = new Scanner(System.in);
	
	int min=klawiatura.nextInt();
	int max=klawiatura.nextInt();
	Random rand=new Random();
	int a = rand.nextInt(max - min + 1) + min;
	 for(int i=1; i<1000; i++){
		if(i%a==0){
			System.out.println(i + ", ");
  
		}

              
         }
        
}
}
