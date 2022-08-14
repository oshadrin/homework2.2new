public class Kogtevran extends Hogwarts {
    private int um;
    private int mudrost;
    private int ostroumie;
    private int tvorchestvo;

    public Kogtevran(int transgress, int doMagic, int um, int mudrost, int ostroumie, int tvorchestvo) {
        super(transgress, doMagic);
        this.um = um;
        this.mudrost = mudrost;
        this.ostroumie = ostroumie;
        this.tvorchestvo = tvorchestvo;
    }

    public static void comparePropertiesKogtevran(Kogtevran student1, Kogtevran student2) {
        int powerStudent1 = student1.getUm() + student1.getMudrost() + student1.getOstroumie() + student1.getTvorchestvo();
        int powerStudent2 = student2.getUm() + student2.getMudrost() + student2.getOstroumie() + student2.getTvorchestvo();
        if (powerStudent1 > powerStudent2) {
            System.out.println("Первый ученик Когтеврана сильнее");
        } else if (powerStudent1 < powerStudent2) {
            System.out.println("Второй ученик Когтеврана сильнее");
        } else {
            System.out.println("силы равны");
        }

    }

    public int getUm() {
        return this.um;
    }

    public int getMudrost() {
        return this.mudrost;
    }

    public int getOstroumie() {
        return this.ostroumie;
    }

    public int getTvorchestvo() {
        return this.tvorchestvo;
    }

    public void setUm(int um) {
        if (um >= 0 && um <= 100) {
            this.um = um;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public void setMudrost(int mudrost) {
        if (mudrost >= 0 && mudrost <= 100) {
            this.mudrost = this.um;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public void setOstroumie(int ostroumie) {
        if (ostroumie >= 0 && ostroumie <= 100) {
            this.ostroumie = ostroumie;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public void setTvorchestvo(int tvorchestvo) {
        if (tvorchestvo >= 0 && tvorchestvo <= 100) {
            this.tvorchestvo = tvorchestvo;
        } else {
            System.out.println("Значение должно быть от 0 до 100");
        }

    }

    public String toString() {
        int var10000 = this.um;
        return "Kogtevran{um=" + var10000 + ", mudrost=" + this.mudrost + ", ostroumie=" + this.ostroumie + ", tvorchestvo=" + this.tvorchestvo + ", transgress=" + this.getTransgress() + ", doMagic=" + this.getDoMagic() + "}";
    }
}
