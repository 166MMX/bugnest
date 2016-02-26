    ./gradlew clean
    ./gradlew ':wrap' bootRepackage
    java -jar wrap/build/lib/wrap.jar
    
    ./gradlew ':wrap' build
    java -jar wrap/build/lib/wrap.jar
    
    ./gradlew ':wrap' bootRepackage
    java -jar wrap/build/lib/wrap.jar
