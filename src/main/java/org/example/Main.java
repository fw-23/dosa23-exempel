package org.example;

public class Main {
    public static void main(String[] args) {

        // Överlagring - overload
        Shirt myShirt = new Shirt("Esprit");
        myShirt.setPrice(25);
        // Överlagring, samma metod med olika antal parametrar
        Shirt anotherShirt = new Shirt("Dressman", 15);
        System.out.printf("This shirt is %s\n", anotherShirt.getCondition());

        // Vi instansirar två Car-objekt
        Car car = new Car("Toyota");
        car.setSalesPersonEmail("arlige.knut@begnagnade-bilar.fi");
        Bike myBike = new Bike("Scott");

        // abstrakt klass kan inte instansieras, men nog fungera som typ
        Clothing shirt = new Shirt("asd");



        // upcasting
        Vehicle myRide = new Car("WV");
        System.out.printf("I dag åker jag %s\n", myRide.getName());
        myRide.soundWarning();
        // Eftersom dagensFordon har typen Vehicle kan jag byta mellan Car och Bike.
        myRide = new Bike("Nishiki");
        System.out.printf("I morgon åker jag %s\n", myRide.getName());
        myRide.soundWarning();


        car.soundWarning();
        myBike.soundWarning();

        System.out.println(car.getName());
        System.out.println(myBike.getName());

        System.out.printf("%s kostar %.2f, kontakta %s",
                car.getName(),
                car.getPrice(),
                car.getSalesPersonEmail()
        );
    }
}