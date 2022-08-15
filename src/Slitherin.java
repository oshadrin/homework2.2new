public class Slitherin extends Hogwarts {
    private int hitrost;
    private int reshitelnost;
    private int ambitsioznost;

    public Slitherin(int transgress, int doMagic, int hitrost, int reshitelnost, int ambitsioznost) {
        super(transgress, doMagic);
        this.hitrost = hitrost;
        this.reshitelnost = reshitelnost;
        this.ambitsioznost = ambitsioznost;
    }

    public static void comparePropertiesSlitherin(Slitherin student1, Slitherin student2) {
        int powerStudent1 = student1.getHitrost() + student1.getReshitelnost() + student1.getAmbitsioznost();
        int powerStudent2 = student2.getHitrost() + student2.getReshitelnost() + student2.getAmbitsioznost();
        if (powerStudent1 > powerStudent2) {
            System.out.println("Первый ученик Слизерина сильнее");
        } else if (powerStudent1 < powerStudent2) {
            System.out.println("Второй ученик Слизерина сильнее");
        } else {
            System.out.println("силы равны");
        }

    }

    public int getHitrost() {
        return this.hitrost;
    }

    public int getReshitelnost() {
        return this.reshitelnost;
    }

    public int getAmbitsioznost() {
        return this.ambitsioznost;
    }

    public void setHitrost(int hitrost) {
        if (hitrost >= 0 && hitrost <= 100) {
            this.hitrost = hitrost;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public void setReshitelnost(int reshitelnost) {
        if (reshitelnost >= 0 && reshitelnost <= 100) {
            this.reshitelnost = reshitelnost;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public void setAmbitsioznost(int ambitsioznost) {
        if (ambitsioznost >= 0 && ambitsioznost <= 100) {
            this.ambitsioznost = ambitsioznost;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public String toString() {
        return "Slitherin{hitrost=" + this.hitrost + ", reshitelnost=" + this.reshitelnost + ", ambitsioznost=" + this.ambitsioznost + ", transgress=" + this.getTransgress() + ", doMagic=" + this.getDoMagic() + "}";
    }
}
