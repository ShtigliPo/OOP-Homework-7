package ru.gb.Model.service;

import java.util.List;
import ru.gb.Model.data.User;

public interface UserService<C extends User> {
    
    void addContact(C contact);

    void save();

    void load();

    List<C> getContact();
    
}
