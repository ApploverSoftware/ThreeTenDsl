# ThreeTenDsl
A simple Kotlin DSL for LocalDateTime as per ThreeTenABP by JakeWharton

# Usage
In the Application class of your app add the following line to the onCreate method (you will need to import the method)
``` Kotlin
initThreeTenDsl()
```

Using the one of the DSL scope methods [date, time, dateTime, timeOrNull, dateOrNull, dateTimeOrNull] the infix function based syntax provides a way to created LocalDateTime, LocalDate and LocalTime object in a natural language. Some examples of possible usage:

``` Kotlin
date { 14 September 2019 }.apply(::println)
time { 15 h 40 m 12 }.apply(::println)
dateTime { 8 h 0 m 0 on 12 October 1950 }.apply(::println)
dateTime { 31 January 2000 at 12 h 40 m 59 }.apply(::println)

timeOrNull { 16 h 40 }?.let {
    dateTime { it on date { 2 December 1990 } }.apply(::println)
}

dateTimeOrNull { date { 1 April 2015 } at time { 4 h 79 m 50 } }?.apply {
    println(this.nano)
}
```

# Using in your project
In module-level build.gradle add the dependency
``` Groovy
implementation 'pl.applover:threetendsl:0.2.1'
```

# Uploading a new version (for Applover's devs)

- In module-level build.gradle bump the library version
``` Groovy
libraryVersion = '1.2.3'
```
- Create a new version on bintray (https://bintray.com/applover/ThreeTenDsl/threetendsl). Make sure it matches the version specified in build.gradle

- In local.properties put the bintray username and Api Key (https://bintray.com/profile/edit -> API Key)
```
bintray.user=applover
bintray.apikey=<copied from bintray>
```

- In Android Studio terminal or the base directory in the project execute
``` bash
./gradlew bintrayUpload
```
