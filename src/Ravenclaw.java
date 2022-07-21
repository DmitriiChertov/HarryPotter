public class Ravenclaw extends Hogwarts {
    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    private int smart;
    private int wisdom;
    private int wit;
    private int creativity;

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    private int ability() {
        return smart + wisdom + wit + creativity;
    }
    public void compareRavenclaw(Ravenclaw ravenclaw) {
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s %s лучше, чем студент %s %s", getName(),getSurname(), ravenclaw.getName(),ravenclaw.getSurname(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s %s лучше, чем студент %s %s",  ravenclaw.getName(),ravenclaw.getSurname(), getName(),getSurname(), ability2, ability1);
        } else {
            System.out.printf("Студент %s %s такой-же, как и студент %s %s", getName(),getSurname(), ravenclaw.getName(),ravenclaw.getSurname(), ability2, ability1);

        }
    }

    public Ravenclaw(String name, String surname, String faculty, int magic, int distance, int smart, int wisdom, int wit, int creativity) {
        super(name, surname, faculty, magic, distance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return String.format("Студент: %s; эрудиция: %d; мудрость: %d; остроумие: %d; креативность: %d", super.toString(), smart, wisdom, wit, creativity);
    }
}