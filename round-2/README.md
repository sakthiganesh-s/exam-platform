# Round 2 - Low-Level Design

Six independently runnable Spring Boot services use Java 17, Maven, Spring Data JPA, and H2. Run `mvn spring-boot:run` in a service folder. The gateway runs on port `8000`; services run on `8001`-`8005`.

Endpoints:

- `GET/POST /api/candidates`
- `GET/POST /api/exams` (exam details and exam submission data)
- `GET/POST /api/questions` (retrieve questions)
- `GET/POST /api/answers` (submit answers)
- `GET/POST /api/results` (get or submit results)

The API gateway's route map is documented in `api-gateway/src/main/resources/gateway-routes.yml`. H2 Console is available at `http://localhost:<port>/h2-console`.
