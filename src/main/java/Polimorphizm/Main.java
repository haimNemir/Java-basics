package Polimorphizm;

import java.util.Random;

public class Main {
    public void main(String[] args) {
        Control[] control1 = new Control[6];
        control1[0] = new Button(7, 12, "window", "blue");
        control1[1] = new Button(7, 12, "call of duty", "black");
        control1[2] = new TextBox(5, 7, "reminder", "homework");
        control1[3] = new TextBox(5, 7, "work time", "07:00");
        control1[4] = new Password(7, 11, "new RAM", "15664487");
        control1[5] = new Password(7, 11, "Movies", "1445");
//        if (button1.equals(button2))
//            System.out.println("Equals");
//        if (textBox1.equals(textBox2))
//            System.out.println("Equals");
//        if (pass1.equals(pass2))
//            System.out.println("Equals");
//
//        for (Control reference : control1){
//            System.out.println(reference.toString());
//        }

        Circuit[] circuits = new Circuit[4];
        for (int i = 0; i < 4; i++) {
            circuits[i] = createRandomCircuit();
        }
        int averageLength = 0;
        int averageAge = 0;
        int theOldestCar = 2019;
        int numberOfFirstPlacements = 0;
        int numberOfThirdPlacements = 0;
        for (Circuit circuit : circuits) {
            averageLength += circuit.lengthCircuit;
            for (Car car : circuit.cars) {
                if (theOldestCar > car.year)
                    theOldestCar = car.year;
                for (Driver driver : car.drivers) {
                    averageAge += driver.age;
                    for (Medal medal : driver.medals){
                        if (medal.getPosition() == 1){
                            numberOfFirstPlacements += 1;
//                            System.out.println(medal.getDate());
                        } else if (medal.getPosition() == 3) {
                            numberOfThirdPlacements += 1;
                        }
                    }
                }
            }
        }

    }

    public Medal createRandomMedal() {
        Random random = new Random();
        int randomPosition = random.nextInt(1, 4);
        String[] randomDates = new String[5];
        randomDates[0] = "16.06.2024";
        randomDates[1] = "15.06.2024";
        randomDates[2] = "14.06.2024";
        randomDates[3] = "13.06.2024";
        int randomPlacement = random.nextInt(0, 4);
        return new Medal(randomPosition, randomDates[randomPlacement]);
    }

    public Driver createRandomDriver() {
        Random random = new Random();
        String[] randomName = new String[5];
        randomName[0] = "Mordechai";
        randomName[1] = "Yehuda";
        randomName[2] = "Ruth";
        randomName[3] = "Haim";
        randomName[4] = "David";
        int randomPlacement = random.nextInt(0, 5);
        int randomAge = random.nextInt(11, 121);
        Driver driver = new Driver(randomName[randomPlacement], randomAge);
        for (int i = 0; i < 4; i++) {
            driver.medals[i] = createRandomMedal();
        }
        return driver;
    }

    public Car createRandomCar() {
        Random random = new Random();
        String[] randomModel = new String[5];
        randomModel[0] = "Mersedes";
        randomModel[1] = "Shevrolet";
        randomModel[2] = "Audi";
        randomModel[3] = "Siat";
        randomModel[4] = "Tesla";
        int randomPlacement = random.nextInt(0, 5);
        int randomYear = random.nextInt(1960, 2020);
        Car car = new Car(randomModel[randomPlacement], randomYear);
        car.drivers[0] = createRandomDriver();
        car.drivers[1] = createRandomDriver();
        return car;
    }

    public Circuit createRandomCircuit() {
        Random random = new Random();
        String[] randomName = new String[5];
        randomName[0] = "Mordechai";
        randomName[1] = "Yehuda";
        randomName[2] = "Ruth";
        randomName[3] = "Haim";
        randomName[4] = "David";
        String[] randomCountry = new String[6];
        randomCountry[0] = "Holland";
        randomCountry[1] = "Israel";
        randomCountry[2] = "USA";
        randomCountry[3] = "Denmark";
        randomCountry[4] = "Hostralya";
        randomCountry[5] = "Hostralya";
        int randomPlacementName = random.nextInt(0, 5);
        int randomPlacementCountry = random.nextInt(0, 6);
        int randomLengthCircuit = random.nextInt(4, 31);
        Circuit circuit = new Circuit(randomName[randomPlacementName], randomCountry[randomPlacementCountry], randomLengthCircuit);
        for (int i = 0; i < 10; i++) {
            circuit.cars[i] = createRandomCar();
        }
        return circuit;
    }
}
