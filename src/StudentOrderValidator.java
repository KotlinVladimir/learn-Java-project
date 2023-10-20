//выпуск 8 17:44
public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }
    static void checkAll(){
        StudentOrder so = readStudentOrder();
        while (so != null) {
            AnswerCityRegister cityAnswer = checkCityRegister(so);
            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
            so = readStudentOrder();
         }
    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return null;
    }


    static AnswerCityRegister checkCityRegister(StudentOrder so){

        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }
    static AnswerWedding checkWedding(StudentOrder so){
        return new AnswerWedding();
    }
    static AnswerChildren checkChildren(StudentOrder so){
        System.out.println("AnswerChildrenn");
        return new AnswerChildren();
    }
    static AnswerStudent checkStudent(StudentOrder so){
        return new AnswerStudent();
    }
    static void sendMail(StudentOrder so){

    }
}
