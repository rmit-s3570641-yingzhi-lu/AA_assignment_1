public class MainTestBst {

    public static void main(String[] args) {

        int number=1000;
        DataGenerator generator=new DataGenerator();

        int[] sample = generator.multiSets(number);

        for (int i = 0; i <10; i++) {
            test(number,sample);
        }

    }

    public static void test(int number,int[] samples){

        BstMultiset<String> linkedListMultiset2=new BstMultiset<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < number; i++) {
            linkedListMultiset2.add(String.valueOf(samples[i]));
        }
        long endTime = System.nanoTime();
        System.out.println("Addition time taken = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");


        startTime = System.nanoTime();
        for (int i = 0; i < number; i++) {
            linkedListMultiset2.removeAll(String.valueOf(samples[i]));
        }
        endTime = System.nanoTime();

        System.out.println("Removal time taken = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");

        System.out.println("");
    }




    /*public static void main(String[] args) {

        //test 2
        System.out.println("=========test 2==============");
        BstMultiset<String> b2=new BstMultiset<>();

        b2.add("hello");
        b2.add("bye");
        b2.add("hello");
        b2.print();
        System.out.println("==============");

        System.out.println(b2.search("hello"));
        System.out.println("==============");

        b2.removeOne("hello");
        b2.print();
        System.out.println("==============");

        b2.removeOne("bye");
        b2.print();
        System.out.println("==============");

        System.out.println(b2.search("up"));
        System.out.println("==============");

        System.out.println(b2.search("bye"));
        System.out.println("==============");

        b2.print();




       //test 1
        BstMultiset<String> b1=new BstMultiset<>();
        System.out.println("=========test 1==============");
        b1.add("robot");
        b1.add("fortune");
        b1.add("macbook");
        b1.add("robot");
        b1.print();
        System.out.println("==============");


       System.out.println(b1.search("robot"));
        System.out.println("==============");

        System.out.println(b1.search("book"));
        System.out.println("==============");

        b1.add("macbook");
        b1.add("macbook");
        b1.add("fortune");
        b1.print();
        System.out.println("==============");

        b1.removeOne("fortune");
        b1.print();
        System.out.println("==============");



       //test3
        System.out.println("=========test 3==============");

        BstMultiset<String> b3=new BstMultiset<>();

        b3.add("shoe");
        b3.add("shoe");
        b3.add("foot");
        b3.add("shoe");
        b3.add("cream");
        b3.print();
        System.out.println("==============");

        b3.removeAll("shoe");
        b3.print();
        System.out.println("==============");

        System.out.println(b3.search("shoe"));
        System.out.println("==============");

        b3.add("shoe");
        b3.add("foot");
        b3.print();
        System.out.println("==============");

        b3.removeAll("foot");
        b3.print();
        System.out.println("==============");

        b3.removeAll("foot");
        b3.print();
        System.out.println("==============");

        b3.removeOne("foot");
        b3.print();
        System.out.println("==============");



    }*/
}
