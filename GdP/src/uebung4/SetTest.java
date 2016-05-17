package uebung4;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Person> s = new HashSet<>();
		s.add(new Person("Tim"));
		s.add(new Person("Charlotte"));
		s.add(new Person("Tim"));;
		s.add(new Person("Dome"));
		String a = "Tim";
		String b = "Tim";
		System.out.println(a.hashCode() +"\t"+b.hashCode());
	}
}
