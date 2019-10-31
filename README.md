"# java-rmi-test" 

Steps to use it

#Start the rmiserver using the command:
start rmi server 8080

#Compile the java files:
javac *.java

#Create stub from the Remote Implementation Class: 
rmic AddC

#Start the server
java Server

#Start the client
java Client

