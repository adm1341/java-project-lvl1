install:
	./gradlew clean install
run-dist:
	./build/install/app/bin/app
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