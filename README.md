# JavaFXGameFramework
A project for an *ultra-lightweight* **JavaFX Game Gramework** developed for 2nd year Computer Science students to implement a practical JavaFX game during the semester.<br/>

The framework is designed to provide a basic structure for students to use to implement a JavaFX game that uses a **Visitor Design Pattern** to *visit* each *GameObject* and have it rendered onto the *GameCanvas*. Thus, the rendering of data is separated from the data stored in the game objects themseves. <br/>
<br/>
The Framework provides:
- A uniform directory and package structure
- A batch file for easy compilation of the project
- *Visitor Design Pattern* interfaces and skeleton classes
  - For more information on the Visitor Design Pattern: https://refactoring.guru/design-patterns/visitor
- Skeleton *JavaFX* classes and methods (including example usage of the *javafx.animation.AnimationTimer*)
  - For more information on JavaFX: https://openjfx.io/
  - **Note**: JavaFX will no longer be contained in *JDK 11* onwards: https://blogs.oracle.com/java/post/the-future-of-javafx-and-other-java-client-roadmap-updates
- Easy keyboard and mouse interaction via the *KMBuffer* class

## Project Design Brief

Utilising your knowledge of Java you are required to produce a single player game. This must be your own work! Plagiarism is not tolerated.
Chosen a specific game category, game subcategory, game genre, and a second design pattern (in addition to the Visitor).
Your game must be presented and played using a JavaFX GUI. Your game can be played with the keyboard and/or mouse. Additionally, instructions on how to play your game must be included and be easily accessible from the GUI.

### File Handling
Your game must make use of textual and binary files with the data being used in a useful way:
- Textual data must be used to create instances of *game.model* classes.
- Binary data must be used for saving and loading a game in progress.

### Structure & Design Patterns
The structure of your game must include the following concepts:
- Inheritance/Abstract classes
- Composition/Aggregation
- Java Interfaces
- Visitor Design Pattern
- Another Design Pattern of your choice (excluding Singleton)
- Menu-bar with associated menu items
- Customised Canvas that will draw the game elements

Additionally your submission must include screen captures (screenshots) of your game for the
following situations:
- Game start - When the game starts what is displayed.
- Game win condition met - When the player wins what is displayed.
- Game lose condition met - When the player loses what is displayed.

### Banned Games
The following types of games (including direct derivatives) are not allowed:
- Card games (Poker, Black Jack, Uno, etc.)
- Textual Quiz games (Trivia or Sudoku or Hangman)
- Memory/Matching Pairs
- Checkers
- Tic-Tac-Toe
- Pong
- Tetris
- Four in a row
- Dots and Boxes
- Slide/Jigsaw Puzzles
- Minesweeper
- Chess
- Towers of Hanoi
- Morabaraba
- Random chance / coin flipping / rock, paper, scissors
- Any Youtube tutorials
- Any tutorial examples
- Any textbook examples

### Bonus
Bonus marks are awarded for exceptional quality and fidelity.<br/>
Usage of images are allowed provided that the resources are referenced correctly.
No bonus marks will be awarded without properly referenced resources/material.

## Mark Sheet
ToDo: Add Marksheet

# Examples
ToDo: Add examples to the docs/examples directory (not given to students)
