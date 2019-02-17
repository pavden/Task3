
package ua.training.controller;

import ua.training.model.Model;
import ua.training.model.converter.EntryConverter;
import ua.training.model.entity.EntryEntity;
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

        Scanner scanner = new Scanner(System.in);
        EntryValidator entryValidator = new EntryValidator(scanner, view);

        EntryEntity entryEntity = EntryConverter.fromDTO(entryValidator.inputEntry());

        model.addEntry(entryEntity);
        view.printMessage(entryEntity.toString());

        scanner.close();
    }

}
