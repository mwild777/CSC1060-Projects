public class TryingOutMethods {
    private double currentBlenderCupSize = 2.0;
    public Blender() {}
    public void changeBlenderCupSize(double newCupSize) {
        this.currentBlenderCupSize = newCupSize;
    }
    public void blend() {
        for (int i = 0; i < currentBlenderCupSize; i++){
            System.out.println("brrrrrrrrrrrr");
        }
    }
}
