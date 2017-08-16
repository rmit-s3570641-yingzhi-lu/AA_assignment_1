public class MainTestSorted {

    public static void main(String[] args) {

        //test 2
        System.out.println("=========test 2==============");
        SortedLinkedListMultiset<String> s2=new SortedLinkedListMultiset<>();

        s2.add("hello");
        s2.add("bye");
        s2.add("hello");
        s2.printAllwithNumber();
        System.out.println("==============");

        System.out.println(s2.search("hello"));
        System.out.println("==============");

        s2.removeOne("hello");
        s2.printAllwithNumber();
        System.out.println("==============");

        s2.removeOne("hello");
        s2.printAllwithNumber();
        System.out.println("==============");

        System.out.println(s2.search("up"));
        System.out.println("==============");

        System.out.println(s2.search("bye"));
        System.out.println("==============");

        s2.printAllwithNumber();




       //test 1
        SortedLinkedListMultiset<String> s1=new SortedLinkedListMultiset<>();
        System.out.println("=========test 1==============");
        s1.add("robot");
        s1.add("fortune");
        s1.add("macbook");
        s1.add("robot");
        s1.printAllwithNumber();
        System.out.println("==============");


       System.out.println(s1.search("robot"));
        System.out.println("==============");

        System.out.println(s1.search("book"));
        System.out.println("==============");

        s1.add("macbook");
        s1.add("macbook");
        s1.add("fortune");
        s1.printAllwithNumber();
        System.out.println("==============");

        s1.removeOne("fortune");
        s1.printAllwithNumber();
        System.out.println("==============");



       //test3
        System.out.println("=========test 3==============");

        SortedLinkedListMultiset<String> s3=new SortedLinkedListMultiset<>();

        s3.add("shoe");
        s3.add("shoe");
        s3.add("foot");
        s3.add("shoe");
        s3.add("cream");
        s3.printAllwithNumber();
        System.out.println("==============");

        s3.removeAll("shoe");
        s3.printAllwithNumber();
        System.out.println("==============");

        System.out.println(s3.search("shoe"));
        System.out.println("==============");

        s3.add("shoe");
        s3.add("foot");
        s3.printAllwithNumber();
        System.out.println("==============");

        s3.removeAll("foot");
        s3.printAllwithNumber();
        System.out.println("==============");

        s3.removeAll("foot");
        s3.printAllwithNumber();
        System.out.println("==============");

        s3.removeOne("foot");
        s3.printAllwithNumber();
        System.out.println("==============");



    }
}
