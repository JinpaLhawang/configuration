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
mvn -DCONFIG_URI=file:/Users/nicholaseden-walker/Development/jambudvipa/configuration spring-boot:run
```

### Requesting Environment Configuration

```
curl -i http://localhost:8888/env
```

### Requesting Configuration

```
curl -i http://localhost:8888/configuration/master
curl -i http://localhost:8888/hello-world-middle/master
```
