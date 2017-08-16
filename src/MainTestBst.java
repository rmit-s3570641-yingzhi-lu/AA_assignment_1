public class MainTestBst {

    public static void main(String[] args) {

        //test 2
        System.out.println("=========test 2==============");
        BstMultiset<String> b2=new BstMultiset<>();

        b2.add("hello");
        b2.add("bye");
        b2.add("hello");
        b2.preOrderTraverseWithNumber();
        System.out.println("==============");

        System.out.println(b2.search("hello"));
        System.out.println("==============");

        b2.removeOne("hello");
        b2.preOrderTraverseWithNumber();
        System.out.println("==============");

        b2.removeOne("hello");
        b2.preOrderTraverseWithNumber();
        System.out.println("==============");

        System.out.println(b2.search("up"));
        System.out.println("==============");

        System.out.println(b2.search("bye"));
        System.out.println("==============");

        b2.preOrderTraverseWithNumber();




       //test 1
        BstMultiset<String> b1=new BstMultiset<>();
        System.out.println("=========test 1==============");
        b1.add("robot");
        b1.add("fortune");
        b1.add("macbook");
        b1.add("robot");
        b1.preOrderTraverseWithNumber();
        System.out.println("==============");


       System.out.println(b1.search("robot"));
        System.out.println("==============");

        System.out.println(b1.search("book"));
        System.out.println("==============");

        b1.add("macbook");
        b1.add("macbook");
        b1.add("fortune");
        b1.preOrderTraverseWithNumber();
        System.out.println("==============");

        b1.removeOne("fortune");
        b1.preOrderTraverseWithNumber();
        System.out.println("==============");



       //test3
        System.out.println("=========test 3==============");

        BstMultiset<String> b3=new BstMultiset<>();

        b3.add("shoe");
        b3.add("shoe");
        b3.add("foot");
        b3.add("shoe");
        b3.add("cream");
        b3.preOrderTraverseWithNumber();
        System.out.println("==============");

        b3.removeAll("shoe");
        b3.preOrderTraverseWithNumber();
        System.out.println("==============");

        System.out.println(b3.search("shoe"));
        System.out.println("==============");

        b3.add("shoe");
        b3.add("foot");
        b3.preOrderTraverseWithNumber();
        System.out.println("==============");

        b3.removeAll("foot");
        b3.preOrderTraverseWithNumber();
        System.out.println("==============");

        b3.removeAll("foot");
        b3.preOrderTraverseWithNumber();
        System.out.println("==============");

        b3.removeOne("foot");
        b3.preOrderTraverseWithNumber();
        System.out.println("==============");



    }
}
