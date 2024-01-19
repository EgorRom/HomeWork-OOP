abstract class Hogwarts {

    String name;
    int powerOfMagic;
    int transgression;

    public Hogwarts(String name, int powerOfMagic, int transgression) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void compareAnyStudents(Hogwarts second) {
        if (this.getPowerOfMagic() > second.getPowerOfMagic()) {
            System.out.println(this.getName() + " сильнее чем " + second.getName());
        } else if (this.getPowerOfMagic() == second.getPowerOfMagic()) {
            System.out.println(this.getName() + " одинаковой силы с " + second.getName());
        } else {
            System.out.println(second.getName() + " сильнее чем " + this.getName());
        }
        if (this.getTransgression() > second.getTransgression()) {
            System.out.println(this.getName() + " дистанция трансгрессии больше чем у  " + second.getName());
        } else if (this.getTransgression() == second.getTransgression()) {
            System.out.println(this.getName() + " одинаково трансгрессирует с  " + second.getName());
        } else {
            System.out.println(second.getName() + " дистанция трансгрессии больше чем у  " + this.getName());
        }
    }


}













