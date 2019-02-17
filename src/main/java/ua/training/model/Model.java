
package ua.training.model;

import ua.training.model.entity.EntryEntity;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private List<EntryEntity> noteBook = new ArrayList<>();

    public EntryEntity getEntry(int id) {
        return noteBook.get(id);
    }

    public void addEntry(EntryEntity entry) {
        noteBook.add(entry);
    }

    public int getSize() {
        return noteBook.size();
    }

}
