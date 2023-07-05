//import org.opentutorials.iot.Elevator;
//원하는 기능: Elevator call, Security off, Light on
import org.opentutorials.iot.*;

public class Program {
	public static void main(String[] args) {
		String name = "Apple APT 103";
		Elevator myElevator = new Elevator(name);
		// Elevator.java의 멤버 함수 Elevator(String id)를 사용한 것. this(myElevator)._id = "Apple APT 103"이 된다.
		myElevator.callForUp(1);
		// Elevator.java의 멤버 함수 callForUp(int StopFloor)를 사용한 것. Apple APT 103 -> Elevator callForUp stopFloor : 1이 출력됨.
	    
		Security mySecurity = new Security(name);
		// Security.java의 멤버 함수 Security(String id)를 사용한 것.
		mySecurity.off();
		// Security.java의 멤버 함수 off()를 사용한 것.
		
		Lighting myLamp = new Lighting(name + "/ myLamp");
		// Lighting.java의 멤버 함수 Lighting(String id)를 사용한 것.
		// 이 코드로 구현하고픈 기능은 램프를 키는 기능이다. 그렇기에, 램프가 켜졌다는 것을 console에 출력하고 싶은 것.
		myLamp.on();
		// 이를 위해서, myLamp라는 이름의 램프가 켜졌다는 Apple APT 103 / myLamp is Lighting on 을 출력하고 싶은 것.
		
		Lighting floorLamp = new Lighting(name + "/ floorLamp");
		floorLamp.on();
		
		
		
	}
}
