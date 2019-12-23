#!/bin/bash
cd src
javac *.java */*.java
java Main > ../output.txt
echo "File filled!"
rm *.class */*.class
cd ../
