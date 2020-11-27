package lesson1;

public class Cat implements Act{
    private int jumpLength;
    private int runLength;

    public Cat(int jumpLength, int runLength) {
        this.jumpLength = jumpLength;
        this.runLength = runLength;
    }

    @Override
    public boolean run(int length) {
        if (length <= runLength) {
            System.out.println("кот пробежал");
            return true;
        } else {
            System.out.println("кот не добежал");
            return false;
        }
    }

    @Override
    public boolean jump(int length) {
        if (length <= jumpLength) {
            System.out.println("кот перепрыгнул");
            return true;
        } else {
            System.out.println("кот не допрыгнул");
            return false;
        }
    }

    @Override
    public String toString (){
        return "кот";
    }
}
