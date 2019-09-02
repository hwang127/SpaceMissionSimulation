public class Item {
    String name;
    int weight;
    Item(){}
    Item(String name, String weight){
        this.weight=Integer.parseInt(weight);
        this.name=name;
    }
}
