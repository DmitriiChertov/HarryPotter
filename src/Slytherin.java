public class Slytherin extends Hogwarts{
    private int trick;
    private int determenation;
    private int ambition;
    private int resourcefulness;
    private int power;

    public int getTrick() {
        return trick;
    }

    public int getDetermenation() {
        return determenation;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getPower() {
        return power;
    }

    private int ability() {
        return trick + determenation + ambition + resourcefulness + power;
    }
    public void compareSlytherin(Slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s %s лучше, чем студент %s %s", getName(), getSurname(), slytherin.getName(), slytherin.getSurname(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s %s лучше, чем студент %s %s", slytherin.getName(), slytherin.getSurname(), getName(), getSurname(),  ability2, ability1);
        } else {
            System.out.printf("Студент %s %s такой-же, как и студент %s %s", getName(), slytherin.getName(), ability2, ability1);

        }
    }

    public Slytherin(String name, String surname, String faculty, int magic, int distance, int trick, int determenation, int ambition, int resourcefulness, int power) {
        super(name, surname, faculty, magic, distance);
        this.trick = trick;
        this.determenation = determenation;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public void setDetermenation(int determenation) {
        this.determenation = determenation;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Студент: %s; хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d; жажда власти: %d", super.toString(), trick, determenation, ambition, resourcefulness, power);
    }
}

