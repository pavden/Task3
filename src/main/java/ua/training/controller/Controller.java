
package ua.training.controller;

import ua.training.model.Model;
import ua.training.model.converter.EntryConverter;
import ua.training.model.dto.EntryDTO;
import ua.training.model.entity.EntryEntity;
import ua.training.model.exceptions.NonUniqueNicknameException;
import ua.training.view.Messages;
import ua.training.view.View;

import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        view.printMessage(Messages.WELCOME);
        Scanner scanner = new Scanner(System.in);

        EntryValidator entryValidator = new EntryValidator(scanner, view);
        addEntryToModel(entryValidator, entryValidator.inputEntry());

        scanner.close();
    }

    public void addEntryToModel(EntryValidator entryValidator, EntryDTO entryDTO) {
        try {
            EntryEntity entryEntity = EntryConverter.fromDTO(entryDTO);
            model.setEntryEntity(entryEntity);
            view.printMessage(entryEntity.toString());
        } catch (NonUniqueNicknameException e) {
            e.printStackTrace();
            view.printMessage(view.buildMessage(e.getMessage(), Messages.COLON,
                                                Messages.SPACE, e.getNickname()));
            addEntryToModel(entryValidator, entryValidator.inputEntryNickname(entryDTO));
        }
    }

}
