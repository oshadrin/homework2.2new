public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor(45, 64, 75, 44, 55);
        Gryffindor germiona = new Gryffindor(22, 56, 57, 44, 33);
        Gryffindor ron = new Gryffindor(72, 66, 14, 45, 33);
        Slitherin drako = new Slitherin(43, 33, 72, 29, 84);
        Slitherin grehem = new Slitherin(44, 45, 64, 37, 69);
        Slitherin gregogy = new Slitherin(11, 83, 23, 71, 22);
        new Puffenduy(33, 44, 72, 45, 55);
        Puffenduy sedrik = new Puffenduy(28, 46, 66, 43, 67);
        Puffenduy jastin = new Puffenduy(55, 67, 43, 34, 67);
        Kogtevran chzhou = new Kogtevran(33, 35, 65, 23, 23, 45);
        Kogtevran padma = new Kogtevran(35, 54, 22, 76, 32, 56);
        new Kogtevran(17, 71, 43, 54, 58, 91);
        System.out.println("harry = " + harry);
        Gryffindor.comparePropertiesGriffendor(germiona, ron);
        Kogtevran.comparePropertiesKogtevran(chzhou, padma);
        Slitherin.comparePropertiesSlitherin(drako, grehem);
        Puffenduy.comparePropertiesPuffenuy(sedrik, jastin);
        Hogwarts.comparePropertiesHogwarts(harry, gregogy);
    }
}
