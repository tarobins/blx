maven_jar(
    name = "com_google_guava_guava",
    artifact = "com.google.guava:guava:19.0",
)

# proto_library rules implicitly depend on @com_google_protobuf//:protoc,
# which is the proto-compiler.
# This statement defines the @com_google_protobuf repo.
http_archive(
    name = "com_google_protobuf",
    urls = ["https://github.com/google/protobuf/archive/b04e5cba356212e4e8c66c61bbe0c3a20537c5b9.zip"],
    strip_prefix = "protobuf-b04e5cba356212e4e8c66c61bbe0c3a20537c5b9",
)

# java_proto_library rules implicitly depend on @com_google_protobuf_java//:java_toolchain,
# which is the Java proto runtime (base classes and common utilities).
http_archive(
    name = "com_google_protobuf_java",
    urls = ["https://github.com/google/protobuf/archive/b04e5cba356212e4e8c66c61bbe0c3a20537c5b9.zip"],
    strip_prefix = "protobuf-b04e5cba356212e4e8c66c61bbe0c3a20537c5b9",
)

