//Author : Najmi Hakim
public class Driver {

	public static void main(String [] arg) {
		//Fish is a data type
		Fish nemo = new Fish(); //nemo is object, Fish is class

		nemo.Swim();
		nemo.color = "red"; // tukar value
		nemo.Swim();

		Fish dory = new Fish();
		dory.Swim();
		dory.color = "yellow"; //tukar value
		dory.Swim();
	}
}