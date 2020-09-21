// 실습 코드를 소개한 파일입니다.
// 정답이 포함되지 않아 컴파일이 되지 않으니
// 반드시 정답을 확인 후 코드를 수정하여 컴파일하기 바랍니다.

// 실행을 위한 코드입니다.
package javaStudy;

public class PersonExam {

    public static void main(String[] args) {
        // Person 클래스에서 String과 int를 매개변수로 받는 생성자를 호출합니다.
        Person person = new Person("사람", 25);
        System.out.println(person.name);
        System.out.println(person.age);
    }
}
