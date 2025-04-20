Simple Java Blockchain Implementation

This is a basic Java implementation of a blockchain that demonstrates the core concepts of blockchain technology.
Overview

The project consists of three main classes:

    Main - Demonstrates the creation of a simple blockchain with 3 blocks

    Block - Represents a single block in the blockchain

    StringUtil - Provides SHA-256 hashing functionality

Features

    Block creation with timestamp

    Cryptographic hashing using SHA-256

    Linking blocks through previous hash references

    Simple proof-of-work system (not included in this basic version)

How to Run

    Make sure you have Java installed on your system

    Compile all Java files:

javac *.java

Run the Main class:

    java Main

Expected Output

The program will output the hash values of three blocks in the chain, demonstrating how each block is cryptographically linked to the previous one.
Dependencies

    Java SE (Standard Edition)

    No external libraries required
