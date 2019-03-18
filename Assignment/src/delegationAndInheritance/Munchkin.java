package delegationAndInheritance;
public class Munchkin implements Cats{
    private Cats cats;
    
    @Override
    public void eat(String food) {
                    System.out.println(food + " 는 맛이 없다냥 먼치킨은 치킨이 좋아여");
    }
    public void eatBR( Cats cat , String food) {
                    this.cats = cat;
                    cats.eat(food);
    }
}