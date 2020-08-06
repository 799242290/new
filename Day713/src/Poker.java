import java.util.ArrayList;
import java.util.List;

public class Poker {
    public static void main(String[] args) {
        List<Immortal> list1 = new ArrayList<>();
        list1.add(new Immortal("太乙真人","九龙神火罩"));
        list1.add(new Immortal("惧留孙","捆仙绳"));
        list1.add(new Immortal("文殊道人","遁龙桩"));
        list1.add(new Immortal("燃灯道人","量天尺"));
        list1.add(new Immortal("广成子","番天印"));
        List<Immortal> list2 = new ArrayList<>();
        list2.add(new Immortal("多宝道人","掌中佛国"));
        list2.add(new Immortal("十天君","十绝阵"));
        list2.add(new Immortal("云霄","混元金斗"));
        list2.add(new Immortal("小龙女","雾露乾坤网"));
        list2.add(new Immortal("通天教主","诛仙剑阵"));
    }
}
class Immortal{
    private String name;
    private String machine;

    public Immortal(String name, String machine) {
        this.name = name;
        this.machine = machine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }
}