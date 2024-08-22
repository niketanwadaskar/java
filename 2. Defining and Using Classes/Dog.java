
public class Dog {
    public int weightInPounds;
    public static String binoman = "Canis familiaris";

    public Dog(int e) {
        this.weightInPounds = e;
    }

    public  void makeNoise (){
        if (weightInPounds < 10) {
			System.out.println("yip!");
		} else if (weightInPounds < 30) {
			System.out.println("bark.");
		} else {
			System.out.println("woooof!");
		}
    }

    public static Dog maxDog(Dog d1, Dog d2){
        if(d1.weightInPounds>d2.weightInPounds){
            return d2;
        }else {
            return d1;
        }
    }
}
