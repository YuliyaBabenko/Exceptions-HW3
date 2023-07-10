public class InputContact {

    public Contact inputContact(String input) {
            String[] array = input.split(" ");
            if (array.length > 6) {
                throw new ArrayLimitException(input);
            }
            if (array.length < 6) {
                throw new ArrayEmptysException(input);
            }
            if (array[3].length() != 10) {
                throw new DateException(array[3]);
            }
            if (array[4].length() != 11) {
                throw new PhoneNumberException(array[4]);
            }
            if (!array[5].equals("m") && !array[5].equals("f")) {
                throw new SexException(array[5]);
            }
            Contact newContact = new Contact(array[0], array[1], array[2], array[3], array[4], array[5]);
            return newContact;
    }
