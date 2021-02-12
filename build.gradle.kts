plugins {
    `java-library`
    idea
    eclipse
}

group = "com.wordturtle"
version = "0.0.1"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
repositories {
    mavenCentral()
}

dependencies {
    implementation("edu.stanford.nlp:stanford-corenlp:4.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}