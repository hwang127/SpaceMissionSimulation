public class Rocket implements SpaceShip{
    int cost;
    int maxWeight;
    int rocketWeight;
    int cargoLimit=maxWeight-rocketWeight;
    int cargoweight;
    public boolean launch(){
        return true;
    }
    public boolean land(){
        return true;
    }


    public boolean canCarry(Item item) {
       if (item.weight+this.cargoweight>cargoLimit){
           return false;
       }else{
           return true;
       }
    }
    public void carry(Item item){
        cargoweight+=item.weight;
    }
}
