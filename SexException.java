public class SexException extends RuntimeException{

    public SexException (String input){

        super(String.format("Пол должен указываться в формате 'm' или 'f' "));
    }
}
