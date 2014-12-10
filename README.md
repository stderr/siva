My attempt at a play-clj game.

## Contents

* `android/src` Android-specific code
* `desktop/resources` Images, audio, and other files
* `desktop/src` Desktop-specific code
* `desktop/src-common` Cross-platform game code
* `ios/src` iOS-specific code

## Building
```
% cd siva/desktop
% lein uberjar
```

## Running
```
% java -jar target/siva-0.0.1-standalone.jar
```
