# Assessment 4

## Overview
* This quiz has 5 sections.
	1. fundamentals
		* `VowelUtils`
		* `StringUtils`
	2. arrays
		* `SquareArrayAnalyzer`
		* `TicTacToe`
	3. object orientation
		* `RockPaperScissors`
	4. collections
		* `Lab`
		* `Student`
		* `LabStatus`
	5. generics
		* `ArrayUtility` - Difficult

















## Section 1 - Fundamentals

### VowelUtils

* **Methods to Complete**
	* `Boolean hasVowels(String word)`
		* return `true` if `word` contains `a`, `e`, `i`, `o`, or `u`.
	* `Boolean isVowel(Character character)`
		* return `true` if `character` is `a`, `e`, `i`, `o`, or `u`
	* `Integer getIndexOfFirstVowel(String word)`
		* return the index of the first vowel occurring in `word`
	* `Boolean startsWithVowel(String word)`
		* return `true` if first character of `word` is a vowel


### StringUtils

* **Methods to Complete**
	* `String capitalizeNthCharacter(String str, Integer indexToCapitalize)`
		* return `str` with the character at `indexToCapitalize` capitalized
	* `Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString)`
		* return `true` if `baseString` has `characterToChexFor` at index of `indexOfString`.
	* `String[] getAllSubStrings(String string)`
		* return the _powerset_ of characters of `string`
	* `Integer getNumberOfSubStrings(String input)`
		* return the number of all substrings in `input`



















## Section 2 - Arrays


### Square Array Checker
* Given two arrays `a` and `b` write a method `compare(a, b)` that returns true if the two arrays have the "same" elements, with the same multiplicities. "Same" means, here, that the elements in `b` are the elements in `a` squared, regardless of the order.


#### Example 1 - Valid Array 
```
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 361, 25921, 361, 20736, 361]
```
* `compare(a, b)` returns true because in `b`
	* 121 is the square of 11,
	* 14641 is the square of 121,
	* 20736 the square of 144,
	* 361 the square of 19,
	* 25921 the square of 161,
and so on.



#### Example 2 - Invalid Array 
```
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]
```
`compare(a,b)` returns `false` because in `b` 132 is not the square of any number of `a`.


#### Example 3 - Invalid Array 
```
a = [121, 144, 19, 161, 19, 144, 19, 11]  
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]
```

`compare(a,b)` returns `false` because in `b` 36100 is not the square of any number of `a`.


### TicTacToe
* **Description**
	* The purpose of this class is to create a model of a `TicTacToe` board.
	* To be _homogenous_ means to be of a single type or value.
* **Methods to Complete**
	* `String[] getRow(Integer rowInde)`
		* returns the array representative of the respective row index
	* `String[] getColumn(Integer columnIndex)`
		* returns the array representative of the respective column index
	* `Boolean isRowHomogenous(Integer rowIndex)`
		* returns true if the respective row contains 1 unique value.
	* `Boolean isColumnHomogeneous(Integer columnIndex)`
		* returns true if the respective row contains 1 unique value.
	* `String getWinner()`
		* return the `String` value of a _homogenous_ row, column, or diagnol
	* `String[][] getBoard()`
		* return the array representation of this `TicTacToe` board






















## Section 3 - Object Orientation
### RockPaperScissorsEvaluator

<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/6/67/Rock-paper-scissors.svg/300px-Rock-paper-scissors.svg.png" class="center">

* **Description**
	* Rock paper scissors is a hand game which allows a player to select 1 of 3 states: `ROCK`, `PAPER`, or `SCISSORS`.
	* A player who select `ROCK` will defeat a player who selects `SCISSORS`
	* A player who selects `PAPER` will defeat a player who select `ROCK`
	* A player who selects `SCISSORS` will defeat a player who selects `PAPER`


#### ROCK
* Sample Script

    ```
    // : Given
    RockPaperScissorHandSign rock = RockPaperScissorHandSign.ROCK;
    
    // : When
    RockPaperScissorHandSign winner = rock.getWinner();
    RockPaperScissorHandSign loser = rock.getLoser();
    
    // : Then
    System.out.println(winner);
    System.out.println(loser);
    ```



* Sample Output

    ```
    PAPER
    SCISSORS
    ```

#### PAPER
* Sample Script

    ```
    // : Given
    RockPaperScissorHandSign paper = RockPaperScissorHandSign.PAPER;
    
    // : When
    RockPaperScissorHandSign winner = paper.getWinner();
    RockPaperScissorHandSign loser = paper.getLoser();
    
    // : Then
    System.out.println(winner);
    System.out.println(loser);
    ```



* Sample Output

    ```
    SCISSORS
    ROCK
    ```



#### SCISSORS
* Sample Script

    ```
    // : Given
    RockPaperScissorHandSign scissors = RockPaperScissorHandSign.SCISSORS;
    
    // : When
    RockPaperScissorHandSign winner = scissors.getWinner();
    RockPaperScissorHandSign loser = scissors.getLoser();
    
    // : Then
    System.out.println(winner);
    System.out.println(loser);
    ```



* Sample Output

    ```
    ROCK
    PAPER
    ```








## Section 4 - Collections

### Lab
* **Description**
	* The purpose of this class is to encapsulate a `name` and `LabStatus` for a particular instance of a `Lab`
* **Methods to Complete**
	* `String getName()`
	* `LabStatus getStatus()`
	* `void setStatus(LabStatus status)`

### Student
* **Description**
	* The purpose of this class is to encapsulate and manage a composite `List` of `Lab` objects.
* **Methods to Complete**
	* `Lab getLab(String labName)`
	* `void setLabStatus(String labName, LabStatus status)`
	* `void forkLab(Lab lab)`
	* `LabStatus getLabStatus(String labName)`

### LabStatus
* **Description**
	* The purpose of this class is create enumerations representative of different states of a `Lab` for a particular `Student`.
* **Enumerations to be created**
	* `COMPELTED`, `INCOMPLETE`, `PENDING`





















## Section 5 - Generics
### ArrayUtility
* **Description**
	* The purpose of this class is to create a utility for handling generic array operations.
* **Methods to Complete**
	* `SomeType findOddOccurringValue()`
	* `SomeType findEvenOccurringValue()` 
	* `Integer getNumberOfOccurrences(SomeType valueToEvaluate)`
	* `SomeType[] filter(Function<SomeType, Boolean> predicate)`
