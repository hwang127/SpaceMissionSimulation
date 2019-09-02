public class U2 extends Rocket {
    double launchExplodingChance;
    double landExplodingChance;
    U2(){
        rocketWeight=18000;
        cost=120;
        maxWeight=29000;
        launchExplodingChance=0.04;
        landExplodingChance=0.08;
        cargoLimit=11000;
    }
    public boolean launch(){
        double chance=launchExplodingChance*((double) (cargoweight/cargoLimit));
        double a=Math.random();
        System.out.println(a);
        if (a<chance){
            return false;
        }
        return true;
    }
    public boolean land(){
        double chance=landExplodingChance*((double) (cargoweight/cargoLimit));
        double a=Math.random();
        System.out.println(a);
        if (a<chance){
            return false;
        }
        return true;
    }
}

