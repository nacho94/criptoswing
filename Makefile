
all:
	javac Main.java Criptojuego.java

run: all
	java Main

.PHONY: clean

clean:
	rm -f *.class
