
package ua.training.controller;

import ua.training.model.dto.AddressDTO;
import ua.training.model.dto.ContactsDTO;
import ua.training.model.dto.EntryDTO;
import ua.training.model.dto.PersonDTO;
import ua.training.model.enums.Group;
import ua.training.view.Messages;
import ua.training.view.View;

import java.util.Scanner;

public class EntryValidator {

    private Scanner scanner;
    private View view;

    public EntryValidator(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public EntryDTO inputEntry() {
        InputValidator inputValidator = new InputValidator(scanner, view);

        PersonDTO personDTO = new PersonDTO(inputValidator.inputStringValue(Messages.LAST_NAME, Regex.PROPER_NAME),
                                            inputValidator.inputStringValue(Messages.FIRST_NAME, Regex.PROPER_NAME),
                                            inputValidator.inputStringValue(Messages.MIDDLE_NAME, Regex.PROPER_NAME));

        String nicknameDTO = inputValidator.inputStringValue(Messages.NICKNAME, Regex.NICKNAME);
        String commentDTO = inputValidator.inputStringValue(Messages.COMMENT, Regex.COMMENT);
        Group groupDTO = Group.valueOf(inputValidator.inputStringValue(Messages.GROUP, Regex.GROUP));

        ContactsDTO contactsDTO =  new ContactsDTO(inputValidator.inputStringValue(Messages.HOME_PHONE, Regex.PHONE),
                                                   inputValidator.inputStringValue(Messages.MOBILE_PHONE_FIRST, Regex.PHONE),
                                                   inputValidator.inputStringValue(Messages.MOBILE_PHONE_SECOND, Regex.PHONE),
                                                   inputValidator.inputStringValue(Messages.EMAIL, Regex.EMAIL),
                                                   inputValidator.inputStringValue(Messages.SKYPE, Regex.SKYPE));

        AddressDTO addressDTO = new AddressDTO(inputValidator.inputStringValue(Messages.ZIP_CODE, Regex.ZIP_CODE),
                                               inputValidator.inputStringValue(Messages.CITY, Regex.PROPER_NAME),
                                               inputValidator.inputStringValue(Messages.STREET, Regex.PROPER_NAME),
                                               inputValidator.inputStringValue(Messages.BUILDING, Regex.BUILDING),
                                               inputValidator.inputStringValue(Messages.APARTMENT, Regex.APARTMENT));

        return new EntryDTO(personDTO, nicknameDTO, commentDTO, groupDTO, contactsDTO, addressDTO);
    }

    public EntryDTO inputEntryNickname(EntryDTO entryDTO) {
        InputValidator inputValidator = new InputValidator(scanner, view);

        entryDTO.setNickname(inputValidator.inputStringValue(Messages.NICKNAME, Regex.NICKNAME));

        return entryDTO;
    }

}
