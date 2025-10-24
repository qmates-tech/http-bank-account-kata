## HTTP Bank Account Kata

inspired by codurance.com/katas/bank and github.com/bombo82/cin-cin-que

### Development notes

To start a local postgres instance (needed to locally run app and tests)

```text
$ docker run --rm -p 5432:5432 -e POSTGRES_PASSWORD=mysecretpassword postgres:12.11-alpine 
```

Execute tests with:

```text
$ ./gradlew clean test
```

Start with:

```text
$ ./gradle .....todo
```
