public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    private int ability() {
        return industriousness + loyalty + honesty;
    }
    public void compareHufflepuff(Hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s %s лучше, чем студент %s %s", getName(), getSurname(), hufflepuff.getName(),hufflepuff.getSurname(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s %s лучше, чем студент %s %s",  hufflepuff.getName(),hufflepuff.getSurname(),getName(), getSurname(), ability2, ability1);
        } else {
            System.out.printf("Студент %s %s такой-же, как и студент %s %s", getName(),getSurname(), hufflepuff.getName(),hufflepuff.getSurname(), ability2, ability1);

        }
    }

    public Hufflepuff(String name, String surname, String faculty, int magic, int distance, int industriousness, int loyalty, int honesty) {
        super(name, surname, faculty, magic, distance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return String.format("Студент: %s; трудолюбие: %d; верность: %d; честность: %d;", super.toString(), industriousness, loyalty, honesty);
    }
}