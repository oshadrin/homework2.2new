public class Gryffindor extends Hogwarts {
    private int blagorodstvo;
    private int chest;
    private int hrabrost;

    public Gryffindor(int transgress, int doMagic, int blagorodstvo, int chest, int hrabrost) {
        super(transgress, doMagic);
        this.blagorodstvo = blagorodstvo;
        this.chest = chest;
        this.hrabrost = hrabrost;
    }

    public int getBlagorodstvo() {
        return this.blagorodstvo;
    }

    public int getChest() {
        return this.chest;
    }

    public int getHrabrost() {
        return this.hrabrost;
    }

    public void setBlagorodstvo(int blagorodstvo) {
        if (blagorodstvo >= 0 && blagorodstvo <= 100) {
            this.blagorodstvo = blagorodstvo;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public void setChest(int chest) {
        if (chest >= 0 && chest <= 100) {
            this.chest = chest;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public void setHrabrost(int hrabrost) {
        if (hrabrost >= 0 && hrabrost <= 100) {
            this.hrabrost = hrabrost;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public static void comparePropertiesGriffendor(Gryffindor student1, Gryffindor student2) {
        int powerStudent1 = student1.getBlagorodstvo() + student1.getChest() + student1.getHrabrost();
        int powerStudent2 = student2.getBlagorodstvo() + student2.getChest() + student2.getHrabrost();
        if (powerStudent1 > powerStudent2) {
            System.out.println("Первый ученик Гриффендора сильнее");
        } else if (powerStudent1 < powerStudent2) {
            System.out.println("Второй ученик Гриффендора сильнее");
        } else {
            System.out.println("силы равны");
        }

    }

    public String toString() {
        return "Gryffindor{blagorodstvo=" + this.blagorodstvo + ", chest=" + this.chest + ", hrabrost=" + this.hrabrost + ", transgress=" + this.getTransgress() + ", doMagic=" + this.getDoMagic() + "}";
    }
}
