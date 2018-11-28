import com.github.javafaker.Faker;

public class Main {

	
		public static void main(String[] args) {
			Faker faker = new Faker();
			
			for (int i = 0; i <= 20; i++) {
				Fakinho f = new Fakinho();
				f.nome = faker.name().firstName();
				f.endereco = faker.address().fullAddress();
				
				System.out.println(f);
				faker.lorem().paragraphs(15).forEach(System.out::println);
				System.out.println("*************************************\n\n");
			}
		}
}
