import java.util.Date;

public class Block {

    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;
    private int nonce;

    //Block Constructor
    public Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash(); // Making sure we do this after we set the other value
    }

    public String calculateHash(){
        String calculatehash = StringUtil.applySha256(
                previousHash +
                        Long.toString(timeStamp)+
                        Integer.toString(nonce)+
                        data
        );
        return calculatehash;
    }
    public void mineBlock(int difficulty){

        // Creates a string with difficulty * "0"
        String target = new String(new char[difficulty]).replace('\0','0');
        while(!hash.substring(0,difficulty).equals(target))
        {
            nonce++;
            hash = calculateHash();
        }
        System.out.println("Block Mined!!! : " +hash);
    }

}
