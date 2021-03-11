package kz.aitu.oop.endtermProject.Interfaces;

import kz.aitu.oop.endtermProject.Input;

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
