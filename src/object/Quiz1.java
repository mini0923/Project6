package object;

public class Quiz1 {

	public static void main(String[] args) {
		
		Student student = new Student("둘리", 5000);
		Bus bus = new Bus(100);
		
		Student student2 = new Student("도우너", 10000);
		Subway subway = new Subway("2호선");
		
		student.takeBus(bus);
		student.showInfo();
		bus.showInfo();
		
		student2.takeSubway(subway);
		student2.showInfo();
		subway.showInfo();	
		
	}

}
