package td;


import com.github.javafaker.Faker;

import java.util.Locale;

import static net.andreinc.mockneat.unit.user.Emails.emails;

public class TestData {

    public static Faker faker = new Faker(new Locale("en"));

    public String setFirstName(){
        String firstname = faker.name().firstName();
        return firstname;
    }

    public String setLastName(){
        String lastname = faker.name().lastName();
        return lastname;
    }

    public String setFullName(){
        String fullname = faker.name().fullName();
        return fullname;
    }

    public String setAddress(){
        String address = faker.address().fullAddress();
        return address;
    }

    public String  setPasword(){
        String pwd = faker.internet().password();
        return pwd;
    }

    public String setEmail(){
        String email = emails().domain("yopmail.com").get();
        return email;
    }

}

