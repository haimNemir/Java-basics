package Design_patterns.Creational.Builder.builder;

public class Program {
    public static void main(String[] args) {
       House house1 = new House.Builder()
               .setFoundation("concrete")
               .setRoof("tar")
               .setStructure("wood").build();

        System.out.println(house1);

        House house2 = new House.Builder()
                .setPainted(true)
                .setStructure("Iron")
                .setRoof("Shingles")
                .build();

        System.out.println(house2);

        House house3 = new House("","","",true, false);

    }
}
