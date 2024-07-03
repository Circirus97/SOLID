package org.example.database;

public class DataService {

    private final Database database = new Database();

    public void saveData(String data) {
        database.save(data);
    }
}
