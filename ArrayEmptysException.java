public class ArrayEmptysException extends RuntimeException{

    public ArrayEmptysException (String input){

        super(String.format("В строке [%s] заполнены не все поля"));
    }
}
