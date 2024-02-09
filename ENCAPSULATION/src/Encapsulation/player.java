package Encapsulation;

public class player {
    public String name;
    public int health;
    public String weapon;

    public void looseHealth(int damage){
        this.health =this.health - damage;
        if(this.health <= 0){
            System.out.println("Player Knocked out");
            //reduce number of lives
        }
    }
    public  int healthRemaining(){

        return this.health;
    }
}
