package ru.gb.View;

import ru.gb.Model.data.User;
import ru.gb.Model.service.UserService;

public abstract class UserView<C extends User> {
    
    private UserService<C> model;

    public UserView(UserService<C> model) {
        this.model = model;
    }

    public void showContacts() {
        for (C contact : model.getContact()) {
            System.out.println(contact);
        }
    }
}
