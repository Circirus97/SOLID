package org.example.database;

public class DataService {

    private DataStorage database = new Database();

    public void saveData(String data) {
        database.save(data);
    }

}
