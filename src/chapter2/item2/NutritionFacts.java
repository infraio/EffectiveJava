package chapter2.item2;

public class NutritionFacts {

  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrate;

  public static class Builder {
    // Required parameters
    private final int servingSize;
    private final int servings;
    
    // Optional parameters
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;
    
    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }
    
    public Builder setCalories(int calories) {
      this.calories = calories;
      return this;
    }
    
    public Builder setFat(int fat) {
      this.fat = fat;
      return this;
    }
    
    public Builder setSodium(int sodium) {
      this.sodium = sodium;
      return this;
    }
    
    public Builder setCarbohydrate(int carbohydrate) {
      this.carbohydrate = carbohydrate;
      return this;
    }
    
    public NutritionFacts build() {
      return new NutritionFacts(this);
    }
  }
  
  public NutritionFacts(Builder builder) {
    this.servingSize = builder.servingSize;
    this.servings = builder.servings;
    this.calories = builder.calories;
    this.sodium = builder.sodium;
    this.fat = builder.fat;
    this.carbohydrate = builder.carbohydrate;
  }
  
  public static void main(String[] args) {
    NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).setCalories(100)
        .setSodium(35).setCarbohydrate(27).build();
    System.out.println(cocaCola);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("servingSize: " + servingSize);
    sb.append("\nservings: " + servings);
    sb.append("\ncalories: " + calories);
    sb.append("\nsodium: " + sodium);
    sb.append("\nfat: " + fat);
    sb.append("\ncarbohydrate: " + carbohydrate);
    return sb.toString();
  }
}
