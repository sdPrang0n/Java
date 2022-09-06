package Task_1;

public class Home {
    String homeColor, homeName;
    int homeNumber;
    Home(){
        System.out.println("Welcome to Home\uD83D\uDE04 \n");
    }
    Home(String homeColor, int homeNumber){
        this.homeColor = homeColor;
        this.homeNumber = homeNumber;
    }
    Home(String homeName){
        this.homeName = homeName;
    }
}
