public abstract class Hogwarts {
    private String name;
    private String surname;
    private String faculty;
    private int magic;
    private int distance;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getMagic() {
        return magic;
    }

    public int getDistance() {
        return distance;
    }

    private int ability() {
        return magic + distance;
    }

    public void print() {
        System.out.println(this);
    }

    public void compareHogwarts(Hogwarts hogwarts) {
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s %s лучше, чем студент %s %s: %d VS %d", getName(), getSurname(), hogwarts.getName(), hogwarts.getSurname(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s %s лучше, чем студент %s %s: %d VS %d", hogwarts.getName(), hogwarts.getSurname(), getName(), getSurname(), ability2, ability1);
        } else {
            System.out.printf("Студент %s %s такой-же, как и студент %s %s: %d VS %d", getName(), getSurname(), hogwarts.getName(), hogwarts.getSurname(), ability2, ability1);

        }
    }

    @Override
    public String toString() {
        return String.format(name + " " + surname + "; " +  "Факультет: " + faculty + "; " + "Сила магии: " + magic + "; Дистанция магии: " + distance);
    }

    public Hogwarts(String name, String surname, String faculty, int magic, int distance ) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.magic = magic;
        this.distance = distance;
    }

}
