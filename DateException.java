public class DateException extends RuntimeException{

    public DateException (String input){

        super(String.format("Некорректный формат даты. Введите DD.MM.YYYY"));
    }
}
