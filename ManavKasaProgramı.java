package myjavaprograms;
import java.util.Scanner ;

public class ManavKasaProgramý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		double pear, apple, tomato, banana, aubergine ;
		double priceApple, pricePear, priceTomato, priceBanana, priceAubergine ;
		
		
		
		
		//armut
		System.out.print("Armutun kilosunu kilogram cinsinden giriniz: ");
		pear=input.nextDouble();
		
		
		
		//elma
		
		System.out.print("Elmanýn kilosunu kilogram cinsinden giriniz: ");
		apple=input.nextDouble();
		
		
		//Domates
		
		System.out.print("Domatesin kilosunu kilogram cinsinden giriniz: ");
		tomato=input.nextDouble();
		
		
		//Muz
		
		System.out.print("Muzun kilosunu kilogram cinsinden giriniz: ");
		banana=input.nextDouble();
		
		
		//Patlýcan
		
		System.out.print("Patlýcanýn kilosunu kilogram cinsinden giriniz: ");
	    aubergine=input.nextDouble();
	    
	    //Calculating prices of each
		
	     priceApple = 3.67 * apple ;
	     pricePear = 2.14 * pear ;
	     priceTomato = 1.11 - tomato ;
	     priceBanana = 0.95* banana ;	     
	     priceAubergine =  5.00 * aubergine ;
	     
	     //Calculating Total 
	     
	     double total = priceApple +pricePear+ priceTomato+ priceBanana+ priceAubergine ;
	     
	     //Printing Results
	     
	     System.out.println("Elmanýn fiyatý: " + priceApple   +  " 		Armutun fiyatý: " + pricePear +"		Domatesisn fiyatý: " + priceTomato +" 		Muzun Fiyatý: " + priceBanana 
	    		 + "		Patlýcanýn Fiyatý: "+ priceAubergine);
	     System.out.println("Toplam Fiyat: " + total);
	     
	     
	     
	     
	     
	     
	     
	     
	     
		

		

		
		
		
		
		

	}

}
