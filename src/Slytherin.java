public class Slytherin extends Hogwarts {
    private int trick;//хитрость
    private int determination;//решительность
    private int resourcefulness;//находчивость

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public Slytherin(String name, int powerOfMagic, int transgression, int trick, int determination, int resourcefulness) {
        super(name, powerOfMagic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.resourcefulness = resourcefulness;
    }

    public void comparingStudentOfTheFaculty(Slytherin second) {
        if ((this.getTrick() + this.getDetermination() + this.getResourcefulness()) > (second.getTrick() + second.getDetermination() + second.getResourcefulness())) {
            System.out.println(this.getName() + " лучший Слизеринец чем " + second.getName());
        } else if ((this.getTrick() + this.getDetermination() + this.getResourcefulness()) == (second.getTrick() + second.getDetermination() + second.getResourcefulness())) {
            System.out.println(this.getName() + " также хорош как и " + second.getName());
        } else {
            System.out.println(second.getName() + " лучший Слизеринец чем " + this.getName());
        }

    }

    public void informationAboutStudents() {
        System.out.println("Имя " + getName() + "; сила магии " + getPowerOfMagic() + "; трансгрессия " + getTransgression() + "; хитрость- " + getTrick() + "; решительность- " + getDetermination() + "; находчивость " + getResourcefulness());
    }

    @Override
    public String toString() {
        return "Slytherin{" +
                "trick=" + trick +
                ", determination=" + determination +
                ", resourcefulness=" + resourcefulness +
                ", name='" + getName() + '\'' +
                ", powerOfMagic=" + getPowerOfMagic() +
                ", transgression=" + getTransgression() +
                '}';
    }
}
