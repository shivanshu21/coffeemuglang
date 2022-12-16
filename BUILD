load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "ProjectRunner",
    srcs = glob([
        "src/main/java/com/example/Greeting.java",
        "src/main/java/com/example/ProjectRunner.java",
        "src/main/java/com/thread1/MultiThreaded.java",
        "src/main/java/com/thread1/MyRunnable.java",
        ]),
#    deps = [
#        "//src/main/java/com/thread1:MultiThreaded",
#    ],
)

#java_library(
#    name = "MultiThreaded",
#    srcs = glob([
#        "src/main/java/com/thread1/MultiThreaded.java",
#        "src/main/java/com/thread1/MyRunnable.java",
#        ]),
#)