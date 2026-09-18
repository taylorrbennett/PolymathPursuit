# Polymath Pursuit 🎓🧠

*A two-player trivia game where each player chooses their own interest.*

---

## Overview

**Polymath Pursuit** is a two-player trivia game built in Java that allows players to choose their preferred trivia category. Traditional trivia games, players have less control of what questions are being asked. 

The project was developed as part of my MSc Computer Science dissertation at Birkbeck, University of London. It focused on Java application development, object-oriented programming, game design, database integration, and graphical user interface development.

---

## Features

### ☕ Built with Java

This project used small classes with separate responsibilities and was developed in Java using object-oriented programming. 

### ⏱️ Timed Questions

Each question has a 15-second timer. Once the timer runs out, the current player gets no points, and the next player starts. 

### ❓ Category-Based Questions

Each player chooses a trivia category before the game begins. Questions are loaded and randomized from the categories. 

Categories include:
- History
- Reality TV
- Art
- Computers

### 🏆 Scoring System

Players receive one point for correctly answering a question. Current scores are displayed during the game. Final scores are displayed at the end of the game.

### 🎮 Two-Player Gameplay

Polymath Pursuit is designed for two players playing locally on the same device. 


## Technologies Used

- Java
- Java Swing
- SQLite
- JDBC
- JUnit
- IntelliJ IDEA
- Git and GitHub

---

## Project Structure

The application is separated into small classes. 

- `Main` – starts the application.
- `GameGUI` – creates and manages the GUI.
- `Gameplay` – manages the main game logic and player turns.
- `User` – represents a player.
- `Scoring` – manages player scores.
- `Category` – stores the available trivia categories.
- `QuestionSetup` – represents an individual trivia question.
- `QuestionsFromSql` – retrieves questions from the SQLite database.
- `TimerForQuestions` – manages the countdown timer.
- `StartScreen` – allows players to enter their names.
- `CategoryScreen` – allows players to select categories.
- `QuestionScreen` – displays questions and answer choices.
- `FinalScreen` – displays final scores and the game result.
- `WhoWon` – determines the winner or a tie.

---

## How to Run

### Using IntelliJ IDEA

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA.
3. Ensure the project dependencies are available.
4. Ensure `polymath_pursuit.db` is included with the project files.
5. Run the `Main` class.
6. The Polymath Pursuit window will open and the game can begin.

---

## Gameplay

1. Player 1 and Player 2 enter their names.
2. Each player selects a trivia category.
3. Questions are loaded from the SQLite database.
4. Players take turns answering multiple-choice questions.
5. Each question has a 15-second timer.
6. Correct answers increase the player's score.
7. At the end of the game, the final scores and winner are displayed.
8. Players can choose to replay the game.

---

## Dissertation Objectives

The overall aim of Polymath Pursuit was to develop a multiplayer trivia application where players are able to choose their own categories and compete with others to decide who is the closest to being a true polymath.

The main objectives were to implement:

- A range of trivia categories
- Two-player gameplay
- A question timer
- A graphical user interface
- A question database
- A scoring system
- A structure that could support future expansion

---

## Testing

The project was tested throughout development using both manual testing and JUnit automated tests.

Automated testing was used for:

- Scoring
- Gameplay logic
- Correct answer handling
- Timer expiration
- Database question retrieval
- Question limits

The final automated test suite contained seven tests, with all seven passing.

The packaged application was also manually tested through complete games to verify player setup, category selection, questions, scoring, timer behaviour, winner/tie results, and replay functionality.

---

## Future Improvements

Possible future improvements include:

- Additional trivia categories and questions
- Online multiplayer functionality
- Player profiles
- Additional game modes
- Further database expansion

---

## Author

**Taylor Bennett**

MSc Computer Science  
Birkbeck, University of London  
2026

---

## Acknowledgements

Polymath Pursuit was developed as an MSc Computer Science dissertation project at Birkbeck, University of London.

---

## Licence

This project was created for academic purposes as part of an MSc Computer Science dissertation.
