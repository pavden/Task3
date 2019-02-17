
package ua.training.view;

public class View {

    public void printMessage(String message){
        System.out.println(message);
    }

    public String buildMessage(String... messages){
        StringBuilder stringBuilder = new StringBuilder();

        for(String message : messages) {
            stringBuilder = stringBuilder.append(message);
        }

        return stringBuilder.toString();
    }

}
