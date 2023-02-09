package ru.gb.Model.util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import ru.gb.Model.data.User;

public class DataWriter {

    public static <C extends User> void dataWrite(List<C> list) {
        try (FileWriter writer = new FileWriter("contactDB.txt", false)) {
            for (C contact : list) {
                writer.write(contact.toString());
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
}
