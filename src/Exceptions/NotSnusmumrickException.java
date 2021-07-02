package Exceptions;

public class NotSnusmumrickException extends RuntimeException {
    public NotSnusmumrickException(){
        System.err.println("Под окном стоит точно не Снусмумрик...\nПродолжение неизвестно.");
    }
}
