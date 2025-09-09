# ArmSoft SOAP Client

Java client for integrating with **ArmSoft ՀԾ-Հաշվապահ** accounting system via SOAP web services.  
This module contains the generated classes from the official WSDL, along with example configuration and helper methods for starting and stopping sessions.

---

## Features
- SOAP client generated from ArmSoft WSDL
- Easy integration with Spring Boot
- Example session management (`startSession` / `stopSession`)
- Configurable via Spring profiles

---

## Usage

### Configuration

Register the SOAP client bean in your Spring configuration:

```java
@Configuration
public class ArmSoftConfiguration {

    @Bean
    public ITradeService iTradeService() {
        return new TradeService().getBasicHttpBindingITradeService();
    }
    
}
```

Use the SOAP client bean in your service:

```java
@Service
@RequiredArgsConstructor
public class ArmSoftService{

    private final ITradeService iTradeService;
    private final String username = "your-username";
    private final String password = "your-password";
    private final String dbName   = "your-db";

    private String startSession() {
        log.info("Starting session ArmSoft");
        return iTradeService.startSession(username, password, dbName, "HY-ARM");
    }

    private void stopSession(String sessionId) {
        log.info("Stopping session ArmSoft...");
        iTradeService.stopSession(sessionId);
        log.info("Stopped session ArmSoft");
    }
    
}
```
