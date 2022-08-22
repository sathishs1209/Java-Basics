package hlsc.lao.javalearning;

class vehicle {
	 int maxspeed = 200;
}

class car extends vehicle{
	int maxspeed = 100;
}

class main{
	public static void main(String[] args) {
		car c = new car();
		System.out.println(super.maxspeed);
	}
	}
