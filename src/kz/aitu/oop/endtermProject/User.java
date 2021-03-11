package kz.aitu.oop.endtermProject;

import kz.aitu.oop.endtermProject.Interfaces.UserAccount;

public class User implements UserAccount {
    String Login;
    String Password;
    @Override
    public void AuthorizationData() {
        Login = Input.myReadLnStr();
        Password = Input.myReadLnStr();
    }

    @Override
    public void UserPersonalOffers() {

    }

    @Override
    public void UserFavoriteOffers() {

    }
}
