public class Classroom {
    public static void main(String[] args) {
        Wilder paul = new Wilder("Paul", false);

        System.out.println(paul.whoAmI(paul.getFirstname(), paul.getAware()));

        paul.setAware(true);

        System.out.println(paul.whoAmI(paul.getFirstname(), paul.getAware()));


        // System.out.println(paul.whoAmI(paul.getFirstname(), paul.getAware()));
    }
}