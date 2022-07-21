import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Gryffindor harry = generateGryffindor("Гарри", "Поттер", "Гриффиндор");
        Gryffindor ron = generateGryffindor("Рон", "Уизли", "Гриффиндор");
        Gryffindor germiona = generateGryffindor("Гермиона", "Грейнджер", "Гриффиндор");
        Hufflepuff zacharia = generateHufflepuff("Захария", "Смитт", "Пуффендуй");
        Hufflepuff sedrick = generateHufflepuff("Седрик", "Диггори", "Пуффендуй");
        Hufflepuff djastin = generateHufflepuff("Джастин", "Финч-Флетчли", "Пуффендуй");
        Slytherin draco = generateSlytherin("Драко", "Малфой", "Слизерин");
        Slytherin gracham = generateSlytherin("Грэхэм", "Монтегю", "Слизерин");
        Slytherin gregory = generateSlytherin("Грэгори", "Гойл", "Слизерин");
        Ravenclaw chjou = generateRavenclaw("Чжоу", "Чанг", "Когтевран");
        Ravenclaw padma = generateRavenclaw("Падма", "Патил", "Когтевран");
        Ravenclaw marcus = generateRavenclaw("Маркус", "Белби", "Когтевран");
        harry.print();
        ron.print();
        germiona.print();
        zacharia.print();
        sedrick.print();
        djastin.print();
        draco.print();
        gracham.print();
        gregory.print();
        chjou.print();
        padma.print();
        marcus.print();
        harry.compareGryffindor(ron);
        System.out.println();
        marcus.compareHogwarts(zacharia);
    }

    private static Gryffindor generateGryffindor(String name, String surname, String faculty) {
        return new Gryffindor(name, surname, faculty, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100));
    }

    private static Hufflepuff generateHufflepuff(String name, String surname, String faculty) {
        return new Hufflepuff(name, surname, faculty, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100));
    }

    private static Slytherin generateSlytherin(String name, String surname, String faculty) {
        return new Slytherin(name, surname, faculty, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100));
    }
    private static Ravenclaw generateRavenclaw(String name, String surname, String faculty) {
        return new Ravenclaw(name, surname, faculty, RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100), RANDOM.nextInt(100));
    }
}
