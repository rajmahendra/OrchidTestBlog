import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // Check latest version at https://plugins.gradle.org/plugin/com.eden.orchidPlugin
    id("com.eden.orchidPlugin") version "0.20.0"
    kotlin("jvm") version "1.3.71"
}

project.version = "1"


repositories {
    jcenter()
    mavenLocal()
}

dependencies {
    val orchid_version = "0.20.0"
    orchidImplementation("io.github.javaeden.orchid:OrchidBlog:$orchid_version")
    orchidImplementation("io.github.javaeden.orchid:OrchidCore:$orchid_version")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidPosts:$orchid_version")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidPages:$orchid_version")
    orchidRuntime("io.github.javaeden.orchid:OrchidWiki:$orchid_version")
    //orchidRuntime("io.github.javaeden.orchid:OrchidNetlify:$orchid_version")
    //orchidRuntime("io.github.javaeden.orchid:OrchidNetlifyCMS:$orchid_version")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidPluginDocs:$orchid_version")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidSearch:$orchid_version")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidWritersBlocks:$orchid_version")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidSyntaxHighlighter:$orchid_version")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidTaxonomies:$orchid_version")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidFutureImperfect:$orchid_version")
    orchidRuntimeOnly("io.github.javaeden.orchid:OrchidAsciidoc:$orchid_version")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
