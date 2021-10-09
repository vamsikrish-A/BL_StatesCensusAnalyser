public class StateCensusAnalyser {
    public static void main(String[] args) throws Exception{
        System.out.println("Welcome to Census Analyser.");

        String fileName = "src/main/java/StateCensusData.csv";

        ReadOperations readOperations = new ReadOperations();
        readOperations.readData(fileName);
        System.out.println("\n Number of lines in csv File: "+ readOperations.readDataCount(fileName));
    }
}
