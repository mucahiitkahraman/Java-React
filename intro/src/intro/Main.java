package intro;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {			
				String internetSubeButonu = "�nternet �ubesine Gir";
				double dolarDun = 8.20;
				double dolarBugun= 8.19;
				int vade =36;
				boolean dustuMu = false;
				
				System.out.println(internetSubeButonu);	
				
				if(dolarBugun<dolarDun) 
				{
					System.out.println("Dolar d��t� resmi");
				}
				else if(dolarBugun>dolarDun)
				{
					System.out.println("Dolar y�kseldi resmi");
				}
				else
				{
					System.out.println("E�it");
				}
				
				
				String kredi1 = "Hizli Kredi";
				String kredi2 = "Mutlu emekli Kredisi";
				String kredi3 = "Konut Kredisi";
				String kredi4 = "�ift�i Kredisi";
				String kredi5 = "MSB Kredisi";
				String kredi6 = "Meb Kredisi";
				String kredi7 = "K�lt�r Bakanl��� Kredisi";
				
				System.out.println(kredi1);
				System.out.println(kredi2);
				System.out.println(kredi3);
				System.out.println(kredi4);
				System.out.println(kredi5);
				System.out.println(kredi6);
				System.out.println(kredi7);
				
				String[] krediler = {
						"Hizli Kredi",
						"Mutlu emekli Kredisi",
						"Konut Kredisi",
						"�ift�i Kredisi",
						"MSB Kredisi",
						"Meb Kredisi",
						"K�lt�r Bakanl��� Kredisi"};
				//forEach d�ng�s�
				for(String kredi : krediler)
				{
					System.out.println(kredi);
				}
				
				for(int i=0;i<krediler.length;i++)
				{
					System.out.println(krediler[i]);
				}
				
				int number1=10;
				int number2=20;
				number1 = number2;
				number2=100;
				System.out.println(number1);
				
				int[] numbers1= {1,2,3,4,5};
				int[] numbers2= {1,2,3,4,5};
				numbers1=numbers2;
				numbers2[0]=100;
				System.out.println(numbers2[0]);
				
				String city1="Ankara";
				String city2="�stanbul";
				city1=city2;
				city2="�zmir";

	}

}
