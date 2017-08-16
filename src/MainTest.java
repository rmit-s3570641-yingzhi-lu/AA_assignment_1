public class MainTest {

    public static void main(String[] args) {

        //test 2
        System.out.println("=========test 2==============");
        LinkedListMultiset<String> linkedListMultiset2=new LinkedListMultiset<>();

        linkedListMultiset2.add("hello");
        linkedListMultiset2.add("bye");
        linkedListMultiset2.add("hello");
        linkedListMultiset2.printAllwithNumber();
        System.out.println("==============");

        System.out.println(linkedListMultiset2.search("hello"));
        System.out.println("==============");

        linkedListMultiset2.removeOne("hello");
        linkedListMultiset2.printAllwithNumber();
        System.out.println("==============");

        linkedListMultiset2.removeOne("hello");
        linkedListMultiset2.printAllwithNumber();
        System.out.println("==============");

        System.out.println(linkedListMultiset2.search("up"));
        System.out.println("==============");

        System.out.println(linkedListMultiset2.search("bye"));
        System.out.println("==============");

        linkedListMultiset2.printAllwithNumber();




        //test 1
        LinkedListMultiset<String> linkedListMultiset1=new LinkedListMultiset<>();
        System.out.println("=========test 1==============");
        linkedListMultiset1.add("robot");
        linkedListMultiset1.add("fortune");
        linkedListMultiset1.add("macbook");
        linkedListMultiset1.add("robot");
        linkedListMultiset1.printAllwithNumber();
        System.out.println("==============");


        System.out.println(linkedListMultiset1.search("robot"));
        System.out.println("==============");

        System.out.println(linkedListMultiset1.search("book"));
        System.out.println("==============");

        linkedListMultiset1.add("macbook");
        linkedListMultiset1.add("macbook");
        linkedListMultiset1.add("fortune");
        linkedListMultiset1.printAllwithNumber();
        System.out.println("==============");

        linkedListMultiset1.removeOne("fortune");
        linkedListMultiset1.printAllwithNumber();
        System.out.println("==============");

        linkedListMultiset1.printAllwithNumber();


        //test3
        System.out.println("=========test 3==============");

        LinkedListMultiset<String> linkedListMultiset3=new LinkedListMultiset<>();

        linkedListMultiset3.add("shoe");
        linkedListMultiset3.add("shoe");
        linkedListMultiset3.add("foot");
        linkedListMultiset3.add("shoe");
        linkedListMultiset3.add("cream");
        linkedListMultiset3.printAllwithNumber();
        System.out.println("==============");

        linkedListMultiset3.removeAll("shoe");
        linkedListMultiset3.printAllwithNumber();
        System.out.println("==============");

        System.out.println(linkedListMultiset3.search("shoe"));
        System.out.println("==============");

        linkedListMultiset3.add("shoe");
        linkedListMultiset3.add("foot");
        linkedListMultiset3.printAllwithNumber();
        System.out.println("==============");

        linkedListMultiset3.removeAll("foot");
        linkedListMultiset3.printAllwithNumber();
        System.out.println("==============");

        linkedListMultiset3.removeAll("foot");
        linkedListMultiset3.printAllwithNumber();
        System.out.println("==============");

        linkedListMultiset3.removeOne("foot");
        linkedListMultiset3.printAllwithNumber();
        System.out.println("==============");

        linkedListMultiset3.printAllwithNumber();


    }
}
