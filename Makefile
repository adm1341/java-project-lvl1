install:
	./gradlew install
run-dist:
	./build/install/java-project-lvl1/bin
check-updates:
	 ./gradlew dependencyUpdates
lint:
	./gradlew checkstyleMain
clean:
	./gradlew clean
build:
	./gradlew clean
	./gradlew build
.PHONY: build