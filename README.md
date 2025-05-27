# 📚 BookTrackr – AI-Powered Book Logging & Recommendations

> A smart, personal library tracker that helps you log books you’ve read, rate them, and get AI-based recommendations for what to read next.

## 🧭 Table of Contents

- [About](#about)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Architecture](#architecture)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

---

## 📖 About

**BookTrackr** is a modern, minimalistic app that lets you:

- Log books you've read or are currently reading  
- Rate them using a simple star-based system  
- Leverage AI to get smart book recommendations based on your reading habits and preferences

Perfect for readers who want to keep a reading journal and get personalized suggestions without the clutter of traditional platforms.

---

## 🚀 Features

- 📚 Add/edit/delete books from your personal list
- ⭐ Rate books with a 1–5 star system
- 🤖 AI-powered book recommendations
- 🔍 Filter/search books by title, author, or genre
- 🧼 Clean, responsive UI
- 🐳 Dockerized setup for easy deployment

---

## 🛠️ Tech Stack

| Layer         | Technology                                  |
|---------------|---------------------------------------------|
| Frontend      | Jetpack Compose (Android)                   |
| Backend       | Spring Boot / FastAPI (planned for AI)      |
| Database      | PostgreSQL                                  |
| AI Services   | OpenAI API / Embedding models (TBD)         |
| Infrastructure| Docker, GitHub Actions                      |
| Testing       | JUnit (Kotlin), Espresso (Android UI)       |

---

## ⚙️ Getting Started

### Prerequisites

- Android Studio / JDK 17+
- Docker (optional)
- OpenAI API Key (if using recommendation engine)

### Clone & Run

```bash
# Clone repository
git clone https://github.com/your-username/booktrackr.git
cd booktrackr

# Build and run Android app
./gradlew assembleDebug
```

(Optional)
```bash
# If using backend locally
cd backend
./gradlew bootRun
```

---

## ▶️ Usage

1. Launch the app on your emulator or device
2. Add books you’ve read or are reading
3. Tap to rate and view book details
4. Explore AI-recommended books based on your preferences

---

## 🧱 Architecture

```
📁 booktrackr/
├── app/                  # Android Jetpack Compose UI
├── backend/              # (Planned) API & AI logic
├── data/                 # Local database models
├── domain/               # Core business logic
├── ai/                   # (Planned) AI Recommendation Engine
├── docker-compose.yml
└── README.md
```

Clean architecture with:
- **Presentation Layer (UI)**
- **Domain Layer (Logic)**
- **Data Layer (Room/PostgreSQL)**
- **AI Layer (Embedding & Similarity Matching)**

---

## 🧪 Testing

```bash
# Android unit tests
./gradlew test

# UI tests (Espresso)
./gradlew connectedAndroidTest
```

---

## 🤝 Contributing

1. Fork the repo
2. Create your branch: `git checkout -b feature/my-feature`
3. Commit: `git commit -am 'Add my feature'`
4. Push: `git push origin feature/my-feature`
5. Open a Pull Request

---

## 📄 License

MIT License.  
See the [LICENSE](LICENSE) file for details.
