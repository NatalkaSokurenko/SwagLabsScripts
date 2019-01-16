package data;

import com.github.javafaker.Faker;

public class UserDataProvider {
    Faker faker =new Faker();

    public UserData generateUserData(){
        UserData data = new UserData();
        data.setFirstName(faker.name().firstName());
        data.setLastName(faker.name().lastName());
        data.setZipCode(faker.code().asin());
        return data;
    }
}
