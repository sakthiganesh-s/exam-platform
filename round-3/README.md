# Round 3 - High-Level Design

Eight Maven projects model five examination services, notification-service, api-gateway, and common-events. Run `mvn spring-boot:run` in a service folder. The gateway runs on port `9000`; services run on `9001`-`9006`.

The REST APIs mirror Round 2 for candidates, exams, questions, answers, and results. `common-events` contains the shared `ExamSubmittedEvent` contract. The API gateway's conceptual route map is in `api-gateway/src/main/resources/gateway-routes.yml`.

Advanced infrastructure is conceptual in [ARCHITECTURE.md](ARCHITECTURE.md).
