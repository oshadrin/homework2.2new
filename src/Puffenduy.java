public class Puffenduy extends Hogwarts {
    private int trudolubie;
    private int vernost;
    private int chestnost;

    public Puffenduy(int transgress, int doMagic, int trudolubie, int vernost, int chestnost) {
        super(transgress, doMagic);
        this.trudolubie = trudolubie;
        this.vernost = vernost;
        this.chestnost = chestnost;
    }

    public static void comparePropertiesPuffenuy(Puffenduy student1, Puffenduy student2) {
        int powerStudent1 = student1.getTrudolubie() + student1.getVernost() + student1.getChestnost();
        int powerStudent2 = student2.getTrudolubie() + student2.getVernost() + student2.getChestnost();
        if (powerStudent1 > powerStudent2) {
            System.out.println("Первый ученик Пуффендуя сильнее");
        } else if (powerStudent1 < powerStudent2) {
            System.out.println("Второй ученик Пуффендуя сильнее");
        } else {
            System.out.println("силы равны");
        }

    }

    public int getTrudolubie() {
        return this.trudolubie;
    }

    public int getVernost() {
        return this.vernost;
    }

    public int getChestnost() {
        return this.chestnost;
    }

    public void setTrudolubie(int trudolubie) {
        if (trudolubie >= 0 && trudolubie <= 100) {
            this.trudolubie = trudolubie;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public void setVernost(int vernost) {
        if (vernost >= 0 && vernost <= 100) {
            this.vernost = vernost;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public void setChestnost(int chestnost) {
        if (chestnost >= 0 && chestnost <= 100) {
            this.chestnost = chestnost;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public String toString() {
        int var10000 = this.trudolubie;
        return "Puffenduy{trudolubie=" + var10000 + ", vernost=" + this.vernost + ", chestnost=" + this.chestnost + ", transgress=" + this.getTransgress() + ", doMagic=" + this.getDoMagic() + "}";
    }
}
