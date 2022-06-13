
public class Person {
	private String name;
	private String name2;
	private int age;
	private int startWork;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) throws RuntimeException {		
		if(!name.matches("[а-яА-Я]+")) {
			throw new RuntimeException("Don't use symbols other than letters");
		}else {
			this.name = name;	
		}
	}
	
	
	public String getName2() {
		return name2;
	}
	public void setName2(String name2) throws RuntimeException {
		if(!name2.matches("[а-яА-Я]+")) {
			throw new RuntimeException("Don't use symbols other than letters");
		}else {
			this.name2 = name2;
		}
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws RuntimeException{
		if ((2022 - age )< 18 || (2022 - age ) > 80) {
			throw new RuntimeException("You do not work if you are under 18 and if you are over 80");
		}else {
			this.age = age;
		}
	}
	
	
	public int getStartWork() {
		return startWork;
	}
	public void setStartWork(int startWork) throws RuntimeException{
		if (startWork > 2022 || (startWork) < (age) || (2022 - startWork ) < 18) {
			throw new RuntimeException("Year from the future or a year before your age");
		}else {
			this.startWork = startWork;
		}
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", name2=" + name2 + ", age=" + age + ", startWork=" + startWork + "]";
	}
	
	
}
