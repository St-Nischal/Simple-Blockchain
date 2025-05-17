# Simple Blockchain in Java

This is a basic implementation of a blockchain in Java. It demonstrates key blockchain concepts such as blocks, hashing, mining (proof-of-work), and chain validation.

## 📦 Project Structure

The project contains the following Java classes:

- `Main.java`: Contains the main method that creates and mines the blockchain.
- `Block.java`: Defines the `Block` class, including hash calculation and mining logic.
- `StringUtil.java`: Provides a utility function to hash strings using SHA-256.

## 🧠 How It Works

Each `Block` contains:
- `data`: The content stored in the block.
- `previousHash`: The hash of the previous block.
- `hash`: The current block's hash.
- `timestamp`: When the block was created.
- `nonce`: Used in the mining process.

### Mining

Mining is the process of finding a hash that begins with a certain number of leading zeros (defined by `difficulty`). This simulates the proof-of-work concept.

### Blockchain Validation

The `isChainValid()` method checks that:
- Each block's hash is correctly calculated.
- Each block's `previousHash` matches the previous block’s hash.
- Each block has been properly mined according to the set `difficulty`.

## ▶️ How to Run

1. **Clone or download the repository.**

2. **Make sure you have Java installed.**  
   This project requires **Java 8 or above**.

3. **Compile the files** (you can use your IDE or the command line):

```bash
javac Main.java Block.java StringUtil.java

    Run the program:

java Main

You should see the program mine three blocks and output the entire blockchain in JSON format, along with validation messages.
📚 Dependencies

This project uses Google Gson for pretty-printing JSON. You need to include the Gson JAR in your classpath.
Add Gson to Classpath (Command Line):

Download the Gson JAR and include it when compiling and running:

javac -cp gson-2.8.9.jar Main.java Block.java StringUtil.java
java -cp .:gson-2.8.9.jar Main

(Replace : with ; on Windows.)
🛠 Features

    Simple proof-of-work algorithm (mining)

    Blockchain integrity check

    SHA-256 hashing

    JSON output of the blockchain

🚀 Future Improvements

    Add transaction and wallet classes

    Introduce digital signatures (public/private key cryptography)

    Peer-to-peer networking
