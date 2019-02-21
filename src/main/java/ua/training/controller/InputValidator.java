
package ua.training.controller;

import ua.training.view.Messages;
import ua.training.view.View;

import java.util.Scanner;

public class InputValidator {

    private Scanner scanner;
    private View view;

    public InputValidator(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String inputStringValue(String message, String regex) {
        view.printMessage(view.buildMessage(Messages.INPUT, Messages.SPACE, message, Messages.COLON));
        String inputLine;

        while(!(scanner.hasNextLine() && (inputLine = scanner.nextLine()).matches(regex))) {
            view.printMessage(view.buildMessage(Messages.WRONG_INPUT, Messages.NEW_LINE,
                                                Messages.INPUT, Messages.SPACE, message, Messages.COLON));
        }

        return inputLine;
    }

}
