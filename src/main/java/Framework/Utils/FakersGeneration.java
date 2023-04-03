package Framework.Utils;

import java.util.Locale;

import com.github.javafaker.Faker;

public class FakersGeneration {
    
    private Faker faker;
    private String name;
    private String email;
    private String senha;
    
    public FakersGeneration() {
        
        faker = new Faker(new Locale("pt-BR"));
    }
    
    public String getNome() {
        
       name = faker.name().name();
       return name;
       
       //return faker.name().firstName();
       
    }
    
    public String getEmail() {
        
        String email = faker.internet().emailAddress();
        return email;
    }
    
    public String getSenha() {
        
        String senha = faker.internet().password();
        return senha;
        
    }
    
    
    
}
