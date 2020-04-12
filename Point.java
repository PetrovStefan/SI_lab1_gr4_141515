class Point {
	String id;
	String color;
	double x,y;

	//TODO constructor
	Point(){
		System.out.println("This is a no argument constructor");
	}
	//TODO setters and getters

	public void setCoordinates(double x, double y){
		this.x = x;
		this.y = y;
	}

	public void getX(){
		return x;
	}

	public void getY(){
		return y;
	}

	public void setColor(String color){
		this.color = color;
	}

	public void getColor(){
		return color;
	}

	public void move(char xDirection, char yDirection){
		this.x = xDirection;
		this.y = yDirection;
	}

	public void draw(){
		System.out.println(x, " ", y)
	}

	public void move (char xDirection, char yDirection) {
		//TODO
	}

	public void draw () {
		//TODO
	}



}

class Canvas{

	List<Points> koordinati = Array.asList(Point);

	public void addKoordinati(double x, y){
		this.koordinati.add(x, y)
	}

	//converting list to array
	String[] strArray = new String[koordinati.size()];
	strArray = koordinati.toArray(strArray);
	System.out.println(Arrays.toString(strArray))
}