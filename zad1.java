import java.util.*;
public class zad1
{
public static void main(String[] args) {
	
	Scanner klawiatura = new Scanner(System.in);
	System.out.println("Podaj minimum ");
	int min=klawiatura.nextInt();
	System.out.println("Podaj maximum ");
	int max=klawiatura.nextInt();
	if(max<min)
	{
		System.out.println("Zle parametry max < min ");
	}
	else
	{
Random rand=new Random();
	int a = rand.nextInt(max - min + 1) + min;

	System.out.println("wylosowano liczbe: "+ a);
	 for(int i=1; i<1000; i++){
		if(i%a==0){
			System.out.println(i + ", ");
  
		}

              
         }

	}	
	
        
}
}
