\# Developer Setup Guide



\## 1. Prerequisites



\### Backend

\- Java: 17

\- Maven: 3.8+



\### Frontend

\- Node.js: LTS 16.20.2 (recommended by JHipster)

\- npm: Latest(defalt comw with node 8+)



\### Database (Dev)

\- Use the same DB configured in `application-dev.yml`

\- Ensure DB service is running



---



\## 2. Clone Repository



```bash

git clone <repo-url>

cd <project-folder>

git checkout develop





\## 3. Backend Setup

mvn clean install

mvn spring-boot:run -Dspring.profiles.active=dev





Backend runs on:



http://localhost:8080



\## 4. Frontend Setup

npm install

npm start



Frontend runs on:

http://localhost:4200



\## 5. Branch Workflow (IMPORTANT)

Do NOT push to develop or main

Always create a feature branch:



git checkout -b feature/<short-description>



Push your branch

Create Merge Request → develop









