package OOP_exercises;

public class main {
    public static void main(String[] args) {
        Address address1 = new Address("Henry kisinger", (byte) 75, "rishon le zion");
        Address address2 = new Address("rotshild", (byte) 78, "rishon le zion");
// Ex.1: // it is not correct to give to year of birth byte because of limit of +127/-128,
        Person person1 = new Person("haim nemirovsky", "chimnem@gmail.com", (byte) 1999, address1);
        Person person2 = new Person("yoad vahaba", "yoad@gmail.com", (byte) 2002, address1);
        Person person3 = new Person("roberto", "roberto@gmail.com", (byte) 2000, address1);
        Person person4 = new Person("noha huguy", "noha@gmail.com", (byte) 2002, address1);
//        System.out.println(person3.getAddress().getStreetName());
        person3.setAddress(address2);
//        System.out.println(person3.getAddress().getStreetName());
        File file1 = new File("CV", "PDF", 2.36);
//        file1.fileData();
//        System.out.println(person1.getYearOfBirth());

// Ex.2:

        File file2 = new File("David", "TEXT", 2.36);
        File file3 = new File("Ruth", "TEXT", 2.36);
        File file4 = new File("Yehuda", "TEXT", 2.36);
        File file5 = new File("Mordechai", "TEXT", 2.36);
        Folder folder1 = new Folder("Brothers");
        folder1.setFiles(file2);
        folder1.setFiles(file3);
        folder1.setFiles(file4);
//        folder1.setFiles(file5);
        folder1.deleteFile(0);
//        System.out.println(folder1.getFolderName());
//        System.out.println(folder1.getFile(2).getFileName());

// Ex.3:
        Note note1 = new Note("Ikarim", "this is a wonderful game", "06/06/2024", "new");
        Note note2 = new Note("Trivean", "this is a terrible game", "06/06/2024", "new");
        Note note3 = new Note("Apex legends", "this is a very nice shooting game", "06/06/2024", "old");
        Note note4 = new Note("Apex legends", "this is a very nice shooting game", "06/06/2024", "old");
        Group group1 = new Group("Documents");
        group1.addNote(note1);
        group1.addNote(note2);
        group1.addNote(note3);
        group1.addNote(note4);


//        System.out.println(group1.getExistingNumberOfNotes());
//        System.out.println(group1.getOneNoteFromTheArray(1).getTitle());
//        group1.removeNote(1);

//        for (int i = 0; i < group1.getArrayOfNotes().length; i++) {
//            System.out.println(group1.getOneNoteFromTheArray(i+1).getTitle());
//        }

// Ex.4:
        TankMark6 tankMark6A = new TankMark6(4, 4, 80, 55.6, "Durany team", 4.75, 3.45);
//        System.out.println(tankMark6A.getBarrelLength());
//        System.out.println(tankMark6A.getAirDefence());
// Ex.5:
        PlasticBox plasticBox1 = new PlasticBox("sugar", 6.5, 6.5, 11.2);
        PlasticBox plasticBox2 = new PlasticBox("sugar", 6.5, 6.5, 11.2);
        if (plasticBox1.equals(plasticBox2))
            System.out.println("equals");

//        System.out.println(plasticBox1.toString());
        CanBox canBox1 = new CanBox("shimurim", 5, 7.5);
//        System.out.println(canBox1.toString());
//        System.out.println("the volume is: " + canBox1.volumeCalc());
//        System.out.println("the volume is: " + plasticBox1.volumeCalc());
// Ex.6
        MFGEmployee mfgEmployee1 = new MFGEmployee("haim", "Nemirovski", 180);
//        System.out.println(mfgEmployee1.toString());
//        System.out.println("********************************************************");
//        SalesEmployee salesEmployee1 = new SalesEmployee("David", "nemirovski", 17);
//        System.out.println(salesEmployee1.toString());
//        salesEmployee1.addSale();
//        System.out.println(salesEmployee1.toString());
//        System.out.println("********************************************************");
//        PackEmployee packEmployee1 = new PackEmployee("mordechai", "nemirovski", 24);
//

//        System.out.println(packEmployee1.toString());
    }
}

