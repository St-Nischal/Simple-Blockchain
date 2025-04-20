//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Block genesisBlock = new Block("Hi I am the first block","0");
        System.out.println("Hash for block 1 : " + genesisBlock);

        Block secondBlock = new Block("Yo im the second", genesisBlock.hash);
        System.out.println("Hash for block 2 :" + secondBlock.hash);

        Block thirdBlock = new Block("Hey im the third block",secondBlock.hash);
        System.out.println("Hash for Block 3 : " + thirdBlock.hash);
    }
}