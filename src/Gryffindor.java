class Gryffindor extends Hogwarts {
    private int nobility;//благородство
    private int honour;//честь
    private int bravery;//храбрость


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public Gryffindor(String name, int powerOfMagic, int transgression, int nobility, int honour, int bravery) {
        super(name, powerOfMagic, transgression);
        this.honour = honour;
        this.nobility = nobility;
        this.bravery = bravery;


    }


    public void comparingStudentOfTheFaculty(Gryffindor second) {

        if ((this.getBravery() + this.getNobility() + this.getHonour()) > (second.getBravery() + second.getNobility() + second.getHonour())) {
            System.out.println(this.getName() + " лучший Гриффиндорец чем " + second.getName());
        } else if ((this.getBravery() + this.getNobility() + this.getHonour()) == (second.getBravery() + second.getNobility() + second.getHonour())) {
            System.out.println(this.getName() + " также хорош как и " + second.getName());
        } else {
            System.out.println(second.getName() + " лучший Гриффиндорец чем " + this.getName());
        }


    }

    @Override
    public String toString() {
        return "Gryffindor{" +
                ", name='" + name + '\'' +
                "nobility=" + nobility +
                ", honour=" + honour +
                ", bravery=" + bravery +
                ", powerOfMagic=" + powerOfMagic +
                ", transgression=" + transgression +
                '}';
    }

    public void informationAboutStudents() {
        System.out.println("Имя " + getName() + "; сила магии " + getPowerOfMagic() + "; трансгрессия " + getTransgression() + "; благородство " + getNobility() + "; честь " + getHonour() + "; храбрость " + getBravery());
    }

}
