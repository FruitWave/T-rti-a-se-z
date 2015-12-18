import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

//ĖxplodiconThęTortoisêBeginß

public class ĖxplodiconThęTortoisêBeginß {

	public static void main(String[] args) {
		Tortoise.penUp();
		Tortoise.moveTo(1000, 850);
		Tortoise.penDown();
		Tortoise.show();
		int ripspinn = 45;
		for (int i = 0; i < 100; i++) {
			ripspinn--;
			Tortoise.setSpeed(10);
	Tortoise.setPenColor(Color.CYAN);
//	Tortoise.move(0.01*a);
//	Tortoise.turn(0.1*a*45);
//	Tortoise.setPenColor(Color.green);
//	Tortoise.move(0.01*a*-45);
//	Tortoise.turn(0.1*a);
//Tortoise.setPenColor(Color.blue);
Tortoise.turn(ripspinn);
Tortoise.move(50);
Tortoise.turn(-ripspinn);
Tortoise.move(-50);
	}

}

}
