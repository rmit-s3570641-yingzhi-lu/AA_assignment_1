import java.util.Random;

public class DataGenerator{

    Random random;

    public DataGenerator() {

        random=new Random(System.currentTimeMillis());
    }

    /**
     * Generate one sample, using sampling with replacement.
     */
    public int sampleWithReplacement() {
        // Implement me!
        return random.nextInt(100000);
    } // end of sampleWithReplacement()

    public int[] generateDataWithReplacement(){

        int[] sampleData= new int[100000];
        for (int i = 0; i < 100000; i++) {
            sampleData[i]=sampleWithReplacement();
        }
        return sampleData;
    }

    public int[] multiSets(int number){
        int[] multiset = new int[number];

        for (int i = 0; i < number; i++) {
            multiset[i]= generateDataWithReplacement()[i];
        }

        return multiset;
    }

    public static void main(String[] args) {



        DataGenerator generator =new DataGenerator();

        int[] samples;
        samples=generator.multiSets(100);

        // print out samples
        if (samples != null) {
            for (int i = 0; i < samples.length; i++) {
                System.out.print(samples[i] + " ");
            }
            System.out.println("");
        }

    }

}