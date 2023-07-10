public class PhoneNumberException extends RuntimeException{
    
        public PhoneNumberException (String input){

        super(String.format("Некорректный формат номера"));
    }
}
