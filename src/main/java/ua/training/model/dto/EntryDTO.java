
package ua.training.model.dto;

import ua.training.model.enums.Group;

public class EntryDTO {

    private PersonDTO person;
    private String nickname;
    private String comment;
    private Group group;
    private ContactsDTO contacts;
    private AddressDTO address;

    public EntryDTO(PersonDTO person, String nickname, String comment,
                    Group group, ContactsDTO contacts, AddressDTO address) {
        this.person = person;
        this.nickname = nickname;
        this.comment = comment;
        this.group = group;
        this.contacts = contacts;
        this.address = address;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
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

    public ContactsDTO getContacts() {
        return contacts;
    }

    public void setContacts(ContactsDTO contacts) {
        this.contacts = contacts;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

}
