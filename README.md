# vulnerable_testing
tool_testing
    implementation 'org.apache.logging.log4j:log4j-core:2.14.1'



dependencies {
    implementation('org.springframework.boot:spring-boot-starter-web') {
        exclude group: 'org.springframework.boot', module: 'spring-boot-starter-logging'
    }
    implementation 'org.springframework.boot:spring-boot-starter-log4j2:2.6.1'
    // No testImplementation dependency
}
