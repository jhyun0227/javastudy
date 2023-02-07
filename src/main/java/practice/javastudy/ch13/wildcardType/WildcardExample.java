package practice.javastudy.ch13.wildcardType;

import java.util.Arrays;

public class WildcardExample {

    public static void registerCourse(Course<?> course) { //모든 과정
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));

    }
    public static void registerCourseStudent(Course<? extends Student> course) { //모든 과정
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));

    }
    public static void registerCourseWorker(Course<? super Worker> course) { //모든 과정
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));

    }
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<Person>("일반인과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new Highstudent("고등학생"));

        Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));

        Course<Student> studentCourse = new Course<Student>("학생과정", 5);
        studentCourse.add(new Student("학생"));
        studentCourse.add(new Highstudent("고등학생"));

        Course<Highstudent> highStudentCourse = new Course<>("고등학생과정", 5);
        highStudentCourse.add(new Highstudent("고등학생"));

        //모든 과정 등록
        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

        //직장인과 일반인 과정만 등록 가능
        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
        //registerCourseWorker(studentCourse);
        //registerCourseWorker(highStudentCourse);
        System.out.println();

        //학생 과정만 등록 가능
        //registerCourseStudent(personCourse);
        //registerCourseStudent(workerCourse);
        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);

    }
}
