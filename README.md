# configuration

## Setup

```
git clone https://github.com/JinpaLhawang/configuration.git
cd configuration
```

## Testing and Building

```
mvn test
mvn package
```

## Running

```
mvn -DCONFIG_URI=file:/Users/nicholaseden-walker/Development/jambudvipa/properties spring-boot:run
```

### Requesting Environment Configuration

http://localhost:8888/env

### Requesting Configuration

http://localhost:8888/account-middle/master
http://localhost:8888/hello-world-middle/master
