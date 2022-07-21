public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    private int ability() {
        return nobility + honor + bravery;
    }

    public void print() {
        System.out.println(this);
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compareGryffindor(Gryffindor gryffindor) {
        int ability1 = ability();
        int ability2 = gryffindor.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s %s лучше, чем студент %s %s: %d VS %d", getName(), getSurname(), gryffindor.getName(), gryffindor.getSurname(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s %s лучше чем студент %s %s: %d VS %d",  gryffindor.getName(),gryffindor.getSurname(),getName(), getSurname(), ability2, ability1);
        } else {
            System.out.printf("Студент %s %s такой-же, как и студент %s %s: %d VS %d", getName(),getSurname(), gryffindor.getName(),gryffindor.getSurname(), ability1, ability2);

        }
    }

    public Gryffindor(String name, String surname, String faculty, int magic, int distance, int nobility, int honor, int bravery) {
        super(name, surname, faculty, magic, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return String.format("Студент: %s; благородство: %d; честь: %d; храбрость: %d;", super.toString(), nobility, honor, bravery);
    }
}
