package TH_Sapxep_Compar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30,"Ht");
        Student student1 = new Student("Ha", 26,"Ha");
        Student student2 = new Student("Ki", 31,"Hs");
        Student student3 = new Student("Kie", 32,"Hl");
        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student st : lists) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi");
        for(Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
