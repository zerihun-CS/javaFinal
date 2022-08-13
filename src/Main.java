class Main {

    String languages;

    // constructor accepting single value
    Main(String languages) {
        languages = languages;
        System.out.println(languages + " Programming Language");
    }

    public static void main(String[] args) {

        // call constructor by passing a single value
    Flight boing454 = new Flight(3);
        Flight boing997 = new Flight(5);

    boing454.addPassengers("beza");
    boing454.addPassengers("nahom");
    boing454.addPassengers("jery");
    boing454.addPassengers("zerihun");
    boing454.listOfPassengers();
    }


}
