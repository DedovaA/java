package lesson1;

public class Human implements Act {
    private int jumpLength;
    private int runLength;

    public Human(int jumpLength, int runLength) {
        this.jumpLength = jumpLength;
        this.runLength = runLength;
    }

    @Override
    public boolean run(int length) {
        if (length <= runLength) {
            System.out.println("человек пробежал");
            return true;
        } else {
            System.out.println("человек не добежал");
            return false;
        }
    }

    @Override
    public boolean jump(int length) {
        if (length <= jumpLength) {
            System.out.println("человек перепрыгнул");
            return true;
        } else {
            System.out.println("человек не допрыгнул");
            return false;
        }
    }

    @Override
    public String toString (){
        return "человек";
    }
}