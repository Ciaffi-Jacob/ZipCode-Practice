# Java Quiz Week 10 day 1

## Overview
* This quiz will measure your understanding of Collections:
	1. collections
		* `WordCounter`
		* `Food` - Difficult
		* `Curry`
		* `Pepper`
		* `Spice`
		* `Ginger`



<hr>
<hr>

##  Collections
### Word Counter
* **Description**
	* The purpose of this class is to manage a mapping of `String` to `Integer`.
	* The class should be able to identify the number times a word has occurred in a given `String` array
		* A _word_ is a series of _characters_ delimited by _spaces_
* **Methods to Complete**
	* `Map<String, Integer> getWordCountMap()`

	
### Food
* **Description**
	* The purpose of this class is to manage a list of `Spice` object.
	* The class should be able to identify the number of specific spice-type applied to an instance of a food.
* **Methods to Complete**
	* `List<Spice> getAllSpices()`
	* `<SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount()`
	* `void applySpice(Spice spice)`

### Curry, Ginger, Pepper
* **Description**
	* The purpose of this class is to create a concrete implementation of a `Spice`
* **Methods to Complete**
	* `String getName()`
