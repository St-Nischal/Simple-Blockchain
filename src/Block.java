import java.util.Date;

public class Block {

    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;

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
                        data
        );
        return calculatehash;
    }

}
