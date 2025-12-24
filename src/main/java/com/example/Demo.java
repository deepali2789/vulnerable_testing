plugins {
    id 'java'
    id 'maven-publish'
}
 
group = 'com.example'
version = '1.0.0'
 
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(8)
    }
}
 
repositories {
    maven {
        url = uri("${artifactoryUrl}/maven-virtual")
        credentials {
            username = artifactoryUser
            password = artifactoryApiKey
        }
    }
}
 
dependencies {
 
    // 🔴 CRITICAL CVE – Log4Shell
    implementation 'org.apache.logging.log4j:log4j-core:2.14.1'
 
    // 🔴 Deserialization vulnerability
    implementation 'commons-collections:commons-collections:3.2.1'
 
    // 🟠 Older dependency
    implementation 'com.google.code.gson:gson:2.8.5'
 
    // 🔴 GPL license testing
    implementation 'org.gnu.glpk:glpk-java:1.12.0'
 
    // 🔴 Test-scope vulnerability
    testImplementation 'junit:junit:4.12'
}
 
publishing {
    publications {
        mavenJava(MavenPublication) {
            from components.java
            groupId = 'com.example'
            artifactId = 'jfrog-curation-test'
            version = '1.0.0'
        }
    }
 
    repositories {
        maven {
            url = uri("${artifactoryUrl}/maven-release")
            credentials {
                username = artifactoryUser
                password = artifactoryApiKey
            }
        }
    }
}
 
