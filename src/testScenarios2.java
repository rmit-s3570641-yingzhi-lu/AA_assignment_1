public class testScenarios2 {

    public static void main(String[] args) {

        int number=10000;//加入数组的大小
        int searchTimes= 50;//搜索多少个数据
        DataGenerator dataGenerator=new DataGenerator();

        int[] sample = dataGenerator.multiSets(number);

        int loop =5; //进行多少组数据

        for (int i = 0; i < loop; i++) {
            test(number,sample,searchTimes);
        }

    }

    public static void test(int number,int[] samples,int searchTimes){

        LinkedListMultiset<String> linkedListMultiset2=new LinkedListMultiset<>();


        for (int i = 0; i < number; i++) {
            linkedListMultiset2.add(String.valueOf(samples[i]));
        }

        long startTime = System.nanoTime();

        for (int i = 0; i < searchTimes; i++) {
            linkedListMultiset2.search(String.valueOf(samples[i]));
        }
        long endTime = System.nanoTime();
        System.out.println(number+" 个数据搜索"+searchTimes+"次, DoublelinkedList的数据结构search时间为 = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");



        SortedLinkedListMultiset<String> sortedLinkedListMultiset=new SortedLinkedListMultiset<>();


        for (int i = 0; i < number; i++) {
            sortedLinkedListMultiset.add(String.valueOf(samples[i]));
        }

        startTime = System.nanoTime();

        for (int i = 0; i < searchTimes; i++) {
            sortedLinkedListMultiset.search(String.valueOf(samples[i]));
        }
        endTime = System.nanoTime();
        System.out.println(number+" 个数据搜索"+searchTimes+"次, sortedDoublelinkedList的数据结构search时间为 = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");


        BstMultiset<String> bstMultiset=new BstMultiset<>();


        for (int i = 0; i < number; i++) {
            bstMultiset.add(String.valueOf(samples[i]));
        }

        startTime = System.nanoTime();

        for (int i = 0; i < searchTimes; i++) {
            bstMultiset.search(String.valueOf(samples[i]));
        }
        endTime = System.nanoTime();
        System.out.println(number+" 个数据搜索"+searchTimes+"次, Bst的数据结构search时间为 = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");


        HashMultiset<String> hashMultiset=new HashMultiset<>();


        for (int i = 0; i < number; i++) {
            hashMultiset.add(String.valueOf(samples[i]));
        }

        startTime = System.nanoTime();

        for (int i = 0; i < searchTimes; i++) {
            hashMultiset.search(String.valueOf(samples[i]));
        }

        endTime = System.nanoTime();
        System.out.println(number+" 个数据搜索"+searchTimes+"次, Hash数据结构search时间为 = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");


        BalTreeMultiset<String> balTreeMultiset=new BalTreeMultiset<>();


        for (int i = 0; i < number; i++) {
            balTreeMultiset.add(String.valueOf(samples[i]));
        }

        startTime = System.nanoTime();

        for (int i = 0; i < searchTimes; i++) {
            balTreeMultiset.search(String.valueOf(samples[i]));
        }

        endTime = System.nanoTime();
        System.out.println(number+" 个数据搜索"+searchTimes+"次, BalTree数据结构search时间为 = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");

        System.out.println("=============================================================================================================");

    }
}
