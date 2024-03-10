# Shopping Exercise
We hope you have some fun with this exercise. The problem (below) is trying to be relatively simple and focused as we're not trying to challenge your algorithmic abilities. We also want it to be easier for you to fit this in around your spare time.

If you are selected for the next stage in the recruiting process we may pair with you on your code to add functionality to it.

## What We Want To See:
* Your clearest, most communicative, well factored, test-driven code.
* Ideally in Kotlin (Java is acceptable)
* Simple structures for any data repositories, e.g. Lists or Maps. Keep things simple.
* Frequent commits, so that we can see how the tests and implementation evolve
* And, have a little fun with it!

## How to get going
In your terminal:
```
mkdir shopping.surname.firstname
cd shopping.surname.firstname
gradle init
```

You'll be given a series of choices. Choose:
* Project Type: Library
* Language: Java or Kotlin
* Build script DSL: Groovy or Kotlin
* For the remaining choices, you can hit Enter for defaults

Then: 

`git init` 

and commit the initial generated project.  

## How To Submit
Email us a git bundle:

``git bundle create shopping-exercise.bundle main`` 


## The Problem
We want you to implement a Shopping Basket library.
Spend as much time as you feel you want (ideally no more than an hour or two). Feel free to exercise some creative freedom! There's no absolute right or wrong here.

Here are some ideas for the things it could eventually do:
* add items
* remove items
* return the contents
* return the price breakdown.
* items can have VAT applied or not depending on their type


### Example Grocery Items
* Apples 
* Oranges
* Cola Can (Standard Rate VAT: 20%)
* Ice Cream (Standard Rate VAT:20%)
* Bread (Reduced Rate VAT: 5%)
* Fruit Cake (Reduced Rate VAT: 5%)

_(Assume zero-rated for VAT unless otherwise shown)_

Use this as your README, adding any special instructions for running your code wherever you see fit.

## Setup

### Run the build

```shell
./gradlew build
```

### Run the tests
```shell
./gradlew test
```
