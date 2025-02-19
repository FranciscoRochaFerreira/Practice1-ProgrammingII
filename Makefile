
```
JAVAC=javac
SRC=$(wildcard src/**/*.java)
OUT_DIR=out

all: compile

compile:
	mkdir -p $(OUT_DIR)
	$(JAVAC) -d $(OUT_DIR) $(SRC)

clean:
	rm -rf $(OUT_DIR)
```
