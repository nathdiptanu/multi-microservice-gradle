    ./gradlew :microservice1:bootRun
    ./gradlew :microservice2:bootRun
    ./gradlew :microservice3:bootRun

    
    ./gradlew runAll
    ./gradlew bootJarAll

    ./gradlew :microservice1:test
    ./gradlew testAll


    ./gradlew dockerBuildMicroservice1
    ./gradlew dockerBuildMicroservice2
    ./gradlew dockerBuildMicroservice3

    ./gradlew dockerRunMicroservice1


✅ 1. Command to Build and Test Only microservice1 (Without Running It)

    ./gradlew :microservice1:clean :microservice1:build

✅ 2. Command to Build and Test Only microservice2 and microservice3

    ./gradlew :microservice2:clean :microservice2:build :microservice3:clean :microservice3:build


🔍 Optional: Skip Tests (If You Want Build Only)
To build without running tests (not your original ask, but useful):

    ./gradlew :microservice1:bootJar -x test

✅ 1. Build Docker Image for Each Microservice (One at a Time)

# For microservice1
    ./gradlew :microservice1:bootJar && docker build -t microservice1:latest ./microservice1

# For microservice2
    ./gradlew :microservice2:bootJar && docker build -t microservice2:latest ./microservice2

# For microservice3
    ./gradlew :microservice3:bootJar && docker build -t microservice3:latest ./microservice3

✅ 2. Build Docker Images for microservice2 and microservice3 Only

    ./gradlew :microservice2:bootJar :microservice3:bootJar \
    && docker build -t microservice2:latest ./microservice2 \
    && docker build -t microservice3:latest ./microservice3



    ./gradlew dockerBuildMicroservice1 dockerRunMicroservice1
    
    # Build and run microservice2 and microservice3
    ./gradlew dockerBuildMicroservice2 dockerBuildMicroservice3
    ./gradlew dockerRunMicroservice2 dockerRunMicroservice3


Build single microservice:

    bazel build //microservice1:Microservice1App

Run tests for single microservice:

    bazel test //microservice1:Microservice1Tests

Build all microservices:

    bazel build //microservice1:Microservice1App //microservice2:Microservice2App //microservice3:Microservice3App

Test all microservices:

    bazel test //microservice1:Microservice1Tests //microservice2:Microservice2Tests //microservice3:Microserv


bazel sync --configure --enable_workspace


    bazel build //microservice1:Microservice1Application --enable_bzlmod


to use bazel cache and build ,this is used 

    bazel build //microservice1:Microservice1Application --enable_bzlmod --disk_cache=C:/bazel_cache

to run for multiple services 

bazel build //microservice1:Microservice1Application //microservice2:Microservice2Application //microservice3:Microservice3Application --enable_bzlmod --disk_cache=C:/bazel_cache

here i am using local cache and  Artifactory, BuildBarn

to run for tests and build use command

    bazel test //microservice2:Microservice2Application //microservice2:Microservice2ApplicationTests --enable_bzlmod --disk_cache=C:/bazel_cache
    bazel test //microservice1:Microservice1Application //microservice1:Microservice1ApplicationTests --enable_bzlmod --disk_cache=C:/bazel_cache
    bazel build //microservice3:Microservice3Application --enable_bzlmod --disk_cache=C:/bazel_cache

