package hbcu.stay.ready;


public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while (counter < personArray.length) {
            // begin loop

            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
            String stringedCurrentPerson = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result += stringedCurrentPerson;
            counter++;
            // end loop
        }
            return result;
    }




    public String forLoop() {
        String result = "";

        // use the above clauses to declare for-loop signature
            // begin loop
        for(int j = 0; j < personArray.length; j++) {

            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[j];
            // get `string Representation` of `currentPerson`
            String stringedCurrentPerson = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result += stringedCurrentPerson;
            // end loop
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        //Person personType;

        // identify array's variable-name
        Person[] theArray = personArray;

        // use the above discoveries to declare for-each-loop signature
        for (Person personType : theArray) {
            // begin loop

            // get `string Representation` of `currentPerson`
            String stringedPersonType = personType.toString();
            // append `stringRepresentation` to `result` variable
            result += stringedPersonType;
            // end loop
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
