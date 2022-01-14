public class Course {

    String name;
    String code;
    String prefix;
    Teacher teacher;
    int note;
    int evaluationNote;
    int effectRate;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.evaluationNote = 0;
    }

    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.teacher = t;
            System.out.println("İşlem başarılı");
        }else{
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    void printTeacher(){
        if(teacher != null){
            System.out.println(this.name + " dersinin eğitmeni : " + teacher.name);
        }else{
            System.out.println(this.name + " dersine eğitmen ataması yapılmadı.");
        }
    }
}
