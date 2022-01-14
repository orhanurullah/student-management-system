public class Student {

    String name;
    String stuNo;
    int classes;
    double average;
    boolean isPass;
    Course fizik;
    Course matematik;
    Course kimya;

    Student(String name, String stuNo, int classes, Course fizik, Course matematik, Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.fizik = fizik;
        this.matematik = matematik;
        this.kimya = kimya;
        calcAverage();
        this.isPass = false;
    }

    public void addEvaluationNote(int evalNote, Course course){
        if(course.name.equals("Matematik")){
            this.matematik.note = (int) ((evalNote*0.20) + (this.matematik.note*0.80));
        }
        if(course.name.equals("Fizik")){
            this.fizik.note = (int) ((evalNote*0.30) + (this.fizik.note*0.70));
        }
        if(course.name.equals("Kimya")){
            this.kimya.note = (int) ((evalNote*0.35) + (this.kimya.note*0.65));
        }
    }

    public void addBulExamNote(int mat, int fizik, int kimya){
        if(mat >= 0 && mat <= 100){
            this.matematik.note = mat;
        }
        if(fizik >= 0 && fizik <= 100){
            this.fizik.note = fizik;
        }
        if(kimya >= 0 && kimya <= 100){
            this.kimya.note = kimya;
        }
    }
    public void isPass(){
        if(this.matematik.note == 0 || this.fizik.note == 0 || this.kimya.note == 0){
            System.out.println("Notlar tam girilmemiş. Notları tamamlayın.");
        }else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if(this.isPass){
                System.out.println("Tebrikler! Geçtiniz.");
            }else{
                System.out.println("Kaldınız. Üzgünüm");
            }
        }
    }

    public void calcAverage(){
        this.average = (this.fizik.note + this.matematik.note + this.kimya.note) / 3;
    }

    public boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    public void printNote(){
        System.out.println("=============\n" +
                "Öğrenci : " + this.name +
                "\nMatematik Notu : " + this.matematik.note +
                "\nFizik Notu : " + this.fizik.note +
                "\nKimya Notu : " + this.kimya.note);
    }



}
