package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<FlowerPack> flowerPacks;
    public Store() {
        flowerPacks = new ArrayList<>();
    }
    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
    public List<FlowerPack> search(Flower flowerSpec) {
        List<FlowerPack> matchingFlowerPacks = new ArrayList<>();        
        for (FlowerPack flowerPack : flowerPacks) {
            Flower flower = flowerPack.getFlower();            
            if (flowerSpec.getFlowerType() != null && flowerSpec.getFlowerType() != flower.getFlowerType()) {
                continue;
            }
            if (flowerSpec.getColor() != null && !flowerSpec.getColor().equals(flower.getColor())) {
                continue;
            }
            if (flowerSpec.getSepalLenght() > 0 && flowerSpec.getSepalLenght() != flower.getSepalLenght()) {
                continue;
            }
            if (flowerSpec.getPrice() > 0 && flowerSpec.getPrice() != flower.getPrice()) {
                continue;
            }
            matchingFlowerPacks.add(flowerPack);
        }
        return matchingFlowerPacks;
    }
}
