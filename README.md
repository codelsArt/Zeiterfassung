# M223 Punchclock

Folgende Schritte sind notwendig um die Applikation zu erstellen und zu starten: 
1. Stellen Sie sicher, dass OpenJDK 11 oder höher installiert und JAVA_HOME korrekt gesetzt ist.  
2. Installieren Sie (falls noch nicht vorhanden) Apache Maven 3.8.1 oder höher
3. Wechseln Sie auf der Kommandozeile in den Ordner dieser Appliation. 
`cd m223-punchclock-quarkus-localKwtAuth/`
4. Starten Sie die Applikation mit 
```shell script
./mvnw compile quarkus:dev
```
Diese Applikation ist ein Zeiterfassungstool. Ein Arbeiter kann sich registrieren (http://localhost:8080/newArbeiter.html) und sich einloggen (http://localhost:8080/loginPage.html). Danach kann er einen Zeiteintrag erstellen (http://localhost:8080/index.html)
Folgende Dienste stehen während der Ausführung im Profil dev zur Verfügung:

REST-Schnittstelle der Applikation: http://localhost:8080/entries/

Swagger API: http://localhost:8080/q/swagger-ui/

H2 Console: http://localhost:8080/h2/
Datenquelle: jdbc:h2:mem:punchclock
Benutzername: zli
Passwort: zli
