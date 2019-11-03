public class Application {
   public static void main(String[] args) {
	   
	   //Create file names
       String inFilename = "problem2.txt";
       String outFilename = "unique_word_counts.txt";
       
       //Start counter
       DuplicateCounter dc = new DuplicateCounter();
       
       dc.count(inFilename);
       dc.write(outFilename);
   }
}