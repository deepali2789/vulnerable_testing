# vulnerable_testing
tool_testing
    implementation 'org.apache.logging.log4j:log4j-core:2.14.1'
org.apache.commons:commons-text:1.9 (CVE-2022-42889 “Text4Shell”)
org.yaml:snakeyaml:1.32 (CVE-2022-1471, unsafe constructor/deserialization patterns)
commons-collections:commons-collections:3.2.1 (deserialization gadget risk; often flagged)
org.apache.struts:struts2-core:2.3.31 (CVE-2017-5638, Struts RCE)
org.apache.tomcat.embed:tomcat-embed-core:9.0.30 (CVE-2020-1938 “Ghostcat”)
org.apache.shiro:shiro-core:1.2.4 (CVE-2016-4437, “rememberMe” deserialization)
com.thoughtworks.xstream:xstream:1.4.10 (deserialization RCE class of issues; frequently flagged)
