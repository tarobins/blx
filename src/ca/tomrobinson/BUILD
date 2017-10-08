proto_library(
    name = "person_proto",
    srcs = ["proto/person.proto"]
)

java_proto_library(
    name = "person_java_proto", 
    deps = [":person_proto"]
)

java_binary(
    name = "tomrobinson",
    main_class = "ca.tomrobinson.Main",
    srcs = glob(["*.java"]),
    deps = ["@com_google_guava_guava//jar", 
            ":person_java_proto"]
)

