public  class Main {
    public static void main(String[] args) {
        Gryffindor grenger = new Gryffindor("Гермиона Грейнджер",90,100,30,40,25);
        Gryffindor potter = new Gryffindor("Гарри Поттер",70,100,35,30,30);
        Gryffindor uizli = new Gryffindor("Рон Уизли", 65,90,15,60,20);
        Slytherin malfoy = new Slytherin("Драко Малфой",50,75,25,30,30);
        Slytherin montegru = new Slytherin("Грэхэм Монтегю",80,60,15,20,20);
        Slytherin gouyl = new Slytherin("Грегори Гойл",67,100,10,25,25);
        Hufflepuff smit = new Hufflepuff("Захария Смит",50,25,15,30,30);
        Hufflepuff diggory = new Hufflepuff("Седрик Диггори",45,100,20,25,15);
        Hufflepuff finchFletchy = new Hufflepuff("Джастин Финч-Флетчли",75,95,20,40,20);
        Ravenclaw chung = new Ravenclaw("Чжоу Чанг",85,100,15,30,30);
        Ravenclaw putil = new Ravenclaw("Падма Патил",77,100,10,10,10);
        Ravenclaw belby = new Ravenclaw("Маркус Белби",40,50,15,30,30);
        grenger.comparingStudentOfTheFaculty(potter);
        uizli.compareAnyStudents(diggory);
        uizli.informationAboutStudents();
        malfoy.informationAboutStudents();







    }
}