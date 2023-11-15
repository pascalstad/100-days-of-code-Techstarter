public class Main {

    public static void main(String[] args) {

        /*for(int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Marry";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }*/

        for(int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Marry";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.classList(recordStudent.classList() + ", Java OCP Exam 829");       no Setter!

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
