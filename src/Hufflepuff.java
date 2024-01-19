public class Hufflepuff extends Hogwarts {
    private int hardworking;//трудолюбивы
    private int fidelity;//верность
    private int honest;//честны

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getFidelity() {
        return fidelity;
    }

    public void setFidelity(int fidelity) {
        this.fidelity = fidelity;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }


    public Hufflepuff(String name, int powerOfMagic, int transgression, int hardworking, int fidelity, int honest) {
        super(name, powerOfMagic, transgression);
        this.hardworking = hardworking;
        this.fidelity = fidelity;
        this.honest = honest;
    }


    public void comparingStudentOfTheFaculty(Hufflepuff second) {
        if ((this.getHardworking() + this.getFidelity() + this.getHonest()) > (second.getHardworking() + second.getFidelity() + second.getHonest())) {
            System.out.println(this.getName() + " лучший Пуффендуец чем " + second.getName());
        } else if ((this.getHardworking() + this.getFidelity() + this.getHonest()) == (second.getHardworking() + second.getFidelity() + second.getHonest())) {
            System.out.println(this.getName() + " также хорош как и " + second.getName());
        } else {
            System.out.println(second.getName() + " лучший Пуффендуец чем " + this.getName());
        }

    }

    public void informationAboutStudents() {
        System.out.println("Имя " + getName() + "; сила магии " + getPowerOfMagic() + "; трансгрессия " + getTransgression() + "; трудолюбие- " + getHardworking() + "; верность- " + getFidelity() + "; честь " + getHonest());
    }

    @Override
    public String toString() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", fidelity=" + fidelity +
                ", honest=" + honest +
                ", name='" + name + '\'' +
                ", powerOfMagic=" + powerOfMagic +
                ", transgression=" + transgression +
                '}';
    }
}
