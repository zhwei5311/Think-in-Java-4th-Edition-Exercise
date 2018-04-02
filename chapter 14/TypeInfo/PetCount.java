//: typeinfo/PetCount.java
// Using instanceof.
package typeinfo;
import java.util.*;
import static net.mindview.util.Print.*;
import typeinfo.pets.*;
import typeinfo.pets1.Gerbil;
import typeinfo.pets1.ForNameCreator;

public class PetCount {
  static class PetCounter extends HashMap<String, Integer>{
    public void count(String type) {
      Integer quantity = get(type);
      if(quantity == null)
        put(type, 1);
      else
        put(type, quantity + 1);
    }
  }
  public static void
  countPets(PetCreator creator) {
    PetCounter counter= new PetCounter();
    for(Pet pet : creator.createArray(20)) {
      // List each individual pet:
      printnb(pet.getClass().getSimpleName() + " ");
      if(pet instanceof Pet)
        counter.count("Pet");
      if(pet instanceof Dog)
        counter.count("Dog");
      if(pet instanceof Mutt)
        counter.count("Mutt");
      if(pet instanceof Pug)
        counter.count("Pug");
      if(pet instanceof Cat)
        counter.count("Cat");
      if(pet instanceof Manx)
        counter.count("EgyptianMau");
      if(pet instanceof Manx)
        counter.count("Manx");
      if(pet instanceof Manx)
        counter.count("Cymric");
      if(pet instanceof Rodent)
        counter.count("Rodent");
      if(pet instanceof Rat)
        counter.count("Rat");
      if(pet instanceof Mouse)
        counter.count("Mouse");
      if(pet instanceof Hamster)
        counter.count("Hamster");
      if(pet instanceof Gerbil)
        counter.count("Gerbil");
    }
    // Show the counts:
    print();
    print(counter);
  }
  public static void main(String[] args) {
    countPets(new ForNameCreator());
  }
} /* Output:
EgyptianMau Gerbil Cymric EgyptianMau Cymric EgyptianMau Pug Rat Mutt Cymric Manx Manx Manx Cymric EgyptianMau Pug Hamster Cymric Gerbil Pug
{Rat=1, Cymric=8, Gerbil=2, Cat=12, Pet=20, Dog=4, Manx=8, EgyptianMau=8, Pug=3, Rodent=4, Hamster=1, Mutt=1}
*///:~
