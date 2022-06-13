import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Person p = new Person();
		
		System.out.println("Write name");
		String name = sc.next();
		p.setName(name);
		System.out.println("Write your last name");
		String name2 = sc.next();
		p.setName2(name2);
		System.out.println("Write your age");
		int age = sc.nextInt();
		p.setAge(age);
		System.out.println("Write your age");
		int age2 = sc.nextInt();
		p.setStartWork(age2);
		
		System.out.println(p);
	}

}
