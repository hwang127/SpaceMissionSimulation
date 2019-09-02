public class U1 extends Rocket {
    double launchExplodingChance;
    double landExplodingChance;
    U1(){
        rocketWeight=10000;
        cost=100;
        maxWeight=18000;
        launchExplodingChance=0.5;
        landExplodingChance=0.1;
        cargoLimit=8000;
    }
    public boolean launch(){
        double chance=launchExplodingChance*( ((double)this.cargoweight/(double)this.cargoLimit));
        double a=Math.random();
        System.out.println(chance);
        if (a<chance){
            return false;
        }
        return true;
    }
    public boolean land(){
        double chance=landExplodingChance*((double) ((double)this.cargoweight/(double)this.cargoLimit));
        double a=Math.random();
        //System.out.println(chance);
        if (a<chance){
            return false;
        }
        return true;
    }
}
