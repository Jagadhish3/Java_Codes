enum Levels{
    EASY,
    MEDIUM,
    HARD,
}

class SetDifficulty{

    Levels level;
    public SetDifficulty(Levels level){
        this.level=level;
    }

    public void setDiff(){
        switch(level){
            case EASY:
                System.out.println("Easy Mode");
                break;
            case MEDIUM:
                System.out.println("Medium Mode");
                break;
            case HARD:
                System.out.println("Hard Mode");
                break;
            default:
                System.out.println("Easy mode in default");
                break;
        }
    }
}

public class Enum {
    public static void main(String[] args) {
        // for(Levels i : Levels.values()){
        //     System.out.println(i);
        // }
        SetDifficulty sd1=new SetDifficulty(Levels.MEDIUM);
        sd1.setDiff();

    }
}
