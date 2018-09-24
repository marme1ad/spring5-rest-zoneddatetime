# spring5-rest-zoneddatetime

_Spring 5_, _Jackson 2.9.6_ (including _JSR-310_) minimal example for _ZonedDateTime_ serialization/deserialization logic.
Quick example for Stack Overflow [question >>](https://stackoverflow.com/questions/52361138/the-request-sent-by-the-client-was-syntactically-incorrect-java-zoneddatetime-ba)

To start tomcat server run next command from the repository root:

```sh
$ mvn org.apache.tomcat.maven:tomcat7-maven-plugin:2.2:run
```

There is only one endpoint implemented (`http://localhost:8080/` based):

| URL | Method | Body |
|:---:|:------:|:----:|
| `/event` | `POST` | ```{ "id": 1, "name": "Test event", "time": "2018-01-01T13:30:00+01:00" }``` |
