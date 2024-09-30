package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class Flower {
    private FlowerColor color;
    private int sepalLenght;
    private double price;
    private FlowerType flowerType;
    
    public String getColor(){
        return color.ToString();
    }

    public Flower(Flower flower){
        color = flower.color;
        sepalLenght = flower.sepalLenght;
        price = flower.price;
        flowerType = flower.flowerType;
    }
}
