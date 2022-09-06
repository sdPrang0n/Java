package Task_1;

public class Test {

    public static void main(String[] args) {
	// write your code here
        Home home = new Home("Yellow", 55);
        Home home1 = new Home("White", 105);
        Home home2 = new Home("Ovijat Flat \uD83D\uDE0E");
        Home home3 = new Home();
        System.out.println("Home Details:\n\t");
        System.out.println("Home-Color: " + home.homeColor + "\n\tHome Number: Palace- " + home.homeNumber);
        System.out.println("Home-Name: " + home2.homeName);
    }
}
