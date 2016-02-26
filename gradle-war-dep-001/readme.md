    # runtime => NPE
    ./gradlew clean
    ./gradlew ':wrap' bootRepackage
    java -jar wrap/build/lib/wrap.jar
    
    # works
    ./gradlew ':wrap' build
    java -jar wrap/build/lib/wrap.jar
    
    # now works too
    ./gradlew ':wrap' bootRepackage
    java -jar wrap/build/lib/wrap.jar

	# list all tasks with task dependencies
    ./gradlew ':wrap:tasks' --all
