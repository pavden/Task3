
package ua.training.model;

import ua.training.model.entity.EntryEntity;
import ua.training.model.exceptions.NonUniqueNicknameException;

public class Model {

    private EntryEntity entryEntity;

    public EntryEntity getEntryEntity() {
        return entryEntity;
    }

    public void setEntryEntity(EntryEntity entryEntity) throws NonUniqueNicknameException {
        if (ModelDB.isNicknameUsed(entryEntity.getNickname())) {
            throw new NonUniqueNicknameException("Non-unique nickname", entryEntity.getNickname());
        }
        this.entryEntity = entryEntity;
    }

}
