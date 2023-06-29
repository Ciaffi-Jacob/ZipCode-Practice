# Quiz 9-3

## Overview
* This quiz has 2 sections.
	1. fundamentals
		* `Calculator`
		* `StringUtils`
	2. arrays
		* `ArrayUtils`





<hr>
<hr>

## Section 1 - Fundamentals

### Calculator
* **Description**
	* The purpose of this class is to create a simple calculator.
* **Methods to Complete**
	* `Double add(Double val1, Double val2)`
		* return the _sum_ of `val1` and `val2`
	* `Double subtract(Double val1, Double val2)`
		* return the _difference_ of `val1` and `val2`
	* `Double divide(Double val1, Double val2)`
		* return the _quotient_ of `val1` and `val2`
	* `Double squareRoute(Double value)`
		* return the _square root_ of `value`
	* `Double square(Double value)`
		* return the _square_ of `value`
	* `Double[] squareRoutes(Double[] values)`
		* return an array of `Double`, containing the square root of each of the elements in `values`.
	* `Double[] squares(Double[] values)`
		* return an array of `Double`, containing the square of each of the elements in `values`.

### StringUtils
* **Description**
	* The purpose of this class is to create utility `String` methods
* **Methods to Complete**
	* `String getMiddleCharacter(String string)`
		* return character at index `string.length()/2` as `String`.
	* `String capitalizeMiddleCharacter(String string)`
		* return near-identical `String` with character at index `string.length()/2` capitalized.
	* `String lowercaseMiddleCharacter(String string)`
		* return near-identical `String` with character at index `string.length()/2` lowercased.
	* `String invertCasing(String string)`
		* return near-identical `String` with each character's casing inverted: Capital letters become lowercase, lowercase letters become lowercase.
	* `Boolean hasDuplicateConsecutiveCharacters(String string)`
		* return `true` if `string` contains two identical characters in adjacent indices.
	* `Boolean removeDuplicateConsecutiveCharacters(String string)`
		* return near-identical `String` with each occurrence of duplicate-adjacent characters removed.
	* `Boolean isIsogram(String string)`
		* return `true` if each `Character` in `string` occurs exactly 1 time.







<hr>
<hr>

## Section 2 - Arrays


### ArrayUtils
* **Description**
	* The purpose of this class is to create a utility for manipulating arrays.
* **Methods to Complete**
	* `String getMiddleElement(String[] values)`
		* return the element at index `values.length/2`
	* `String[] removeMiddleElement(String[] values)`
		* return near-identical array with element at index `values.length/2` removed.
	* `String getLastElement(String[] values)`
		* return element at index `values.length-1`
	* `String[] removeLastElement(String[] values)`
		* return near-identical array with element at index `values.length-1` removed.















<hr>
<hr>
