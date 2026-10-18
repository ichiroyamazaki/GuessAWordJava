# GuessAWordJava

A simple **Word Guessing Game** developed in Java. This console application challenges players to discover a randomly selected word by guessing individual letters or entering the complete word.

## Overview

GuessAWordJava reads a list of words from a text file and randomly selects one for each round. The word is initially hidden using question marks (`?`). Players can reveal matching letters or try to guess the entire word.

The game counts incorrect guesses and asks whether the player wants to play another round after completing the current word.

## Features

- **Random word selection** from an external text file.
- **Hidden-word display** using question marks.
- **Letter-by-letter guessing** that reveals matching letters.
- **Whole-word guessing** for players who want to solve the word immediately.
- **Incorrect-attempt tracking** for wrong letters and whole-word guesses.
- **Replay option** to start another round without restarting the program.
- **Input validation** for empty input.

## Technologies Used

- Java
- `Scanner` for console input
- `BufferedReader` and `FileReader` for reading the word list
- `ArrayList` for storing words
- `Random` for selecting a word
- `StringBuilder` for updating the displayed word

## Requirements

- Java Development Kit (JDK)
- A terminal or command prompt
- A text file containing the word list

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/ichiroyamazaki/GuessAWordJava.git
cd GuessAWordJava
```

### 2. Prepare the word list

The current source expects a file named `word.txt` at this Windows location:

```text
C:\Users\Ichiro Yamazaki\Documents\word.txt
```

Create the file at that location and place one word on each line. For example:

```text
java
computer
technology
programming
```

**Note:** The path is hardcoded in the source. If you store `word.txt` elsewhere, update the path in `LabExer6A.java` before running the program.

### 3. Compile the program

The Java source declares the package `LabExer6A`. From the repository root, compile it with:

```bash
javac -d . LabExer6A.java
```

### 4. Run the game

```bash
java LabExer6A.LabExer6A
```

If your IDE manages Java packages automatically, you can also open the source in the IDE and run the `LabExer6A` class.

## How to Play

1. Launch the program.
2. Read the hidden word displayed as question marks.
3. Enter a single letter to reveal its matching positions.
4. Alternatively, enter a complete word to try to solve the puzzle.
5. Continue until the word is revealed or correctly guessed.
6. Enter `Y` when asked to play again, or another response to stop.

### Example

```text
Welcome to the Guessing Game!
Try to guess the word: ????
Enter a letter or guess the whole word:
j
Correct! Guessed word so far: j???
```

*This is an illustrative example. The actual word length and feedback depend on the randomly selected word.*

## Current Limitations

- The word list must be supplied in an external text file.
- The file path is hardcoded to a specific Windows user directory.
- Letter and whole-word comparisons are case-sensitive.
- Repeated incorrect guesses can increase the attempt count again.
- There is no maximum number of attempts or scoring system.
- The program does not currently provide hints or difficulty levels.
- Empty lines in the word file are not filtered out.

## Project Structure

```text
GuessAWordJava/
├── LabExer6A.java
└── README.md
```

The `word.txt` file is an external dependency and must be created separately at the location configured in the source.

## Purpose

This project demonstrates core Java programming concepts, including file handling, collections, random selection, loops, conditional statements, string manipulation, and console input.

## Repository

[https://github.com/ichiroyamazaki/GuessAWordJava](https://github.com/ichiroyamazaki/GuessAWordJava)
