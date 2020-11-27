package lesson1;

public class lesson1 {
    public static void main(String[] args) {
        Act[] members = new Act[3];
        members[0] = new Human(3, 10);
        members[1] = new Robot(6, 5);
        members[2] = new Cat(7, 7);

        Let[] lets = new Let[2];
        lets[0] = new Wall(6);
        lets[1] = new Treadmill(6);

        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                if(!overcome(members[i], lets[j])){
                    System.out.println(members[i].toString() + " выбыл");
                    break;
                }
            }
        }
    }

    public static boolean overcome(Act object, Let let) {
        if(let instanceof Wall){
            return object.run(let.getLength());
        } else {
            return object.jump(let.getLength());
        }
    }

}
