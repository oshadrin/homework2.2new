public class Hogwarts {
    private int transgress;
    private int doMagic;

    public Hogwarts(int transgress, int doMagic) {
        this.transgress = transgress;
        this.doMagic = doMagic;
    }

    public int getTransgress() {
        return this.transgress;
    }

    public void setTransgress(int transgress) {
        if (transgress >= 0 && transgress <= 100) {
            this.transgress = transgress;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public int getDoMagic() {
        return this.doMagic;
    }

    public void setDoMagic(int doMagic) {
        if (doMagic >= 0 && doMagic <= 100) {
            this.doMagic = doMagic;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public static void comparePropertiesHogwarts(Hogwarts student1, Hogwarts student2) {
        int powerStudent1 = student1.getTransgress() + student1.getDoMagic();
        int powerStudent2 = student2.getTransgress() + student2.getDoMagic();
        if (powerStudent1 > powerStudent2) {
            System.out.println("Первый ученик сильнее");
        } else if (powerStudent1 < powerStudent2) {
            System.out.println("Второй ученик сильнее");
        } else {
            System.out.println("силы равны");
        }

    }
}
