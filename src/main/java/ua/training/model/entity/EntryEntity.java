
package ua.training.model.entity;

import ua.training.model.enums.Group;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EntryEntity {

    private static int count;

    private int id;
    private PersonEntity person;
    private String nickname;
    private String comment;
    private Group group;
    private ContactsEntity contacts;
    private AddressEntity address;
    private Date dateCreated;
    private Date dateModified;

    public EntryEntity(PersonEntity person, String nickname, String comment,
                       Group group, ContactsEntity contacts, AddressEntity address) {
        this.id = ++count;
        this.person = person;
        this.nickname = nickname;
        this.comment = comment;
        this.group = group;
        this.contacts = contacts;
        this.address = address;
        this.dateCreated = new Date();
        this.dateModified = new Date();
    }

    public PersonEntity getPerson() {
        return person;
    }

    public void setPerson(PersonEntity person) {
        this.person = person;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public ContactsEntity getContacts() {
        return contacts;
    }

    public void setContacts(ContactsEntity contacts) {
        this.contacts = contacts;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("Entry {");

        stringBuilder.append(" ID = '").append(id).append('\'');
        stringBuilder.append(", ").append(person.toString());
        stringBuilder.append(", Nickname = '").append(nickname).append('\'');
        stringBuilder.append(", Comment = '").append(comment).append('\'');
        stringBuilder.append(", Group = '").append(group.toString()).append('\'');
        stringBuilder.append(", ").append(contacts.toString());
        stringBuilder.append(", ").append(address.toString());
        stringBuilder.append(", Date created = ").append(new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(dateCreated));
        stringBuilder.append(", Date modified = ").append(new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(dateModified));
        stringBuilder.append('}');

        return stringBuilder.toString();
    }
}
