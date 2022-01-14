public class Main {

    public static void main(String[] args) {
        Course matematik = new Course("Matematik", "111", "mat");
        Course fizik = new Course("Fizik", "112", "fiz");
        Course kimya = new Course("Kimya", "113", "kim");

        Teacher tMat = new Teacher("Orhan Kılıç", "323232323", "mat");
        Teacher tFiz =  new Teacher("Zehra Aydın", "4403403490", "fiz");
        Teacher tKim = new Teacher("Ahmet Alp", "89238923", "kim");

        matematik.addTeacher(tMat);
        fizik.addTeacher(tFiz);
        kimya.addTeacher(tKim);

        Student st1 = new Student("Mehmet Kara", "100", 1343232, matematik, fizik, kimya);
        st1.addBulExamNote(87, 78, 45);
        st1.isPass();

        Student st2 = new Student("Zeynep Cuma", "101", 1212323, matematik, fizik, kimya);
        st2.addBulExamNote(45, 67, 46);
        st2.isPass();
        System.out.println("******************************");
        st1.addEvaluationNote(20, matematik);
        st1.isPass();

        st2.addEvaluationNote(99, fizik);
        st2.isPass();
    }
}
