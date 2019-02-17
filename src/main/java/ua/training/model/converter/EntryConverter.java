
package ua.training.model.converter;

import ua.training.model.dto.AddressDTO;
import ua.training.model.dto.ContactsDTO;
import ua.training.model.dto.EntryDTO;
import ua.training.model.dto.PersonDTO;
import ua.training.model.entity.AddressEntity;
import ua.training.model.entity.ContactsEntity;
import ua.training.model.entity.EntryEntity;
import ua.training.model.entity.PersonEntity;
import ua.training.model.enums.Group;

public class EntryConverter {

    public static EntryEntity fromDTO(final EntryDTO entryDTO) {

        PersonDTO personDTO = entryDTO.getPerson();
        PersonEntity personEntity = new PersonEntity(personDTO.getLastName(),
                                                     personDTO.getFirstName(),
                                                     personDTO.getMiddleName());

        String nicknameEntity = entryDTO.getNickname();
        String commentEntity = entryDTO.getComment();
        Group groupEntity = entryDTO.getGroup();

        ContactsDTO contactsDTO = entryDTO.getContacts();
        ContactsEntity contactsEntity = new ContactsEntity(contactsDTO.getHomePhone(),
                                                           contactsDTO.getMobilePhoneFirst(),
                                                           contactsDTO.getMobilePhoneSecond(),
                                                           contactsDTO.getEmail(),
                                                           contactsDTO.getSkype());

        AddressDTO addressDTO = entryDTO.getAddress();
        AddressEntity addressEntity = new AddressEntity(addressDTO.getZipCode(),
                                                        addressDTO.getCity(),
                                                        addressDTO.getStreet(),
                                                        addressDTO.getBuilding(),
                                                        addressDTO.getApartment());

        return new EntryEntity(personEntity, nicknameEntity, commentEntity,
                               groupEntity, contactsEntity, addressEntity);
    }

    public static EntryDTO toDTO(final EntryEntity entryEntity) {

        PersonEntity personEntity = entryEntity.getPerson();
        PersonDTO personDTO = new PersonDTO(personEntity.getLastName(),
                                            personEntity.getFirstName(),
                                            personEntity.getMiddleName());

        String nicknameDTO = entryEntity.getNickname();
        String commentDTO = entryEntity.getComment();
        Group groupDTO = entryEntity.getGroup();

        ContactsEntity contactsEntity = entryEntity.getContacts();
        ContactsDTO contactsDTO = new ContactsDTO(contactsEntity.getHomePhone(),
                                                  contactsEntity.getMobilePhoneFirst(),
                                                  contactsEntity.getMobilePhoneSecond(),
                                                  contactsEntity.getEmail(),
                                                  contactsEntity.getSkype());

        AddressEntity addressEntity = entryEntity.getAddress();
        AddressDTO addressDTO = new AddressDTO(addressEntity.getZipCode(),
                                               addressEntity.getCity(),
                                               addressEntity.getStreet(),
                                               addressEntity.getBuilding(),
                                               addressEntity.getApartment());

        return new EntryDTO(personDTO, nicknameDTO, commentDTO,
                            groupDTO, contactsDTO, addressDTO);
    }

}
