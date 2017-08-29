public class testScenarios1 {

    public static void main(String[] args) {

        int number=10000;
        int loop= 11;
        DataGenerator dataGenerator=new DataGenerator();

        int[] sample = dataGenerator.multiSets(number);


        for (int i = 0; i <loop; i++) {
            testLinkedList(number,sample);
        }
        System.out.println("========================================");

        for (int i = 0; i <loop; i++) {
            testSortedLink(number,sample);
        }
        System.out.println("========================================");

        for (int i = 0; i <loop; i++) {
            testBst(number,sample);
        }
        System.out.println("========================================");

        for (int i = 0; i <loop; i++) {
            testHash(number,sample);
        }
        System.out.println("========================================");

        for (int i = 0; i <loop; i++) {
            testBalTree(number,sample);
        }
        System.out.println("========================================");


    }

    public static void testLinkedList(int number,int[] samples){

        LinkedListMultiset<String> linkedListMultiset2=new LinkedListMultiset<>();

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

    public static void testSortedLink(int number,int[] samples){

        SortedLinkedListMultiset<String> sortedLinkedListMultiset=new SortedLinkedListMultiset<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < number; i++) {
            sortedLinkedListMultiset.add(String.valueOf(samples[i]));
        }
        long endTime = System.nanoTime();
        System.out.println("Addition time taken = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");


        startTime = System.nanoTime();
        for (int i = 0; i < number; i++) {
            sortedLinkedListMultiset.removeAll(String.valueOf(samples[i]));
        }
        endTime = System.nanoTime();

        System.out.println("Removal time taken = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");

        System.out.println("");
    }

    public static void testBst(int number,int[] samples){

        BstMultiset<String> bstMultiset=new BstMultiset<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < number; i++) {
            bstMultiset.add(String.valueOf(samples[i]));
        }
        long endTime = System.nanoTime();
        System.out.println("Addition time taken = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");


        startTime = System.nanoTime();
        for (int i = 0; i < number; i++) {
            bstMultiset.removeAll(String.valueOf(samples[i]));
        }
        endTime = System.nanoTime();

        System.out.println("Removal time taken = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");

        System.out.println("");
    }

    public static void testHash(int number,int[] samples){

        HashMultiset<String> hashMultiset=new HashMultiset<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < number; i++) {
            hashMultiset.add(String.valueOf(samples[i]));
        }
        long endTime = System.nanoTime();
        System.out.println("Addition time taken = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");


        startTime = System.nanoTime();
        for (int i = 0; i < number; i++) {
            hashMultiset.removeAll(String.valueOf(samples[i]));
        }
        endTime = System.nanoTime();

        System.out.println("Removal time taken = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");

        System.out.println("");
    }

    public static void testBalTree(int number,int[] samples){

        BalTreeMultiset<String> balTreeMultiset=new BalTreeMultiset<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < number; i++) {
            balTreeMultiset.add(String.valueOf(samples[i]));
        }
        long endTime = System.nanoTime();
        System.out.println("Addition time taken = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");


        startTime = System.nanoTime();
        for (int i = 0; i < number; i++) {
            balTreeMultiset.removeAll(String.valueOf(samples[i]));
        }
        endTime = System.nanoTime();

        System.out.println("Removal time taken = " + ((double)(endTime - startTime)) / Math.pow(7, 6) + " ms");

        System.out.println("");
    }






}
