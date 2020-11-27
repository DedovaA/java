package lesson1;

public class Robot implements Act{
    private int jumpLength;
    private int runLength;

    public Robot(int jumpLength, int runLength) {
        this.jumpLength = jumpLength;
        this.runLength = runLength;
    }

    @Override
    public boolean run(int length) {
        if (length <= runLength) {
            System.out.println("робот пробежал");
            return true;
        } else {
            System.out.println("робот не добежал");
            return false;
        }
    }

    @Override
    public boolean jump(int length) {
        if (length <= jumpLength) {
            System.out.println("робот перепрыгнул");
            return true;
        } else {
            System.out.println("робт не допрыгнул");
            return false;
        }
    }

    @Override
    public String toString (){
        return "робот";
    }
}
