package kz.aitu.oop.endtermProject;

import kz.aitu.oop.endtermProject.Interfaces.UserAccount;

public class User implements UserAccount {
    String Login;
    String Password;
    String Car;

    @Override
    public void AuthorizationData(String L, String P) {
        if(GUI.Success == true) {
            Login = L;
            Password = P;
        }
    }

    @Override
    public void UserPersonalOffers() {

    }

    @Override
    public void UserFavoriteOffers() {

    }
}
