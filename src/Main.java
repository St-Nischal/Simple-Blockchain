import com.google.gson.GsonBuilder;

import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static ArrayList<Block> blockChain = new ArrayList<>();
    public static int difficulty = 5;

    public static void main(String[] args) {

        blockChain.add(new Block("Hi I am the first block","0"));
        System.out.println("Trying to Mine block 1... ");
        blockChain.get(0).mineBlock(difficulty);

        blockChain.add(new Block("Yo im the second", blockChain.get(blockChain.size()-1).hash));
        System.out.println("Trying to Mine block 2... ");
        blockChain.get(1).mineBlock(difficulty);

        blockChain.add(new Block("Hey im the third block", blockChain.get(blockChain.size()-1).hash));
        System.out.println("Trying to Mine block 3... ");
        blockChain.get(2).mineBlock(difficulty);

        System.out.println("\nBlockchain is Valid: " + isChainValid());

        String blockChainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockChain);
        System.out.println();
        System.out.println(blockChainJson);
    }

    public static Boolean isChainValid(){
        Block curretBlock;
        Block previousBlock;
        String hashTarget = new String(new char[difficulty]).replace('\0','0');

        //Loop through blockchain to check hash
        for (int i = 1; i < blockChain.size(); i++) {
            curretBlock = blockChain.get(i);
            previousBlock = blockChain.get(i - 1);

            //compare registered hash and calculate hash
            if (!curretBlock.hash.equals(curretBlock.calculateHash())) {
                System.out.println("Current Hashes not equal");
                return false;
            }
            //Compare previous hash and registered previous hash
            if (!previousBlock.hash.equals(curretBlock.previousHash))
            {
                System.out.println("Previous Hashes not equal");
                return false;
            }

            //Check if hash is solved
            if(!curretBlock.hash.substring(0, difficulty).equals(hashTarget)){
                System.out.println("This block hasnot been mined");
                return false;
            }
        }

        return true;
    }

}