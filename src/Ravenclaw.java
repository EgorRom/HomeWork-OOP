public class Ravenclaw extends Hogwarts {
    private int smart;//умны
    private int wise;//мудры
    private int witty;//остроумны

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public Ravenclaw(String name, int powerOfMagic, int transgression, int smart, int wise, int witty) {
        super(name, powerOfMagic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;


    }

    public void comparingStudentOfTheFaculty(Ravenclaw second) {
        if ((this.getWise() + this.getWitty() + this.getSmart()) > (second.getWise() + second.getWitty() + second.getSmart())) {
            System.out.println(this.getName() + " лучший Когтевранец чем " + second.getName());
        } else if ((this.getWise() + this.getWitty() + this.getSmart()) == (second.getWise() + second.getWitty() + second.getSmart())) {
            System.out.println(this.getName() + " также хорош как и " + second.getName());
        } else {
            System.out.println(second.getName() + " лучший Когтевранец чем " + this.getName());
        }

    }

    public void informationAboutStudents() {
        System.out.println("Имя " + getName() + "; сила магии " + getPowerOfMagic() + "; трансгрессия " + getTransgression() + "; ум- " + getSmart() + "; мудрость- " + getWise() + "; остроумие " + getWitty());
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgression=" + transgression +
                '}';
    }
}
